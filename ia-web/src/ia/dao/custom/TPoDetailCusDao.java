package ia.dao.custom;

import ia.core.AppConfig;
import ia.core.InjectDaoConfig;
import ia.entity.TPoDetail;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

/**
 */
@Dao(config = AppConfig.class)
@InjectDaoConfig
public interface TPoDetailCusDao {

    /**
     * 待采购商品取得
     * @param shipId
     * @return the TShip entity
     */
    @Select
    List<TPoDetail> selectNeedBuy(String orderBy);
    
    /**
     * 已付款未发货商品取得
     * @param shipId
     * @return the TShip entity
     */
    @Select
    List<TPoDetail> selectNeedShip(String orderBy);
    
}