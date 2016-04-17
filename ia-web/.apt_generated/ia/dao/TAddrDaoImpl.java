package ia.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "1.38.0" }, date = "2016-03-05T12:46:08.011+0900")
public class TAddrDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements ia.dao.TAddrDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.38.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(ia.dao.TAddrDao.class, "delete", ia.entity.TAddr.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(ia.dao.TAddrDao.class, "insert", ia.entity.TAddr.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(ia.dao.TAddrDao.class, "update", ia.entity.TAddr.class);

    /** */
    public TAddrDaoImpl() {
        super(new ia.core.AppConfig());
    }

    /**
     * @param config the config
     */
    @javax.inject.Inject()
    public TAddrDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public int delete(ia.entity.TAddr entity) {
        entering("ia.dao.TAddrDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<ia.entity.TAddr> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<ia.entity.TAddr>(ia.entity._TAddr.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("ia.dao.TAddrDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TAddrDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TAddrDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int insert(ia.entity.TAddr entity) {
        entering("ia.dao.TAddrDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<ia.entity.TAddr> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<ia.entity.TAddr>(ia.entity._TAddr.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("ia.dao.TAddrDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(true);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TAddrDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TAddrDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<ia.entity.TAddr> selectAll(java.lang.String orderBy) {
        entering("ia.dao.TAddrDaoImpl", "selectAll", orderBy);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TAddrDao/selectAll.sql");
            __query.addParameter("orderBy", java.lang.String.class, orderBy);
            __query.setCallerClassName("ia.dao.TAddrDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TAddr>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TAddr>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<ia.entity.TAddr>(ia.entity._TAddr.getSingletonInternal()));
            java.util.List<ia.entity.TAddr> __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TAddrDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TAddrDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<ia.entity.TAddr> selectByExample(ia.entity.TAddr entity, java.lang.String orderBy) {
        entering("ia.dao.TAddrDaoImpl", "selectByExample", entity, orderBy);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TAddrDao/selectByExample.sql");
            __query.addParameter("entity", ia.entity.TAddr.class, entity);
            __query.addParameter("orderBy", java.lang.String.class, orderBy);
            __query.setCallerClassName("ia.dao.TAddrDaoImpl");
            __query.setCallerMethodName("selectByExample");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TAddr>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TAddr>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<ia.entity.TAddr>(ia.entity._TAddr.getSingletonInternal()));
            java.util.List<ia.entity.TAddr> __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TAddrDaoImpl", "selectByExample", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TAddrDaoImpl", "selectByExample", __e);
            throw __e;
        }
    }

    @Override
    public ia.entity.TAddr selectById(java.lang.String addrId) {
        entering("ia.dao.TAddrDaoImpl", "selectById", addrId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TAddrDao/selectById.sql");
            __query.addParameter("addrId", java.lang.String.class, addrId);
            __query.setCallerClassName("ia.dao.TAddrDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TAddr> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TAddr>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<ia.entity.TAddr>(ia.entity._TAddr.getSingletonInternal()));
            ia.entity.TAddr __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TAddrDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TAddrDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public ia.entity.TAddr selectByIdAndVersion(java.lang.String addrId, java.lang.Integer versionNo) {
        entering("ia.dao.TAddrDaoImpl", "selectByIdAndVersion", addrId, versionNo);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TAddrDao/selectByIdAndVersion.sql");
            __query.addParameter("addrId", java.lang.String.class, addrId);
            __query.addParameter("versionNo", java.lang.Integer.class, versionNo);
            __query.setCallerClassName("ia.dao.TAddrDaoImpl");
            __query.setCallerMethodName("selectByIdAndVersion");
            __query.setResultEnsured(true);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TAddr> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TAddr>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<ia.entity.TAddr>(ia.entity._TAddr.getSingletonInternal()));
            ia.entity.TAddr __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TAddrDaoImpl", "selectByIdAndVersion", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TAddrDaoImpl", "selectByIdAndVersion", __e);
            throw __e;
        }
    }

    @Override
    public int update(ia.entity.TAddr entity) {
        entering("ia.dao.TAddrDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<ia.entity.TAddr> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<ia.entity.TAddr>(ia.entity._TAddr.getSingletonInternal());
            __query.setMethod(__method6);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("ia.dao.TAddrDaoImpl");
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
            exiting("ia.dao.TAddrDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TAddrDaoImpl", "update", __e);
            throw __e;
        }
    }

}
