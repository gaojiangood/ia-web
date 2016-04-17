package ia.service;

import ia.annotation.Master;
import ia.dao.TAddrDao;
import ia.dao.TCustomerDao;
import ia.dao.TItemDao;
import ia.dao.TNameCdDao;
import ia.dao.TShipDao;
import ia.entity.TAddr;
import ia.entity.TCustomer;
import ia.entity.TItem;
import ia.entity.TNameCd;
import ia.entity.TShip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.model.SelectItem;
import javax.inject.Inject;

@Master
public class MasterService {

//代码表
Map<String,List<SelectItem>> nameCdMap = null;


//商品列表
List<SelectItem> item = null;

//商品MAP
Map<String,TItem> itemMap = null;

//装箱单列表
List<SelectItem> ship = null;

//装箱单MAP
Map<String,TShip> shipMap = null;

//地址列表
List<SelectItem> addr = null;

//地址MAP
Map<String,TAddr> addrMap = null;

//客户列表
List<SelectItem> customer = null;

//客户MAP
Map<String,TAddr> customerMap = null;

@Inject
TNameCdDao nameCdDao;
@Inject
TCustomerDao customerDao;
@Inject
TItemDao itemDao;
@Inject
TShipDao shipDao;
@Inject
TAddrDao addrDao;


/**
 * 根据装箱单ID取得装箱单信息
 * @param itemId
 * @return
 */
public TShip getShipById(String shipId){
	if(shipMap == null){
		this.loadShip();
	}
	
	return shipMap.get(shipId);
}
/**
 * 根据装箱单ID取得装箱单信息
 * @param itemId
 * @return
 */
public TAddr getAddrById(String addrId){
	if(addrMap == null){
		this.loadAddr();
	}
	
	return addrMap.get(addrId);
}

/**
 * 取得装箱单列表
 * @return
 */
public List<SelectItem> getShipList(){
	if(ship == null){
		this.loadShip();
	}
	
	return ship;
}
/**
 * 取得地址列表
 * @return
 */
public List<SelectItem> getAddrList(){
	if(addr == null){
		this.loadAddr();
	}
	
	return addr;
}
/**
 * 根据商品ID取得商品信息
 * @param itemId
 * @return
 */
public TItem getItemById(String itemId){
	if(itemMap == null){
		this.loadItem();
	}
	
	return itemMap.get(itemId);
}

/**
 * 取得商品列表
 * @return
 */
public List<SelectItem> getItemList(){
	if(item == null){
		this.loadItem();
	}
	
	return item;
}

/**
 * 根据商品ID取得商品名称
 * @param customerId
 * @return
 */
public String getItemName(String itemId){
	List<SelectItem> list = this.getItemList();
	
	for(SelectItem item : list){
		if(itemId.equals(item.getValue())){
			return item.getLabel();
		}
	}
	
	return "";
}

/**
 * 取得客户列表
 * @return
 */
public List<SelectItem> getCustomerList(){
	if(customer == null){
		this.loadCustomer();
	}
	
	return customer;
}

/**
 * 根据客户ID取得客户姓名
 * @param customerId
 * @return
 */
public String getCustomerName(String customerId){
	List<SelectItem> list = this.getCustomerList();
	
	for(SelectItem item : list){
		if(customerId.equals(item.getValue())){
			return item.getLabel();
		}
	}
	
	return "";
}

/**
 * 根据装箱单ID取得装箱单名称
 * @param customerId
 * @return
 */
public String getShipName(String shipId){
	List<SelectItem> list = this.getShipList();
	
	for(SelectItem item : list){
		if(shipId.equals(item.getValue())){
			return item.getLabel();
		}
	}
	
	return "";
}

/**
 * 根据代码分类取得下拉列表
 * @param nameCls
 * @return
 */
public List<SelectItem> getNameCd(String nameCls){
	if(nameCdMap == null){
		loadNameCd();
	}
	return nameCdMap.get(nameCls);
	
}

/**
 * 根据代码分类，代码key取得代码值
 * @param nameCls
 * @param nameCd
 * @return
 */
public String getNameCdLabel(String nameCls,String nameCd){

	List<SelectItem>  list = getNameCd(nameCls);
	
	for(SelectItem item : list){
		if(nameCd.equals(item.getValue())){
			return item.getLabel();
		}
	}
	
	return "";
}


/**
 * 订单ID採番
 * @return
 */
public String genPoId(){
	
	TNameCd namecd = nameCdDao.selectById("E", "E01");
	
	namecd.setNameNum(namecd.getNameNum() + 1);
	
	nameCdDao.update(namecd);
	
	String newPoId = "P" + String.format("%06d", namecd.getNameNum());
	
	return newPoId;
}

/**
 * 订单明细ID採番
 * @return
 */
public String genPoDId(){
	
	TNameCd namecd = nameCdDao.selectById("E", "E02");
	
	namecd.setNameNum(namecd.getNameNum() + 1);
	
	nameCdDao.update(namecd);
	
	String newPoId = "D" + String.format("%06d", namecd.getNameNum());
	
	return newPoId;
}
/**
 * 客户ID採番
 * @return
 */
public String getCustomerId(){
	
	TNameCd namecd = nameCdDao.selectById("E", "E03");
	
	namecd.setNameNum(namecd.getNameNum() + 1);
	
	nameCdDao.update(namecd);
	
	String newPoId = "C" + String.format("%06d", namecd.getNameNum());
	
	return newPoId;
}
/**
 * 商品ID採番
 * @return
 */
public String getItemId(){
	
	TNameCd namecd = nameCdDao.selectById("E", "E04");
	
	namecd.setNameNum(namecd.getNameNum() + 1);
	
	nameCdDao.update(namecd);
	
	String newPoId = "G" + String.format("%06d", namecd.getNameNum());
	
	return newPoId;
}
/**
 * 地址ID採番
 * @return
 */
public String getAddrId(){
	
	TNameCd namecd = nameCdDao.selectById("E", "E05");
	
	namecd.setNameNum(namecd.getNameNum() + 1);
	
	nameCdDao.update(namecd);
	
	String newAddrId = "A" + String.format("%06d", namecd.getNameNum());
	
	return newAddrId;
}
/**
 * 装箱单ID採番
 * @return
 */
public String getShipId(){
	
	TNameCd namecd = nameCdDao.selectById("E", "E06");
	
	namecd.setNameNum(namecd.getNameNum() + 1);
	
	nameCdDao.update(namecd);
	
	String newPoId = "S" + String.format("%06d", namecd.getNameNum());
	
	return newPoId;
}

/**
 * 是否是不计数商品
 * @param itemId
 * @return
 */
public boolean isNoCount(String itemId){
	for(SelectItem selectItem :getNameCd("G")){
		if(selectItem.getLabel().equals(itemId)){
			return true;
		}
	}
	
	return false;
}

private void loadNameCd(){
	System.out.println("nameCd init!");
	
	nameCdMap = new HashMap<String,List<SelectItem>>();
	
	List<TNameCd> list = nameCdDao.selectByExample(new TNameCd(), "order by NAME_CLS,NAME_CD");
	String tmpNameCls = "";
	List<SelectItem> selects = new ArrayList<SelectItem>();
	
	for(TNameCd nameCd : list){
		if(!tmpNameCls.equals("")
				&&!tmpNameCls.equals(nameCd.getNameCls())){
			nameCdMap.put(tmpNameCls, selects);
			selects = new ArrayList<SelectItem>();
		}
		tmpNameCls = nameCd.getNameCls();
		SelectItem item = new SelectItem();
		item.setValue(nameCd.getNameCd());
		item.setLabel(nameCd.getNameChar());
		selects.add(item);
	}
	nameCdMap.put(tmpNameCls, selects);
	
}
public void loadCustomer(){
	
	customer = new ArrayList<SelectItem>();
	
	List<TCustomer> list = customerDao.selectAll("order by CUST_NAME");
		for(TCustomer obj : list){
		
		SelectItem item = new SelectItem();
		item.setValue(obj.getCustId());
		item.setLabel(obj.getCustName());
		customer.add(item);
	}
	
}

public void loadItem(){
	item = new ArrayList<SelectItem>();
	itemMap = new HashMap<String ,TItem>();
	
	List<TItem> list = itemDao.selectAll("order by ITEM_NAME");
		for(TItem obj : list){
		
		SelectItem t = new SelectItem();
		t.setValue(obj.getItemId());
		t.setLabel(obj.getItemName());
		item.add(t);
		
		itemMap.put(obj.getItemId(), obj);
	}
	
}
public void loadAddr(){
	addr = new ArrayList<SelectItem>();
	addrMap = new HashMap<String ,TAddr>();
	
	List<TAddr> list = addrDao.selectAll("order by ADDR_ID DESC");
		for(TAddr obj : list){
		
		SelectItem t = new SelectItem();
		t.setValue(obj.getAddrId());
		t.setLabel(obj.getAddrId() + ":" +obj.getReceiver()+":"+obj.getAddr());
		addr.add(t);
		
		addrMap.put(obj.getAddrId(), obj);
	}
	
}

	public void loadShip() {
		ship = new ArrayList<SelectItem>();
		shipMap = new HashMap<String, TShip>();
		
		//第一行空行
		SelectItem t = new SelectItem();
		t.setValue("");
		t.setLabel("");
		ship.add(t);

		shipMap.put("", new TShip());


		List<TShip> list = shipDao.selectAll("order by SHIP_ID DESC");
		for (TShip obj : list) {

			t = new SelectItem();
			t.setValue(obj.getShipId());
			t.setLabel(obj.getShipId() + ":"
					+ this.getCustomerName(obj.getCustId())
					+ ":"
					+this.getNameCdLabel("D", obj.getShipWay()));
			ship.add(t);

			shipMap.put(obj.getShipId(), obj);
		}

	}

}
