package ia.action;

import ia.annotation.Action;
import ia.entity.TAddr;
import ia.entity.TCustomer;
import ia.model.AddrModel;
import ia.service.AddrService;
import ia.service.MasterService;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.apache.commons.io.FileUtils;
import org.primefaces.context.RequestContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.UploadedFile;


@Action
public class AddrAction {
	
	@Inject
	AddrService service;
	
	@Inject
	AddrModel model;
	
	@Inject
	MasterService masterService;
	
	
	/**
	 * 商品检索
	 */
	public void getAllAddr(){
		TAddr con = new TAddr();
		con.setCustId(model.getConCustId());
		
		List<TAddr> list = service.selectAddr(con);
		
		model.setAddrList(list);
	}
	
	public void createAddr(){
		TAddr addr = new TAddr();
		addr.setAddrId(masterService.getAddrId());
		if(model.getAddrList() == null){
			List<TAddr> list = new ArrayList<TAddr>();
			model.setAddrList(list);
		}
		
		service.createAddr(addr);
		
		model.getAddrList().add(addr);
		
		masterService.loadAddr();
	}
	
	/**
	 * 商品更新
	 * @param addr
	 * @return
	 */
	public void updateAddr(TAddr addr){
		TAddr newAddr = service.updateAddr(addr);
		if(newAddr == null){
			FacesContext.getCurrentInstance().addMessage("form", new FacesMessage(FacesMessage.SEVERITY_ERROR, "该数据已被其他用户更改，请刷新后重试。",null));
			return ;
		}else{
			addr = newAddr;
			masterService.loadAddr();
		}
	}
	
	/**
	 * 删除商品
	 * @param addr
	 */
	public void deleteAddr(TAddr addr) {
		service.deleteAddr(addr);
		model.getAddrList().remove(addr);
		masterService.loadAddr();
	}
	
	
}
