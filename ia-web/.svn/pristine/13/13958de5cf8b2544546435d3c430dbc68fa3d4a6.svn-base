package ia.dao;

import ia.core.AppConfig;
import ia.entity.TCustomer;
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
public interface TCustomerDao {

    /**
     * @param custId
     * @param custIdP
     * @return the TCustomer entity
     */
    @Select
    TCustomer selectById(String custId);


    /**
     * @param custId
     * @param custIdP
     * @param versionNo
     * @return the TCustomer entity
     */
    @Select(ensureResult = true)
    TCustomer selectByIdAndVersion(String custId, String custIdP, Integer versionNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert(excludeNull=true)
    int insert(TCustomer entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update(excludeNull=true)
    int update(TCustomer entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TCustomer entity);
    
     /**
     * @return the List<TCustomer> entity
     */
    @Select
    List<TCustomer> selectAll(String orderBy);
    
    @Select
    List<TCustomer> selectByExample(TCustomer entity,String orderBy);
}