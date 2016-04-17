package ia.action;

import ia.annotation.Action;
import ia.core.IaConstant;
import ia.entity.TPoDetail;
import ia.model.NeedBuyModel;
import ia.service.MasterService;
import ia.service.PoService;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Action
public class NeedBuyAction {

	@Inject
	PoService service;

	@Inject
	NeedBuyModel model;

	@Inject
	MasterService masterService;

	/**
	 * 订单明细查询
	 */
	public void getAllPoDetail() {
		model.getPoDetail().clear();
		model.setPoDetail(service.getNeedBuy());

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
			poDetail.setItemCost(masterService
					.getItemById(poDetail.getItemId()).getItemCost());
		}
		poDetail.setItemProfit(poDetail.getItemPricePay().subtract(
				poDetail.getItemCost()));

		if (service.updatePoDetail(poDetail) == null) {
			FacesContext.getCurrentInstance().addMessage(
					"form",
					new FacesMessage(FacesMessage.SEVERITY_ERROR,
							"该数据已被其他用户更改，请刷新后重试。", null));
			return;
		}

	}

	/**
	 * 删除订单明细
	 * 
	 * @param poDetail
	 */
	public void deletePoDetail(TPoDetail poDetail) {
		service.deletePoDetail(poDetail);
		model.getPoDetail().remove(poDetail);
	}

	/**
	 * 将选中的订单明细设为已付款
	 */
	public void payPoDetail() {
		TPoDetail[] selectDetailList = model.getSelectedDetail();
		for (TPoDetail poDetail : selectDetailList) {
			poDetail.setPayState(IaConstant.PAY_STATE_YES);
			poDetail = service.updatePoDetail(poDetail);
			service.cumputePo(poDetail.getPoId());
		}
	}

	/**
	 * 将选中的订单明细设为已购买
	 */
	public void buyPoDetail() {
		TPoDetail[] selectDetailList = model.getSelectedDetail();
		for (TPoDetail poDetail : selectDetailList) {
			poDetail.setBuyQty(poDetail.getItemQty());
			poDetail = service.updatePoDetail(poDetail);
		}
	}

}
