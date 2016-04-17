package ia.model;

import ia.annotation.Model;
import ia.core.IaConstant;
import ia.entity.TPo;
import ia.entity.TPoDetail;
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
public class AnalysisModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	/**
	 * 订单明细列表
	 */
	private List<TPoDetail> poDetail;
	
		/**
	 * 被选中的订单明细
	 */
	private TPoDetail[] selectedDetail;
	
	/**
	 * 条件 客户ID
	 */
	private String conCustomerId;
	
	/**
	 * 条件 商品ID
	 */
	private String conItemId;
	
	/**
	 * 总销售额
	 */
	private BigDecimal totalPrice;
	
	/**
	 * 总利润
	 */
	private BigDecimal totalProfit;
	
	/**
	 * Model初始化
	 */
	@PostConstruct
	public void init(){
		
		if(poDetail == null){
			poDetail = new ArrayList<TPoDetail>();
		}
		
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


	public String getConCustomerId() {
		return conCustomerId;
	}


	public void setConCustomerId(String conCustomerId) {
		this.conCustomerId = conCustomerId;
	}


	public String getConItemId() {
		return conItemId;
	}


	public void setConItemId(String conItemId) {
		this.conItemId = conItemId;
	}


	public BigDecimal getTotalPrice() {
		totalPrice = BigDecimal.ZERO;
		for(TPoDetail obj : poDetail){
			totalPrice = totalPrice.add(obj.getItemPricePay());
		}
		return totalPrice;
	}


	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}


	public BigDecimal getTotalProfit() {
		totalProfit = BigDecimal.ZERO;
		for(TPoDetail obj : poDetail){
			totalProfit = totalProfit.add(obj.getItemProfit());
		}
		return totalProfit;
	}


	public void setTotalProfit(BigDecimal totalProfit) {
		this.totalProfit = totalProfit;
	}
	
}
