package ia.dao;

import ia.core.AppConfig;
import ia.entity.TAddr;
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
public interface TAddrDao {

    /**
     * @param addrId
     * @return the TAddr entity
     */
    @Select
    TAddr selectById(String addrId);


    /**
     * @param addrId
     * @param versionNo
     * @return the TAddr entity
     */
    @Select(ensureResult = true)
    TAddr selectByIdAndVersion(String addrId, Integer versionNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert(excludeNull=true)
    int insert(TAddr entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update(excludeNull=true)
    int update(TAddr entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TAddr entity);
    
     /**
     * @return the List<TAddr> entity
     */
    @Select
    List<TAddr> selectAll(String orderBy);
    
    @Select
    List<TAddr> selectByExample(TAddr entity,String orderBy);
}