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
public class TPoListener implements EntityListener<TPo> {

    @Override
    public void preInsert(TPo entity, PreInsertContext<TPo> context) {
    }

    @Override
    public void preUpdate(TPo entity, PreUpdateContext<TPo> context) {
    	entity.setUpdTime(new Timestamp(System.currentTimeMillis()));
    }

    @Override
    public void preDelete(TPo entity, PreDeleteContext<TPo> context) {
    }

    @Override
    public void postInsert(TPo entity, PostInsertContext<TPo> context) {
    }

    @Override
    public void postUpdate(TPo entity, PostUpdateContext<TPo> context) {
    }

    @Override
    public void postDelete(TPo entity, PostDeleteContext<TPo> context) {
    }
}