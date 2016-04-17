package ia.service;

import ia.annotation.Service;
import ia.dao.TCustomerDao;
import ia.entity.TCustomer;

import java.util.List;

import javax.inject.Inject;

@Service
public class CustomerService {

	@Inject
	TCustomerDao dao;
	

	/**
	 * 新建客户
	 * 
	 * @param po
	 * @return
	 */
	public TCustomer createCustomer(TCustomer customer) {
		dao.insert(customer);
		return dao.selectById(customer.getCustId());
	}

	/**
	 * 更新客户
	 * @param customer
	 * @return
	 */
	public TCustomer updateCustomer(TCustomer customer) {
		try{
			dao.update(customer);
		}catch(Exception e){
			return null;
		}
		return dao.selectById(customer.getCustId());
	}
	
	/**
	 * 客户查询
	 * @return
	 */
	public List<TCustomer> selectAllCustomer(){
		return dao.selectAll("");
	}
	
	/**
	 * 客户查询
	 * @return
	 */
	public List<TCustomer> selectCustomer(TCustomer customer){
		return dao.selectByExample(customer, "ORDER BY CUST_NAME");
	}
	
	/**
	 * 删除客户
	 * @param customer
	 * @return
	 */
	public void deleteCustomer(TCustomer customer){
			dao.delete(customer);
		
	}

}
