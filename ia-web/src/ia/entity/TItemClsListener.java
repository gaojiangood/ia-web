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
public class TItemClsListener implements EntityListener<TItemCls> {

    @Override
    public void preInsert(TItemCls entity, PreInsertContext<TItemCls> context) {
    }

    @Override
    public void preUpdate(TItemCls entity, PreUpdateContext<TItemCls> context) {
    	entity.setUpdTime(new Timestamp(System.currentTimeMillis()));
    }

    @Override
    public void preDelete(TItemCls entity, PreDeleteContext<TItemCls> context) {
    }

    @Override
    public void postInsert(TItemCls entity, PostInsertContext<TItemCls> context) {
    }

    @Override
    public void postUpdate(TItemCls entity, PostUpdateContext<TItemCls> context) {
    }

    @Override
    public void postDelete(TItemCls entity, PostDeleteContext<TItemCls> context) {
    }
}