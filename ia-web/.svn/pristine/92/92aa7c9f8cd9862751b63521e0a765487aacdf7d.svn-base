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
public class TAddrListener implements EntityListener<TAddr> {

    @Override
    public void preInsert(TAddr entity, PreInsertContext<TAddr> context) {
    }

    @Override
    public void preUpdate(TAddr entity, PreUpdateContext<TAddr> context) {
    	entity.setUpdTime(new Timestamp(System.currentTimeMillis()));
    }

    @Override
    public void preDelete(TAddr entity, PreDeleteContext<TAddr> context) {
    }

    @Override
    public void postInsert(TAddr entity, PostInsertContext<TAddr> context) {
    }

    @Override
    public void postUpdate(TAddr entity, PostUpdateContext<TAddr> context) {
    }

    @Override
    public void postDelete(TAddr entity, PostDeleteContext<TAddr> context) {
    }
}