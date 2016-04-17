package ia.model;

import ia.annotation.Model;
import ia.core.IaConstant;
import ia.entity.TPo;
import ia.entity.TPoDetail;
import ia.entity.TShip;
import ia.entity.custom.TShipCus;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

/**
 * @author gaojian
 *
 */
@Model
public class ShipModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 装箱单列表
	 */
	private List<TShipCus> shipList;
	
	/**
	 * 订单明细列表
	 */
	private List<TPoDetail> poDetail;
	
	/**
	 * 被选中的装箱单
	 */
	private TShipCus[] selected;
	
	/**
	 * 当前装箱单
	 */
	private TShipCus curShip;
	
	
	/**
	 * 被选中的订单明细
	 */
	private TPoDetail[] selectedDetail;
	
	
	/**
	 * 追加用entity
	 */
	private TShip createShip;
	
	
	/**
	 * 当前订单金额合计 
	 */
	private BigDecimal curTotalAmt;
	
	/**
	 * 当前订单数量合计 
	 */
	private Integer curTotalQty;
	
	/**
	 * 当前订单未付款合计
	 */
	private BigDecimal curTotalUnPaid;
	
	/**
	 * 选择订单金额合计 
	 */
	private BigDecimal selectTotalAmt;
	
	/**
	 * 选择订单数量合计 
	 */
	private Integer selectTotalQty;
	
	/**
	 * 选择订单未付款合计
	 */
	private BigDecimal selectTotalUnPaid;
	
	/**
	 * 总销售额
	 */
	private BigDecimal totalPrice;
	
	/**
	 * 总利润
	 */
	private BigDecimal totalProfit;
	
	/**
	 * 检索条件 客户ID
	 */
	private String conCustomerId;
	
	/**
	 * 检索条件 装箱单状态
	 */
	private String conShipState = IaConstant.SHIP_STATE_WAIT;
	
	/**
	 * 检索条件 发货开始日期
	 */
	private Date shipDateFrom;
	
	/**
	 * 检索条件 发货截止日期
	 */
	private Date shipDateTo;
	
	
	
	/**
	 * Model初始化
	 */
	@PostConstruct
	public void init(){
		if(shipList == null){
			shipList = new ArrayList<TShipCus>();
		}
		if(poDetail == null){
			poDetail = new ArrayList<TPoDetail>();
		}
		
	}






	public List<TShipCus> getShipList() {
		return shipList;
	}






	public void setShipList(List<TShipCus> shipList) {
		this.shipList = shipList;
	}






	public List<TPoDetail> getPoDetail() {
		return poDetail;
	}



	public void setPoDetail(List<TPoDetail> poDetail) {
		this.poDetail = poDetail;
	}



	public TShipCus[] getSelected() {
		return selected;
	}



	public void setSelected(TShipCus[] selected) {
		this.selected = selected;
	}



	public TShipCus getCurShip() {
		return curShip;
	}



	public void setCurShip(TShipCus curShip) {
		this.curShip = curShip;
	}



	public TPoDetail[] getSelectedDetail() {
		return selectedDetail;
	}



	public void setSelectedDetail(TPoDetail[] selectedDetail) {
		this.selectedDetail = selectedDetail;
	}



	public TShip getCreateShip() {
		return createShip;
	}



	public void setCreateShip(TShip createShip) {
		this.createShip = createShip;
	}



	public BigDecimal getCurTotalAmt() {
		return curTotalAmt;
	}



	public void setCurTotalAmt(BigDecimal curTotalAmt) {
		this.curTotalAmt = curTotalAmt;
	}



	public Integer getCurTotalQty() {
		return curTotalQty;
	}



	public void setCurTotalQty(Integer curTotalQty) {
		this.curTotalQty = curTotalQty;
	}



	public BigDecimal getCurTotalUnPaid() {
		return curTotalUnPaid;
	}



	public void setCurTotalUnPaid(BigDecimal curTotalUnPaid) {
		this.curTotalUnPaid = curTotalUnPaid;
	}



	public BigDecimal getSelectTotalAmt() {
		return selectTotalAmt;
	}



	public void setSelectTotalAmt(BigDecimal selectTotalAmt) {
		this.selectTotalAmt = selectTotalAmt;
	}



	public Integer getSelectTotalQty() {
		return selectTotalQty;
	}



	public void setSelectTotalQty(Integer selectTotalQty) {
		this.selectTotalQty = selectTotalQty;
	}



	public BigDecimal getSelectTotalUnPaid() {
		return selectTotalUnPaid;
	}



	public void setSelectTotalUnPaid(BigDecimal selectTotalUnPaid) {
		this.selectTotalUnPaid = selectTotalUnPaid;
	}






	public BigDecimal getTotalPrice() {
		totalPrice = BigDecimal.ZERO;
		for(TShipCus obj : shipList){
			totalPrice = totalPrice.add(obj.getItemPriceSum());
		}
		return totalPrice;
	}






	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}






	public BigDecimal getTotalProfit() {
		totalProfit = BigDecimal.ZERO;
		for(TShipCus obj : shipList){
			totalProfit = totalProfit.add(obj.getProfit());
		}
		return totalProfit;
	}






	public void setTotalProfit(BigDecimal totalProfit) {
		this.totalProfit = totalProfit;
	}






	public String getConCustomerId() {
		return conCustomerId;
	}






	public void setConCustomerId(String conCustomerId) {
		this.conCustomerId = conCustomerId;
	}






	public String getConShipState() {
		return conShipState;
	}






	public void setConShipState(String conShipState) {
		this.conShipState = conShipState;
	}






	public Date getShipDateFrom() {
		return shipDateFrom;
	}






	public void setShipDateFrom(Date shipDateFrom) {
		this.shipDateFrom = shipDateFrom;
	}






	public Date getShipDateTo() {
		return shipDateTo;
	}






	public void setShipDateTo(Date shipDateTo) {
		this.shipDateTo = shipDateTo;
	}
	
	
}
