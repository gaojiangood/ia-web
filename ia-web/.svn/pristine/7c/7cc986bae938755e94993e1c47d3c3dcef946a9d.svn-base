package ia.dao;

import ia.core.AppConfig;
import ia.entity.TPo;
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
public interface TPoDao {

    /**
     * @param poId
     * @return the TPo entity
     */
    @Select
    TPo selectById(String poId);


    /**
     * @param poId
     * @param versionNo
     * @return the TPo entity
     */
    @Select(ensureResult = true)
    TPo selectByIdAndVersion(String poId, Integer versionNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert(excludeNull=true)
    int insert(TPo entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update(excludeNull=true)
    int update(TPo entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPo entity);
    
     /**
     * @return the List<TPo> entity
     */
    @Select
    List<TPo> selectAll(String orderBy);
    
    @Select
    List<TPo> selectByExample(TPo entity,String orderBy);
}