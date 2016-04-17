package ia.service;

import ia.annotation.Service;
import ia.dao.TPoDetailDao;
import ia.dao.TShipDao;
import ia.dao.custom.TShipCusDao;
import ia.entity.TPoDetail;
import ia.entity.TShip;
import ia.entity.custom.TShipCus;

import java.util.List;

import javax.inject.Inject;

@Service
public class ShipService {
	
	@Inject
	TShipDao dao;
	
	@Inject
	TShipCusDao cusDao;
	
	@Inject
	TPoDetailDao detailDao;
	
	/**
	 * 装箱单查询
	 * @return
	 */
	public List<TShipCus> getAllShip(TShip entity){
		return cusDao.selectShipList(entity,"");
		
	}
	
	public List<TShip> getPoByExample(TShip ship){
		return dao.selectByExample(ship, "order by SHIP_ID");
	}
	
	/**
	 * 新建装箱单
	 * @param po
	 * @return
	 */
	public TShip createShip(TShip ship){
		dao.insert(ship);
		return dao.selectById(ship.getShipId());
	}
	
	/**
	 * 更新装箱单
	 * @param po
	 * @return
	 */
	public TShip updateShip(TShip ship){
		try{
			dao.update(ship);
		}catch(Exception e){
			return null;
		}
		
		return dao.selectById(ship.getShipId());
	}

	/**
	 * 订单明细查询
	 * @return
	 */
	public List<TPoDetail> getAllPoDetail(String shipId){
		TPoDetail con = new TPoDetail();
		con.setShipId(shipId);
		return detailDao.selectByExample(con, "order by PO_ID,CUST_ID,ITEM_ID");
		
	}
	
	
	/**
	 * 订单明细更新
	 * @param poDetail
	 * @return
	 */
	public TPoDetail updatePoDetail(TPoDetail poDetail){
		try{
			detailDao.update(poDetail);
		}catch(Exception e){
			return null;
		}
		
		
		return detailDao.selectById(poDetail.getPoDId());
	}
	
	/**
	 * 根据明细ID取得订单明细
	 * @param po
	 * @return
	 */
	public TPoDetail getPoDetailById(String poDId){
		return detailDao.selectById(poDId);
	}
	
}
