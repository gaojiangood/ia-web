package ia.dao.custom;

import ia.core.AppConfig;
import ia.core.InjectDaoConfig;
import ia.entity.TShip;
import ia.entity.custom.TShipCus;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

/**
 */
@Dao(config = AppConfig.class)
@InjectDaoConfig
public interface TShipCusDao {

    /**
     * @param shipId
     * @return the TShip entity
     */
    @Select
    List<TShipCus> selectShipList(TShip entity,String orderBy);
    
}