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
public class NeedShipModel implements Serializable{
	
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
	
}
