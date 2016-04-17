package ia.service;

import ia.annotation.Service;
import ia.dao.TItemDao;
import ia.dao.TPoDetailDao;
import ia.entity.TItem;
import ia.entity.TPoDetail;

import java.util.List;

import javax.inject.Inject;

@Service
public class ItemService {

	@Inject
	TItemDao dao;
	
	@Inject
	TPoDetailDao poDetailDao;

	/**
	 * 新建商品
	 * 
	 * @param po
	 * @return
	 */
	public TItem createItem(TItem item) {
		dao.insert(item);
		return dao.selectById(item.getItemId());
	}

	/**
	 * 更新商品
	 * @param item
	 * @return
	 */
	public TItem updateItem(TItem item) {
		try{
			dao.update(item);
		}catch(Exception e){
			return null;
		}
		return dao.selectById(item.getItemId());
	}
	
	/**
	 * 商品查询
	 * @return
	 */
	public List<TItem> selectAllItem(){
		return dao.selectAll("ORDER BY ITEM_NAME");
	}
	
	/**
	 * 删除商品
	 * @param item
	 * @return
	 */
	public int deleteItem(TItem item){
		TPoDetail poDetail = new TPoDetail();
		poDetail.setItemId(item.getItemId());
		if(poDetailDao.selectByExample(poDetail, "").size() != 0){
			return 1;
		}else{
			dao.delete(item);
			return 0;
		}
		
	}
	
	public TItem getItemById(String itemId){
		return dao.selectById(itemId);
	}

}
