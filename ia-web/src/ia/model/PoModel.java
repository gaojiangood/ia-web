package ia.model;

import ia.annotation.Model;
import ia.core.IaConstant;
import ia.entity.TPo;
import ia.entity.TPoDetail;

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
public class PoModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 订单列表
	 */
	private List<TPo> po;
	
	/**
	 * 订单明细列表
	 */
	private List<TPoDetail> poDetail;
	
	/**
	 * 被选中的订单
	 */
	private TPo[] selected;
	
	/**
	 * 当前订单
	 */
	private TPo curPo;
	
	/**
	 * 更新用订单
	 */
	private TPo updatePo;
	
	/**
	 * 订单明细的移动目的订单
	 */
	private TPo moveToPo;
	
	/**
	 * 订单明细的移动目的订单列表
	 */
	private List<TPo> moveToPoList;
	
	/**
	 * 一键装箱用装箱单ID
	 */
	private String fillShipId;
	

	/**
	 * 被选中的订单明细
	 */
	private TPoDetail[] selectedDetail;
	
	private String testInput;
	
	/**
	 * 追加用entity
	 */
	private TPo createPo;
	
	/**
	 * 追加用entity
	 */
	private TPoDetail createPoDetail;
	
	/**
	 * 备注追加用entity
	 */
	private TPoDetail createCommentPoDetail;
	
	
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
	 * 总毛利润
	 */
	private BigDecimal totalProfit;
	
	/**
	 * 检索条件 客户ID
	 */
	private String conCustomerId;
	
	/**
	 * 检索条件 订单状态
	 */
	private String conPoState = IaConstant.PO_STATE_BUY;
	
	/**
	 * 检索条件 订单开始日期
	 */
	private Date poDateFrom;
	
	/**
	 * 检索条件 订单截止日期
	 */
	private Date poDateTo;
	
	
	
	/**
	 * Model初始化
	 */
	@PostConstruct
	public void init(){
		System.out.println("model init");
		createPo = new TPo();
		if(po == null){
			po = new ArrayList<TPo>();
		}
		if(curPo== null){
			curPo = new TPo();
		}
		if(poDetail == null){
			poDetail = new ArrayList<TPoDetail>();
		}
		conPoState = IaConstant.PO_STATE_BUY;
		
	}
	
	

	public List<TPo> getPo() {
		return po;
	}

	public void setPo(List<TPo> po) {
		this.po = po;
	}

	public TPo[] getSelected() {
		return selected;
	}

	public void setSelected(TPo[] selected) {
		this.selected = selected;
	}

	public String getTestInput() {
		return testInput;
	}

	public void setTestInput(String testInput) {
		this.testInput = testInput;
	}

	public TPo getCreatePo() {
		return createPo;
	}

	public void setCreatePo(TPo createPo) {
		this.createPo = createPo;
	}



	public List<TPoDetail> getPoDetail() {
		return poDetail;
	}



	public void setPoDetail(List<TPoDetail> poDetail) {
		this.poDetail = poDetail;
	}



	public TPoDetail[] getSelectedDetail() {
		return selectedDetail;
	}



	public void setSelectedDetail(TPoDetail[] selectedDetail) {
		this.selectedDetail = selectedDetail;
	}



	public TPoDetail getCreatePoDetail() {
		return createPoDetail;
	}



	public void setCreatePoDetail(TPoDetail createPoDetail) {
		this.createPoDetail = createPoDetail;
	}



	public TPo getCurPo() {
		return curPo;
	}



	public void setCurPo(TPo curPo) {
		this.curPo = curPo;
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



	public TPo getMoveToPo() {
		return moveToPo;
	}



	public void setMoveToPo(TPo moveToPo) {
		this.moveToPo = moveToPo;
	}



	public List<TPo> getMoveToPoList() {
		return moveToPoList;
	}



	public void setMoveToPoList(List<TPo> moveToPoList) {
		this.moveToPoList = moveToPoList;
	}



	public BigDecimal getTotalPrice() {
		totalPrice = BigDecimal.ZERO;
		for(TPo obj : po){
			totalPrice = totalPrice.add(obj.getItemPriceSum());
		}
		return totalPrice;
	}



	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}



	public BigDecimal getTotalProfit() {
		totalProfit = BigDecimal.ZERO;
		for(TPo obj : po){
			totalProfit = totalProfit.add(obj.getProfitSum());
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



	public String getConPoState() {
		return conPoState;
	}



	public void setConPoState(String conPoState) {
		this.conPoState = conPoState;
	}



	public Date getPoDateFrom() {
		return poDateFrom;
	}



	public void setPoDateFrom(Date poDateFrom) {
		this.poDateFrom = poDateFrom;
	}



	public Date getPoDateTo() {
		return poDateTo;
	}



	public void setPoDateTo(Date poDateTo) {
		this.poDateTo = poDateTo;
	}



	public TPoDetail getCreateCommentPoDetail() {
		return createCommentPoDetail;
	}



	public void setCreateCommentPoDetail(TPoDetail createCommentPoDetail) {
		this.createCommentPoDetail = createCommentPoDetail;
	}



	public String getFillShipId() {
		return fillShipId;
	}



	public void setFillShipId(String fillShipId) {
		this.fillShipId = fillShipId;
	}



	public TPo getUpdatePo() {
		return updatePo;
	}



	public void setUpdatePo(TPo updatePo) {
		this.updatePo = updatePo;
	}


	
}
