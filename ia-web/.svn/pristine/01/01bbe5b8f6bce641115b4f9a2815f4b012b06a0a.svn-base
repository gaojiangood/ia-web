package ia.entity.custom;

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
public class TShipCusListener implements EntityListener<TShipCus> {

    @Override
    public void preInsert(TShipCus entity, PreInsertContext<TShipCus> context) {
    }

    @Override
    public void preUpdate(TShipCus entity, PreUpdateContext<TShipCus> context) {
    	entity.setUpdTime(new Timestamp(System.currentTimeMillis()));
    }

    @Override
    public void preDelete(TShipCus entity, PreDeleteContext<TShipCus> context) {
    }

    @Override
    public void postInsert(TShipCus entity, PostInsertContext<TShipCus> context) {
    }

    @Override
    public void postUpdate(TShipCus entity, PostUpdateContext<TShipCus> context) {
    }

    @Override
    public void postDelete(TShipCus entity, PostDeleteContext<TShipCus> context) {
    }
}