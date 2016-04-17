package ia.action;

import ia.annotation.Action;
import ia.entity.TItem;
import ia.model.ItemModel;
import ia.service.ItemService;
import ia.service.MasterService;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.apache.commons.io.FileUtils;
import org.primefaces.context.RequestContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.UploadedFile;

@Action
public class ItemAction {

	@Inject
	ItemService service;

	@Inject
	ItemModel model;

	@Inject
	MasterService masterService;

	private UploadedFile file1;

	public void initCreateItem() {
		TItem item = new TItem();
		item.setItemId(masterService.getItemId());
		model.setAddItem(item);

	}

	public void createTmpItem(SelectEvent event) {
		TItem item = (TItem) event.getObject();
		item = service.createItem(item);

		masterService.loadItem();

	}

	/**
	 * 关闭新建订单窗口
	 * 
	 * @param po
	 */
	public void closeTmpItem(TItem item) {
		RequestContext.getCurrentInstance().closeDialog(item);
	}

	/**
	 * 商品检索
	 */
	public void getAllItem() {
		List<TItem> list = service.selectAllItem();
		List<TItem> addList = new ArrayList<TItem>();
		if (model.getConItemName().isEmpty()) {
			addList.addAll(list);
		} else {
			for (TItem item : list) {
				if (item.getItemName().contains(model.getConItemName())) {
					addList.add(item);
				}
			}
		}

		model.setItemList(addList);
		List<String> images = new ArrayList<String>();
		images.add("item1.jpeg");
		images.add("item2.jpeg");
		images.add("item3.jpeg");
		images.add("item4.jpeg");
		model.setImages(images);
	}

	/**
	 * 画面添加商品
	 */
	public void createItem() {
		TItem item = new TItem();
		item.setItemId(masterService.getItemId());
		if (model.getItemList() == null) {
			List<TItem> list = new ArrayList<TItem>();
			model.setItemList(list);
		}
		item.setItemPrice(BigDecimal.ZERO);
		item.setItemCost(BigDecimal.ZERO);
		item.setItemProfit(BigDecimal.ZERO);

		service.createItem(item);

		model.getItemList().add(0, item);

		masterService.loadItem();
	}

	/**
	 * 手机界面添加商品
	 */
	public void pmCreateItem() {
		TItem item = model.getCurItem();

		// item.setItemName(model.getCurItem().getItemName());
		item.setClassId("");
		// item.setItemPrice(model.getCurItem().getItemPrice());
		// item.setItemCost(model.getCurItem().getItemCost());
		item.setItemProfit(model.getCurItem().getItemPrice()
				.subtract(model.getCurItem().getItemCost()));
		item.setBarCode(model.getCurItem().getBarCode());
		// item.setSize(model.getCurItem().getSize());
		// item.setWight(model.getCurItem().getWight());
		// item.setComment(model.getCurItem().getItemComment());
		// item.setPicUrl(model.getCurItem().getPicUrl());
		
		if(service.getItemById(item.getItemId())== null){
			model.setCurItem(service.createItem(item));
		}else{
			model.setCurItem(service.updateItem(item));
		}
		
		if(model.getCurItem()==null){
			FacesContext.getCurrentInstance().addMessage("form", new FacesMessage(FacesMessage.SEVERITY_ERROR, "出现错误，请刷新后重试。",null));
		}

	}

	/**
	 * 显示添加商品界面
	 */
	public String pmGotoCreateItem() {
		TItem item = new TItem();

		item.setItemId(masterService.getItemId());
		model.setCurItem(item);

		return "pmItemCreate";
	}

	/**
	 * 商品更新
	 * 
	 * @param item
	 * @return
	 */
	public void updateItem(TItem item) {
		item.setItemProfit(item.getItemPrice().subtract(item.getItemCost()));
		TItem newItem = service.updateItem(item);
		if (newItem == null) {
			FacesContext.getCurrentInstance().addMessage(
					"form",
					new FacesMessage(FacesMessage.SEVERITY_ERROR,
							"该数据已被其他用户更改，请刷新后重试。", null));
			return;
		} else {
			item = newItem;
			masterService.loadItem();
		}
	}

	/**
	 * 删除商品
	 * 
	 * @param item
	 */
	public void deleteItem(TItem item) {
		if (service.deleteItem(item) != 0) {
			FacesContext.getCurrentInstance().addMessage(
					"form",
					new FacesMessage(FacesMessage.SEVERITY_ERROR,
							"该商品已被客户购买，无法删除", null));
		} else {
			model.getItemList().remove(item);
			FacesContext.getCurrentInstance().addMessage(
					"form",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "商品已删除："
							+ item.getItemName(), null));
			masterService.loadItem();
		}
	}

	/**
	 * 显示商品详细
	 * 
	 * @param item
	 */
	public void showDetail(TItem item) {
		model.setCurItem(item);
		
		TItem[] select = {item};
		model.setSelected(select);
	}

	/**
	 * 显示商品详细
	 * 
	 * @param item
	 */
	public String pmShowDetail() {
		Map requestMap = FacesContext.getCurrentInstance().

		getExternalContext().getRequestParameterMap();

		String itemId = (String) requestMap.get("itemId");

		model.setCurItem(service.getItemById(itemId));

		return "pmItemDetail";

	}

	/**
	 * 显示商品详细
	 * 
	 * @param item
	 */
	public String pmShowDetail2() {

		System.out.println("aalakdsjflsjdfljsfkljdfljslfjl");

		return "pm:second";

	}

	/**
	 * 图片上传
	 * 
	 * @param event
	 */
	public void photoUpload(FileUploadEvent event) {
		// get uploaded file from the event
		UploadedFile uploadedFile = (UploadedFile) event.getFile();

		// create an InputStream from the uploaded file
		InputStream inputStr = null;
		try {
			inputStr = uploadedFile.getInputstream();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// create destination File
		String destPath = masterService.getNameCdLabel("F", "F01");
		String fileName = model.getCurItem().getItemId()
				+ uploadedFile.getFileName();
		File destFile = new File(destPath + fileName);
		while (destFile.exists()) {
			fileName = "0" + fileName;
			destFile = new File(destPath + fileName);
		}

		// use org.apache.commons.io.FileUtils to copy the File
		try {
			FileUtils.copyInputStreamToFile(inputStr, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

		model.getCurItem().setPicUrl(fileName);
	}

	public UploadedFile getFile1() {
		return file1;
	}

	public void setFile1(UploadedFile file1) {
		this.file1 = file1;
	}

	/**
	 * 手机页面 照片上传
	 * 
	 * @return
	 * @throws IOException
	 */
	public void pmPhotoUpload() {
		// get uploaded file from the event
		UploadedFile uploadedFile = file1;

		// create an InputStream from the uploaded file
		InputStream inputStr = null;
		try {
			inputStr = uploadedFile.getInputstream();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// create destination File
		String destPath = masterService.getNameCdLabel("F", "F01");
		String fileName = model.getCurItem().getItemId()
				+ uploadedFile.getFileName();
		File destFile = new File(destPath + fileName);
		while (destFile.exists()) {
			fileName = "0" + fileName;
			destFile = new File(destPath + fileName);
		}

		// use org.apache.commons.io.FileUtils to copy the File
		try {
			FileUtils.copyInputStreamToFile(inputStr, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

		model.getCurItem().setPicUrl(fileName);
	}

}
