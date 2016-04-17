package ia.dao.custom;

/** */
@javax.annotation.Generated(value = { "Doma", "1.38.0" }, date = "2016-03-05T12:46:08.022+0900")
public class TShipCusDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements ia.dao.custom.TShipCusDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.38.0");
    }

    /** */
    public TShipCusDaoImpl() {
        super(new ia.core.AppConfig());
    }

    /**
     * @param config the config
     */
    @javax.inject.Inject()
    public TShipCusDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<ia.entity.custom.TShipCus> selectShipList(ia.entity.TShip entity, java.lang.String orderBy) {
        entering("ia.dao.custom.TShipCusDaoImpl", "selectShipList", entity, orderBy);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/custom/TShipCusDao/selectShipList.sql");
            __query.addParameter("entity", ia.entity.TShip.class, entity);
            __query.addParameter("orderBy", java.lang.String.class, orderBy);
            __query.setCallerClassName("ia.dao.custom.TShipCusDaoImpl");
            __query.setCallerMethodName("selectShipList");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.custom.TShipCus>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.custom.TShipCus>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<ia.entity.custom.TShipCus>(ia.entity.custom._TShipCus.getSingletonInternal()));
            java.util.List<ia.entity.custom.TShipCus> __result = __command.execute();
            __query.complete();
            exiting("ia.dao.custom.TShipCusDaoImpl", "selectShipList", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.custom.TShipCusDaoImpl", "selectShipList", __e);
            throw __e;
        }
    }

}
