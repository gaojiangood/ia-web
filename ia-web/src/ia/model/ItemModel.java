package ia.model;

import ia.annotation.Model;
import ia.entity.TItem;

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
public class ItemModel implements Serializable{
	
	private static final long serialVersionUID = 1L;

	/**
	 * 新建商品用
	 */
	private TItem addItem;
	
	/**
	 * 商品列表
	 */
	private List<TItem> itemList;
	
	/**
	 * 被选中的商品
	 */
	private TItem[] selected;
	
	/**
	 * 查询条件 商品名称
	 */
	String conItemName;
	
	/**
	 * 当前商品
	 */
	private TItem curItem;
	
	/**
	 * 图片列表
	 */
	private List<String> images;

	
	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public List<TItem> getItemList() {
		return itemList;
	}

	public void setItemList(List<TItem> itemList) {
		this.itemList = itemList;
	}

	public TItem[] getSelected() {
		return selected;
	}

	public void setSelected(TItem[] selected) {
		this.selected = selected;
	}

	public TItem getCurItem() {
		return curItem;
	}

	public void setCurItem(TItem curItem) {
		this.curItem = curItem;
	}

	public TItem getAddItem() {
		return addItem;
	}

	public void setAddItem(TItem addItem) {
		this.addItem = addItem;
	}
	
	public String getConItemName() {
		return conItemName;
	}

	public void setConItemName(String conItemName) {
		this.conItemName = conItemName;
	}
	
	
	
}
