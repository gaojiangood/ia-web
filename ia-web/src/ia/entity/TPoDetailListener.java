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
public class TPoDetailListener implements EntityListener<TPoDetail> {

    @Override
    public void preInsert(TPoDetail entity, PreInsertContext<TPoDetail> context) {
    }

    @Override
    public void preUpdate(TPoDetail entity, PreUpdateContext<TPoDetail> context) {
    	entity.setUpdTime(new Timestamp(System.currentTimeMillis()));
    }

    @Override
    public void preDelete(TPoDetail entity, PreDeleteContext<TPoDetail> context) {
    }

    @Override
    public void postInsert(TPoDetail entity, PostInsertContext<TPoDetail> context) {
    }

    @Override
    public void postUpdate(TPoDetail entity, PostUpdateContext<TPoDetail> context) {
    }

    @Override
    public void postDelete(TPoDetail entity, PostDeleteContext<TPoDetail> context) {
    }
}