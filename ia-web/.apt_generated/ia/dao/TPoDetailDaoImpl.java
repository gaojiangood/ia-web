package ia.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "1.38.0" }, date = "2016-03-05T12:46:07.887+0900")
public class TPoDetailDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements ia.dao.TPoDetailDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.38.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(ia.dao.TPoDetailDao.class, "delete", ia.entity.TPoDetail.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(ia.dao.TPoDetailDao.class, "insert", ia.entity.TPoDetail.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(ia.dao.TPoDetailDao.class, "update", ia.entity.TPoDetail.class);

    /** */
    public TPoDetailDaoImpl() {
        super(new ia.core.AppConfig());
    }

    /**
     * @param config the config
     */
    @javax.inject.Inject()
    public TPoDetailDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public int delete(ia.entity.TPoDetail entity) {
        entering("ia.dao.TPoDetailDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<ia.entity.TPoDetail> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<ia.entity.TPoDetail>(ia.entity._TPoDetail.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("ia.dao.TPoDetailDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TPoDetailDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TPoDetailDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int insert(ia.entity.TPoDetail entity) {
        entering("ia.dao.TPoDetailDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<ia.entity.TPoDetail> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<ia.entity.TPoDetail>(ia.entity._TPoDetail.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("ia.dao.TPoDetailDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(true);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TPoDetailDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TPoDetailDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<ia.entity.TPoDetail> selectAll(java.lang.String orderBy) {
        entering("ia.dao.TPoDetailDaoImpl", "selectAll", orderBy);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TPoDetailDao/selectAll.sql");
            __query.addParameter("orderBy", java.lang.String.class, orderBy);
            __query.setCallerClassName("ia.dao.TPoDetailDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TPoDetail>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TPoDetail>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<ia.entity.TPoDetail>(ia.entity._TPoDetail.getSingletonInternal()));
            java.util.List<ia.entity.TPoDetail> __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TPoDetailDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TPoDetailDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<ia.entity.TPoDetail> selectByExample(ia.entity.TPoDetail entity, java.lang.String orderBy) {
        entering("ia.dao.TPoDetailDaoImpl", "selectByExample", entity, orderBy);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TPoDetailDao/selectByExample.sql");
            __query.addParameter("entity", ia.entity.TPoDetail.class, entity);
            __query.addParameter("orderBy", java.lang.String.class, orderBy);
            __query.setCallerClassName("ia.dao.TPoDetailDaoImpl");
            __query.setCallerMethodName("selectByExample");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TPoDetail>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TPoDetail>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<ia.entity.TPoDetail>(ia.entity._TPoDetail.getSingletonInternal()));
            java.util.List<ia.entity.TPoDetail> __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TPoDetailDaoImpl", "selectByExample", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TPoDetailDaoImpl", "selectByExample", __e);
            throw __e;
        }
    }

    @Override
    public ia.entity.TPoDetail selectById(java.lang.String poDId) {
        entering("ia.dao.TPoDetailDaoImpl", "selectById", poDId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TPoDetailDao/selectById.sql");
            __query.addParameter("poDId", java.lang.String.class, poDId);
            __query.setCallerClassName("ia.dao.TPoDetailDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TPoDetail> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TPoDetail>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<ia.entity.TPoDetail>(ia.entity._TPoDetail.getSingletonInternal()));
            ia.entity.TPoDetail __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TPoDetailDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TPoDetailDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public ia.entity.TPoDetail selectByIdAndVersion(java.lang.String poDId, java.lang.Integer versionNo) {
        entering("ia.dao.TPoDetailDaoImpl", "selectByIdAndVersion", poDId, versionNo);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TPoDetailDao/selectByIdAndVersion.sql");
            __query.addParameter("poDId", java.lang.String.class, poDId);
            __query.addParameter("versionNo", java.lang.Integer.class, versionNo);
            __query.setCallerClassName("ia.dao.TPoDetailDaoImpl");
            __query.setCallerMethodName("selectByIdAndVersion");
            __query.setResultEnsured(true);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TPoDetail> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TPoDetail>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<ia.entity.TPoDetail>(ia.entity._TPoDetail.getSingletonInternal()));
            ia.entity.TPoDetail __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TPoDetailDaoImpl", "selectByIdAndVersion", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TPoDetailDaoImpl", "selectByIdAndVersion", __e);
            throw __e;
        }
    }

    @Override
    public int update(ia.entity.TPoDetail entity) {
        entering("ia.dao.TPoDetailDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<ia.entity.TPoDetail> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<ia.entity.TPoDetail>(ia.entity._TPoDetail.getSingletonInternal());
            __query.setMethod(__method6);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("ia.dao.TPoDetailDaoImpl");
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
            exiting("ia.dao.TPoDetailDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TPoDetailDaoImpl", "update", __e);
            throw __e;
        }
    }

}
