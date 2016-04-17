package ia.action;

import ia.annotation.Action;
import ia.entity.TCustomer;
import ia.model.CustomerModel;
import ia.service.CustomerService;
import ia.service.MasterService;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;


@Action
public class CustomerAction {
	
	@Inject
	CustomerService service;
	
	@Inject
	CustomerModel model;
	
	@Inject
	MasterService masterService;
	
	
	/**
	 * 商品检索
	 */
	public void getAllCustomer(){
		
		TCustomer con = new TCustomer();
		con.setCustIdP(model.getConCustPId());
		
		List<TCustomer> list = service.selectCustomer(con);
		
		String conCustId = model.getConCustId();
		
		List<TCustomer> newList = new ArrayList<TCustomer>();
		
		if(conCustId != null && !conCustId.equals("")){
			for(TCustomer obj : list){
				if(obj.getCustName().contains(conCustId)){
					newList.add(obj);
				}
			}
		}else{
			newList.addAll(list);
		}
		
		model.setCustomerList(newList);
	}
	
	public void createCustomer(){
		TCustomer customer = new TCustomer();
		customer.setCustId(masterService.getCustomerId());
		if(model.getCustomerList() == null){
			List<TCustomer> list = new ArrayList<TCustomer>();
			model.setCustomerList(list);
		}
		
		service.createCustomer(customer);
		
		model.getCustomerList().add( customer);
		
		masterService.loadCustomer();
	}
	
	/**
	 * 商品更新
	 * @param customer
	 * @return
	 */
	public void updateCustomer(TCustomer customer){
		TCustomer newCustomer = service.updateCustomer(customer);
		if(newCustomer == null){
			FacesContext.getCurrentInstance().addMessage("form", new FacesMessage(FacesMessage.SEVERITY_ERROR, "该数据已被其他用户更改，请刷新后重试。",null));
			return ;
		}else{
			customer = newCustomer;
			masterService.loadCustomer();
		}
	}
	
	/**
	 * 删除商品
	 * @param customer
	 */
	public void deleteCustomer(TCustomer customer) {
		service.deleteCustomer(customer);
		model.getCustomerList().remove(customer);
		masterService.loadCustomer();
	}
	
	
}
