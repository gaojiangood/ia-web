package ia.dao;

import ia.core.AppConfig;
import ia.entity.TItem;
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
public interface TItemDao {

    /**
     * @param itemId
     * @return the TItem entity
     */
    @Select
    TItem selectById(String itemId);


    /**
     * @param itemId
     * @param versionNo
     * @return the TItem entity
     */
    @Select(ensureResult = true)
    TItem selectByIdAndVersion(String itemId, Integer versionNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert(excludeNull=true)
    int insert(TItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update(excludeNull=true)
    int update(TItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TItem entity);
    
     /**
     * @return the List<TItem> entity
     */
    @Select
    List<TItem> selectAll(String orderBy);
    
    @Select
    List<TItem> selectByExample(TItem entity,String orderBy);
}