package ia.dao;

import ia.core.AppConfig;
import ia.entity.TItemCls;
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
public interface TItemClsDao {

    /**
     * @param classId
     * @return the TItemCls entity
     */
    @Select
    TItemCls selectById(String classId);


    /**
     * @param classId
     * @param versionNo
     * @return the TItemCls entity
     */
    @Select(ensureResult = true)
    TItemCls selectByIdAndVersion(String classId, Integer versionNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert(excludeNull=true)
    int insert(TItemCls entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update(excludeNull=true)
    int update(TItemCls entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TItemCls entity);
    
     /**
     * @return the List<TItemCls> entity
     */
    @Select
    List<TItemCls> selectAll(String orderBy);
    
    @Select
    List<TItemCls> selectByExample(TItemCls entity,String orderBy);
}