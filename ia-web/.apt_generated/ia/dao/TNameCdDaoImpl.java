package ia.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "1.38.0" }, date = "2016-03-05T12:46:08.051+0900")
public class TNameCdDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements ia.dao.TNameCdDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.38.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(ia.dao.TNameCdDao.class, "delete", ia.entity.TNameCd.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(ia.dao.TNameCdDao.class, "insert", ia.entity.TNameCd.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(ia.dao.TNameCdDao.class, "update", ia.entity.TNameCd.class);

    /** */
    public TNameCdDaoImpl() {
        super(new ia.core.AppConfig());
    }

    /**
     * @param config the config
     */
    @javax.inject.Inject()
    public TNameCdDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public int delete(ia.entity.TNameCd entity) {
        entering("ia.dao.TNameCdDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<ia.entity.TNameCd> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<ia.entity.TNameCd>(ia.entity._TNameCd.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("ia.dao.TNameCdDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TNameCdDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TNameCdDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int insert(ia.entity.TNameCd entity) {
        entering("ia.dao.TNameCdDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<ia.entity.TNameCd> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<ia.entity.TNameCd>(ia.entity._TNameCd.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("ia.dao.TNameCdDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(true);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TNameCdDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TNameCdDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<ia.entity.TNameCd> selectAll(java.lang.String orderBy) {
        entering("ia.dao.TNameCdDaoImpl", "selectAll", orderBy);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TNameCdDao/selectAll.sql");
            __query.addParameter("orderBy", java.lang.String.class, orderBy);
            __query.setCallerClassName("ia.dao.TNameCdDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TNameCd>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TNameCd>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<ia.entity.TNameCd>(ia.entity._TNameCd.getSingletonInternal()));
            java.util.List<ia.entity.TNameCd> __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TNameCdDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TNameCdDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<ia.entity.TNameCd> selectByExample(ia.entity.TNameCd entity, java.lang.String orderBy) {
        entering("ia.dao.TNameCdDaoImpl", "selectByExample", entity, orderBy);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TNameCdDao/selectByExample.sql");
            __query.addParameter("entity", ia.entity.TNameCd.class, entity);
            __query.addParameter("orderBy", java.lang.String.class, orderBy);
            __query.setCallerClassName("ia.dao.TNameCdDaoImpl");
            __query.setCallerMethodName("selectByExample");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TNameCd>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TNameCd>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<ia.entity.TNameCd>(ia.entity._TNameCd.getSingletonInternal()));
            java.util.List<ia.entity.TNameCd> __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TNameCdDaoImpl", "selectByExample", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TNameCdDaoImpl", "selectByExample", __e);
            throw __e;
        }
    }

    @Override
    public ia.entity.TNameCd selectById(java.lang.String nameCls, java.lang.String nameCd) {
        entering("ia.dao.TNameCdDaoImpl", "selectById", nameCls, nameCd);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TNameCdDao/selectById.sql");
            __query.addParameter("nameCls", java.lang.String.class, nameCls);
            __query.addParameter("nameCd", java.lang.String.class, nameCd);
            __query.setCallerClassName("ia.dao.TNameCdDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TNameCd> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TNameCd>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<ia.entity.TNameCd>(ia.entity._TNameCd.getSingletonInternal()));
            ia.entity.TNameCd __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TNameCdDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TNameCdDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public ia.entity.TNameCd selectByIdAndVersion(java.lang.String nameCls, java.lang.String nameCd, java.lang.Integer versionNo) {
        entering("ia.dao.TNameCdDaoImpl", "selectByIdAndVersion", nameCls, nameCd, versionNo);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TNameCdDao/selectByIdAndVersion.sql");
            __query.addParameter("nameCls", java.lang.String.class, nameCls);
            __query.addParameter("nameCd", java.lang.String.class, nameCd);
            __query.addParameter("versionNo", java.lang.Integer.class, versionNo);
            __query.setCallerClassName("ia.dao.TNameCdDaoImpl");
            __query.setCallerMethodName("selectByIdAndVersion");
            __query.setResultEnsured(true);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TNameCd> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TNameCd>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<ia.entity.TNameCd>(ia.entity._TNameCd.getSingletonInternal()));
            ia.entity.TNameCd __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TNameCdDaoImpl", "selectByIdAndVersion", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TNameCdDaoImpl", "selectByIdAndVersion", __e);
            throw __e;
        }
    }

    @Override
    public int update(ia.entity.TNameCd entity) {
        entering("ia.dao.TNameCdDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<ia.entity.TNameCd> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<ia.entity.TNameCd>(ia.entity._TNameCd.getSingletonInternal());
            __query.setMethod(__method6);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("ia.dao.TNameCdDaoImpl");
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
            exiting("ia.dao.TNameCdDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TNameCdDaoImpl", "update", __e);
            throw __e;
        }
    }

}
