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
public class TItemListener implements EntityListener<TItem> {

    @Override
    public void preInsert(TItem entity, PreInsertContext<TItem> context) {
    }

    @Override
    public void preUpdate(TItem entity, PreUpdateContext<TItem> context) {
    	entity.setUpdTime(new Timestamp(System.currentTimeMillis()));
    }

    @Override
    public void preDelete(TItem entity, PreDeleteContext<TItem> context) {
    }

    @Override
    public void postInsert(TItem entity, PostInsertContext<TItem> context) {
    }

    @Override
    public void postUpdate(TItem entity, PostUpdateContext<TItem> context) {
    }

    @Override
    public void postDelete(TItem entity, PostDeleteContext<TItem> context) {
    }
}