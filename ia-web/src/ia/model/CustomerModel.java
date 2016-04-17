package ia.model;

import ia.annotation.Model;
import ia.entity.TCustomer;

import java.io.Serializable;
import java.util.List;

/**
 * @author gaojian
 *
 */
/**
 * @author gaojian
 *
 */
@Model
public class CustomerModel implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	/**
	 * 客户列表
	 */
	private List<TCustomer> customerList;
	
	/**
	 * 检索条件 客户ID
	 */
	private String conCustId;
	
	/**
	 * 检索条件 客户组ID
	 */
	private String conCustPId;

	

	public List<TCustomer> getCustomerList() {
		return customerList;
	}


	public void setCustomerList(List<TCustomer> customerList) {
		this.customerList = customerList;
	}


	public String getConCustId() {
		return conCustId;
	}


	public void setConCustId(String conCustId) {
		this.conCustId = conCustId;
	}


	public String getConCustPId() {
		return conCustPId;
	}


	public void setConCustPId(String conCustPId) {
		this.conCustPId = conCustPId;
	}
	
	
	
}
