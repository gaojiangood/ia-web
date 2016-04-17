package ia.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "1.38.0" }, date = "2016-03-05T12:46:07.743+0900")
public class TCustomerDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements ia.dao.TCustomerDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.38.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(ia.dao.TCustomerDao.class, "delete", ia.entity.TCustomer.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(ia.dao.TCustomerDao.class, "insert", ia.entity.TCustomer.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(ia.dao.TCustomerDao.class, "update", ia.entity.TCustomer.class);

    /** */
    public TCustomerDaoImpl() {
        super(new ia.core.AppConfig());
    }

    /**
     * @param config the config
     */
    @javax.inject.Inject()
    public TCustomerDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public int delete(ia.entity.TCustomer entity) {
        entering("ia.dao.TCustomerDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<ia.entity.TCustomer> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<ia.entity.TCustomer>(ia.entity._TCustomer.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("ia.dao.TCustomerDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TCustomerDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TCustomerDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int insert(ia.entity.TCustomer entity) {
        entering("ia.dao.TCustomerDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<ia.entity.TCustomer> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<ia.entity.TCustomer>(ia.entity._TCustomer.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("ia.dao.TCustomerDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(true);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TCustomerDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TCustomerDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<ia.entity.TCustomer> selectAll(java.lang.String orderBy) {
        entering("ia.dao.TCustomerDaoImpl", "selectAll", orderBy);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TCustomerDao/selectAll.sql");
            __query.addParameter("orderBy", java.lang.String.class, orderBy);
            __query.setCallerClassName("ia.dao.TCustomerDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TCustomer>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TCustomer>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<ia.entity.TCustomer>(ia.entity._TCustomer.getSingletonInternal()));
            java.util.List<ia.entity.TCustomer> __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TCustomerDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TCustomerDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<ia.entity.TCustomer> selectByExample(ia.entity.TCustomer entity, java.lang.String orderBy) {
        entering("ia.dao.TCustomerDaoImpl", "selectByExample", entity, orderBy);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TCustomerDao/selectByExample.sql");
            __query.addParameter("entity", ia.entity.TCustomer.class, entity);
            __query.addParameter("orderBy", java.lang.String.class, orderBy);
            __query.setCallerClassName("ia.dao.TCustomerDaoImpl");
            __query.setCallerMethodName("selectByExample");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TCustomer>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<ia.entity.TCustomer>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<ia.entity.TCustomer>(ia.entity._TCustomer.getSingletonInternal()));
            java.util.List<ia.entity.TCustomer> __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TCustomerDaoImpl", "selectByExample", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TCustomerDaoImpl", "selectByExample", __e);
            throw __e;
        }
    }

    @Override
    public ia.entity.TCustomer selectById(java.lang.String custId) {
        entering("ia.dao.TCustomerDaoImpl", "selectById", custId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TCustomerDao/selectById.sql");
            __query.addParameter("custId", java.lang.String.class, custId);
            __query.setCallerClassName("ia.dao.TCustomerDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TCustomer> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TCustomer>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<ia.entity.TCustomer>(ia.entity._TCustomer.getSingletonInternal()));
            ia.entity.TCustomer __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TCustomerDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TCustomerDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public ia.entity.TCustomer selectByIdAndVersion(java.lang.String custId, java.lang.String custIdP, java.lang.Integer versionNo) {
        entering("ia.dao.TCustomerDaoImpl", "selectByIdAndVersion", custId, custIdP, versionNo);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/ia/dao/TCustomerDao/selectByIdAndVersion.sql");
            __query.addParameter("custId", java.lang.String.class, custId);
            __query.addParameter("custIdP", java.lang.String.class, custIdP);
            __query.addParameter("versionNo", java.lang.Integer.class, versionNo);
            __query.setCallerClassName("ia.dao.TCustomerDaoImpl");
            __query.setCallerMethodName("selectByIdAndVersion");
            __query.setResultEnsured(true);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TCustomer> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<ia.entity.TCustomer>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<ia.entity.TCustomer>(ia.entity._TCustomer.getSingletonInternal()));
            ia.entity.TCustomer __result = __command.execute();
            __query.complete();
            exiting("ia.dao.TCustomerDaoImpl", "selectByIdAndVersion", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TCustomerDaoImpl", "selectByIdAndVersion", __e);
            throw __e;
        }
    }

    @Override
    public int update(ia.entity.TCustomer entity) {
        entering("ia.dao.TCustomerDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<ia.entity.TCustomer> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<ia.entity.TCustomer>(ia.entity._TCustomer.getSingletonInternal());
            __query.setMethod(__method6);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("ia.dao.TCustomerDaoImpl");
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
            exiting("ia.dao.TCustomerDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("ia.dao.TCustomerDaoImpl", "update", __e);
            throw __e;
        }
    }

}
