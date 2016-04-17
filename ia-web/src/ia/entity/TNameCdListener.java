package ia.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;
import java.sql.Timestamp;

/**
 * 
 */
public class TNameCdListener implements EntityListener<TNameCd> {

    @Override
    public void preInsert(TNameCd entity, PreInsertContext<TNameCd> context) {
    }

    @Override
    public void preUpdate(TNameCd entity, PreUpdateContext<TNameCd> context) {
    	entity.setUpdTime(new Timestamp(System.currentTimeMillis()));
    }

    @Override
    public void preDelete(TNameCd entity, PreDeleteContext<TNameCd> context) {
    }

    @Override
    public void postInsert(TNameCd entity, PostInsertContext<TNameCd> context) {
    }

    @Override
    public void postUpdate(TNameCd entity, PostUpdateContext<TNameCd> context) {
    }

    @Override
    public void postDelete(TNameCd entity, PostDeleteContext<TNameCd> context) {
    }
}