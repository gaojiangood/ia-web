package ia.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "1.38.0" }, date = "2016-03-05T12:46:08.157+0900")
public class TItemDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements ia.dao.TItemDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.38.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(ia.dao.TItemDao.class, "delete", ia.entity.TItem.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(ia.dao.TItemDao.class, "insert", ia.entity.TItem.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(ia.dao.TItemDao.class, "update", ia.entity.TItem.class);

    /** */
    public TItemDaoImpl() {
        super(new ia.core.AppConfig());
    }

    /**
     * @param config the config
     */
    @javax.inject.Inject()
    public TItemDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public int delete(ia.entity.TItem entity) {
        entering("ia.dao.TItemDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<ia.entity.TItem> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<ia.entity.TItem>(ia.entity._TItem.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("ia.dao.TItemDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TItemDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TItemDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int insert(ia.entity.TItem entity) {
        entering("ia.dao.TItemDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<ia.entity.TItem> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<ia.entity.TItem>(ia.entity._TItem.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("ia.dao.TItemDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(true);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TItemDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TItemDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<ia.entity.TItem> selectAll(java.lang.String orderBy) {
        entering("ia.dao.TItemDaoImpl", "selectAll", orderBy);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TItemDao/selectAll.sql");
            __query.addParameter("orderBy", java.lang.String.class, orderBy);
            __query.setCallerClassName("ia.dao.TItemDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TItem>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TItem>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<ia.entity.TItem>(ia.entity._TItem.getSingletonInternal()));
            java.util.List<ia.entity.TItem> __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TItemDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TItemDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<ia.entity.TItem> selectByExample(ia.entity.TItem entity, java.lang.String orderBy) {
        entering("ia.dao.TItemDaoImpl", "selectByExample", entity, orderBy);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TItemDao/selectByExample.sql");
            __query.addParameter("entity", ia.entity.TItem.class, entity);
            __query.addParameter("orderBy", java.lang.String.class, orderBy);
            __query.setCallerClassName("ia.dao.TItemDaoImpl");
            __query.setCallerMethodName("selectByExample");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TItem>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TItem>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<ia.entity.TItem>(ia.entity._TItem.getSingletonInternal()));
            java.util.List<ia.entity.TItem> __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TItemDaoImpl", "selectByExample", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TItemDaoImpl", "selectByExample", __e);
            throw __e;
        }
    }

    @Override
    public ia.entity.TItem selectById(java.lang.String itemId) {
        entering("ia.dao.TItemDaoImpl", "selectById", itemId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TItemDao/selectById.sql");
            __query.addParameter("itemId", java.lang.String.class, itemId);
            __query.setCallerClassName("ia.dao.TItemDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TItem> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TItem>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<ia.entity.TItem>(ia.entity._TItem.getSingletonInternal()));
            ia.entity.TItem __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TItemDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TItemDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public ia.entity.TItem selectByIdAndVersion(java.lang.String itemId, java.lang.Integer versionNo) {
        entering("ia.dao.TItemDaoImpl", "selectByIdAndVersion", itemId, versionNo);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TItemDao/selectByIdAndVersion.sql");
            __query.addParameter("itemId", java.lang.String.class, itemId);
            __query.addParameter("versionNo", java.lang.Integer.class, versionNo);
            __query.setCallerClassName("ia.dao.TItemDaoImpl");
            __query.setCallerMethodName("selectByIdAndVersion");
            __query.setResultEnsured(true);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TItem> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TItem>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<ia.entity.TItem>(ia.entity._TItem.getSingletonInternal()));
            ia.entity.TItem __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TItemDaoImpl", "selectByIdAndVersion", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TItemDaoImpl", "selectByIdAndVersion", __e);
            throw __e;
        }
    }

    @Override
    public int update(ia.entity.TItem entity) {
        entering("ia.dao.TItemDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<ia.entity.TItem> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<ia.entity.TItem>(ia.entity._TItem.getSingletonInternal());
            __query.setMethod(__method6);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("ia.dao.TItemDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(true);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TItemDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TItemDaoImpl", "update", __e);
            throw __e;
        }
    }

}
