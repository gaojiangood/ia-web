package ia.action;

import ia.annotation.Action;
import ia.entity.TPoDetail;
import ia.model.AnalysisModel;
import ia.service.MasterService;
import ia.service.PoService;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.apache.commons.lang.StringUtils;


@Action
public class AnalysisAction {

	@Inject
	PoService service;

	@Inject
	AnalysisModel model;

	@Inject
	MasterService masterService;

	

	/**
	 * 订单明细查询
	 */
	public void getAllPoDetail() {
		
		if(StringUtils.isEmpty(model.getConCustomerId())
				&& StringUtils.isEmpty(model.getConItemId())){
			FacesContext.getCurrentInstance().addMessage(
					"form",
					new FacesMessage(FacesMessage.SEVERITY_WARN,
							"请选择查询条件。（客户或者商品必须至少选择其一。）", null));
			
			model.getPoDetail().clear();
			
			return;
		}
		
		TPoDetail entity = new TPoDetail();
		entity.setCustId(model.getConCustomerId());
		entity.setItemId(model.getConItemId());
		
		model.getPoDetail().clear();
		model.setPoDetail(service.getPoDetailByExample(entity));



	}

	

	
}
