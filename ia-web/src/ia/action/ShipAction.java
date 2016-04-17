package ia.action;

import ia.annotation.Action;
import ia.core.IaConstant;
import ia.entity.TPo;
import ia.entity.TPoDetail;
import ia.entity.TShip;
import ia.entity.custom.TShipCus;
import ia.model.ShipModel;
import ia.service.MasterService;
import ia.service.ShipService;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.apache.commons.beanutils.BeanUtils;

@Action
public class ShipAction {

	@Inject
	ShipService service;

	@Inject
	ShipModel model;

	@Inject
	MasterService masterService;

	/**
	 * 查询
	 */
	public void getAllShip() {
		
		TShip conship = new TShip();
		
		conship.setCustId(model.getConCustomerId());
		conship.setShipState(model.getConShipState());
		
		List<TShipCus> shipList = service.getAllShip(conship);
		
		List<TShipCus> shipListTmp = new ArrayList<TShipCus>();
		List<TShipCus> shipListTmp2 = new ArrayList<TShipCus>();
		
		if(model.getShipDateFrom() != null){
			for(TShipCus obj : shipList){
				if(obj.getShipDate().compareTo(model.getShipDateFrom()) >= 0){
					shipListTmp.add(obj);
				}
			}
		}else{
			shipListTmp.addAll(shipList);
		}
		
		if(model.getShipDateTo() != null){
			for(TShipCus obj : shipListTmp){
				if(obj.getShipDate().compareTo(model.getShipDateTo()) <= 0){
					shipListTmp2.add(obj);
				}
			}
		}else{
			shipListTmp2.addAll(shipListTmp);
		}
		
		model.setShipList(shipListTmp2);

	}

	/**
	 * 新建
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 */
	public void createShip() throws IllegalAccessException, InvocationTargetException{
		TShip ship = new TShip();
		TShipCus shipCus = new TShipCus();
		ship.setShipId(masterService.getShipId());
		if(model.getShipList() == null){
			List<TShipCus> list = new ArrayList<TShipCus>();
			model.setShipList(list);
		}
		ship.setShipDate(new Date());
		ship.setShipState(IaConstant.SHIP_STATE_WAIT);
		ship = service.createShip(ship);
		BeanUtils.copyProperties(shipCus, ship);
		
		shipCus.setItemCostSum(BigDecimal.ZERO);
		shipCus.setItemPriceSum(BigDecimal.ZERO);
		shipCus.setItemQtySum(BigDecimal.ZERO);
		shipCus.setProfit(BigDecimal.ZERO);
		
		model.getShipList().add(shipCus);
		
		masterService.loadShip();
	}


	
	
	/**
	 * 更新订单
	 * 
	 * @param poDetail
	 */
	public void updateShip(TShip ship) {

		if(service.updateShip(ship)== null){
			FacesContext.getCurrentInstance().addMessage("form", new FacesMessage(FacesMessage.SEVERITY_ERROR, "该数据已被其他用户更改，请刷新后重试。",null));
			return ;
		}
		this.getAllShip();
		
		masterService.loadShip();

	}

	
	/**
	 * 订单明细查询
	 */
	public void getAllPoDetail(TShipCus ship) {
		model.getPoDetail().clear();
		model.setPoDetail(service.getAllPoDetail(ship.getShipId()));

		model.setCurShip(ship);

		refresh();

	}


	/**
	 * 更新订单明细
	 * 
	 * @param poDetail
	 */
	public void updatePoDetail(TPoDetail poDetail) {
		TPoDetail oldPoDetail = service.getPoDetailById(poDetail.getPoDId());

		if (!oldPoDetail.getItemId().equals(poDetail.getItemId())) {
			poDetail.setItemPricePay(masterService.getItemById(
					poDetail.getItemId()).getItemPrice());
			poDetail.setItemCost(masterService
					.getItemById(poDetail.getItemId()).getItemCost());
			poDetail.setItemPrice(masterService.getItemById(
					poDetail.getItemId()).getItemPrice());
			poDetail.setItemCost(masterService.getItemById(
					poDetail.getItemId()).getItemCost());
		}
		poDetail.setItemProfit(poDetail.getItemPricePay().subtract(poDetail.getItemCost()));

		if(service.updatePoDetail(poDetail)== null){
			FacesContext.getCurrentInstance().addMessage("form", new FacesMessage(FacesMessage.SEVERITY_ERROR, "该数据已被其他用户更改，请刷新后重试。",null));
			return ;
		}

		refresh();
	}
	
	/**
	 * 各种数字重新计算
	 */
	public void refresh() {
		List<TPoDetail> poDetailList = model.getPoDetail();

		// 金额合计
		BigDecimal totalAmt = BigDecimal.ZERO;
		// 数量合计
		Integer totalQty = 0;
		// 未付款合计
		BigDecimal totalUnPaid = BigDecimal.ZERO;
		//成本合计
		BigDecimal totalCost = BigDecimal.ZERO;

		for (TPoDetail poDetail : poDetailList) {
			totalAmt = totalAmt.add(poDetail.getItemPricePay().multiply(
					new BigDecimal(poDetail.getItemQty())));
			
			totalCost = totalCost.add(poDetail.getItemCost().multiply(
					new BigDecimal(poDetail.getItemQty())));
			
			if(poDetail.getItemId() != null && !poDetail.getItemId().equals("G000074")){//运费不计数
				totalQty = totalQty + poDetail.getItemQty();
			}
			

			if (poDetail.getPayState().equals(IaConstant.PAY_STATE_NO)) {
				totalUnPaid = totalUnPaid.add(poDetail.getItemPricePay()
						.multiply(new BigDecimal(poDetail.getItemQty())));
			}
		}
		model.setCurTotalAmt(totalAmt);
		model.setCurTotalQty(totalQty);
		model.setCurTotalUnPaid(totalUnPaid);
		
		//订单更新
		//model.getCurPo().setItemPriceSum(totalAmt);//金额合计
		//model.getCurPo().setQtySum(totalQty);//数量合计
		//model.getCurPo().setItemCostSum(totalCost);//成本合计
		//利润合计
		
		//this.updatePo(model.getCurPo());
		
	}

	/**
	 * 订单明细被选择事件处理
	 */
	public void poDetailSelect() {

		// 金额合计
		BigDecimal totalAmt = BigDecimal.ZERO;
		// 数量合计
		Integer totalQty = 0;
		// 未付款合计
		BigDecimal totalUnPaid = BigDecimal.ZERO;

		TPoDetail[] selectDetailList = model.getSelectedDetail();
		for (TPoDetail poDetail : selectDetailList) {
			totalAmt = totalAmt.add(poDetail.getItemPricePay().multiply(
					new BigDecimal(poDetail.getItemQty())));
			totalQty = totalQty + poDetail.getItemQty();

			if (poDetail.getPayState().equals(IaConstant.PAY_STATE_NO)) {
				totalUnPaid = totalUnPaid.add(poDetail.getItemPricePay()
						.multiply(new BigDecimal(poDetail.getItemQty())));
			}
		}

		model.setSelectTotalAmt(totalAmt);
		model.setSelectTotalQty(totalQty);
		model.setSelectTotalUnPaid(totalUnPaid);

	}

}
