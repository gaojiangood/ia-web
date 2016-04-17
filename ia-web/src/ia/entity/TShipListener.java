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
public class TShipListener implements EntityListener<TShip> {

    @Override
    public void preInsert(TShip entity, PreInsertContext<TShip> context) {
    }

    @Override
    public void preUpdate(TShip entity, PreUpdateContext<TShip> context) {
    	entity.setUpdTime(new Timestamp(System.currentTimeMillis()));
    }

    @Override
    public void preDelete(TShip entity, PreDeleteContext<TShip> context) {
    }

    @Override
    public void postInsert(TShip entity, PostInsertContext<TShip> context) {
    }

    @Override
    public void postUpdate(TShip entity, PostUpdateContext<TShip> context) {
    }

    @Override
    public void postDelete(TShip entity, PostDeleteContext<TShip> context) {
    }
}