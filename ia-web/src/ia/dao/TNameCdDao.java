package ia.dao;

import ia.core.AppConfig;
import ia.entity.TNameCd;
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
public interface TNameCdDao {

    /**
     * @param nameCls
     * @param nameCd
     * @return the TNameCd entity
     */
    @Select
    TNameCd selectById(String nameCls, String nameCd);


    /**
     * @param nameCls
     * @param nameCd
     * @param versionNo
     * @return the TNameCd entity
     */
    @Select(ensureResult = true)
    TNameCd selectByIdAndVersion(String nameCls, String nameCd, Integer versionNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert(excludeNull=true)
    int insert(TNameCd entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update(excludeNull=true)
    int update(TNameCd entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNameCd entity);
    
     /**
     * @return the List<TNameCd> entity
     */
    @Select
    List<TNameCd> selectAll(String orderBy);
    
    @Select
    List<TNameCd> selectByExample(TNameCd entity,String orderBy);
}