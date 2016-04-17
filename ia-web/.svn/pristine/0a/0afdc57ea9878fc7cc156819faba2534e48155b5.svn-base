package ia.dao;

import ia.core.AppConfig;
import ia.entity.TPoDetail;
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
public interface TPoDetailDao {

    /**
     * @param poDId
     * @return the TPoDetail entity
     */
    @Select
    TPoDetail selectById(String poDId);


    /**
     * @param poDId
     * @param versionNo
     * @return the TPoDetail entity
     */
    @Select(ensureResult = true)
    TPoDetail selectByIdAndVersion(String poDId, Integer versionNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert(excludeNull=true)
    int insert(TPoDetail entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update(excludeNull=true)
    int update(TPoDetail entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPoDetail entity);
    
     /**
     * @return the List<TPoDetail> entity
     */
    @Select
    List<TPoDetail> selectAll(String orderBy);
    
    @Select
    List<TPoDetail> selectByExample(TPoDetail entity,String orderBy);
}