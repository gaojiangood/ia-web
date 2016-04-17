package ia.model;

import ia.entity.TItem;
import ia.service.MasterService;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

@FacesConverter("itemConverter")
public class ItemConverter implements Converter {
	
	@Inject
	MasterService service;

	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if (value != null && value.trim().length() > 0) {

			
			return service.getItemById(value);

		} else {
			return null;
		}
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic, Object object) {
		if(object != null){
			return object.toString();
		}else{
			return null;	
		}
		
	}

}
