package ia.dao;

import ia.core.AppConfig;
import ia.entity.TShip;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import java.util.List;
import ia.core.InjectDaoConfig;

/**
 */
@Dao(config = AppConfig.class)
@InjectDaoConfig
public interface TShipDao {

    /**
     * @param shipId
     * @return the TShip entity
     */
    @Select
    TShip selectById(String shipId);


    /**
     * @param shipId
     * @param versionNo
     * @return the TShip entity
     */
    @Select(ensureResult = true)
    TShip selectByIdAndVersion(String shipId, Integer versionNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert(excludeNull=true)
    int insert(TShip entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update(excludeNull=true)
    int update(TShip entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TShip entity);
    
     /**
     * @return the List<TShip> entity
     */
    @Select
    List<TShip> selectAll(String orderBy);
    
    @Select
    List<TShip> selectByExample(TShip entity,String orderBy);
}