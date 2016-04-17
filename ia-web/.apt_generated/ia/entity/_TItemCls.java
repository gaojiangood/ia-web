package ia.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.38.0" }, date = "2016-03-05T12:46:07.129+0900")
public final class _TItemCls extends org.seasar.doma.jdbc.entity.AbstractEntityType<ia.entity.TItemCls> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.38.0");
    }

    private static final _TItemCls __singleton = new _TItemCls();

    /** the classId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, ia.entity.TItemCls, java.lang.String, java.lang.Object> $classId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, ia.entity.TItemCls, java.lang.String, java.lang.Object>(ia.entity.TItemCls.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "classId", "CLASS_ID");

    /** the classIdP */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItemCls, java.lang.String, java.lang.Object> $classIdP = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItemCls, java.lang.String, java.lang.Object>(ia.entity.TItemCls.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "classIdP", "CLASS_ID_P", true, true);

    /** the className */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItemCls, java.lang.String, java.lang.Object> $className = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItemCls, java.lang.String, java.lang.Object>(ia.entity.TItemCls.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "className", "CLASS_NAME", true, true);

    /** the regTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItemCls, java.sql.Timestamp, java.lang.Object> $regTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItemCls, java.sql.Timestamp, java.lang.Object>(ia.entity.TItemCls.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "regTime", "REG_TIME", true, true);

    /** the regUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItemCls, java.lang.String, java.lang.Object> $regUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItemCls, java.lang.String, java.lang.Object>(ia.entity.TItemCls.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "regUserId", "REG_USER_ID", true, true);

    /** the updTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItemCls, java.sql.Timestamp, java.lang.Object> $updTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItemCls, java.sql.Timestamp, java.lang.Object>(ia.entity.TItemCls.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "updTime", "UPD_TIME", true, true);

    /** the updUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItemCls, java.lang.String, java.lang.Object> $updUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItemCls, java.lang.String, java.lang.Object>(ia.entity.TItemCls.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "updUserId", "UPD_USER_ID", true, true);

    /** the versionNo */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TItemCls, java.lang.Integer, java.lang.Object> $versionNo = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TItemCls, java.lang.Integer, java.lang.Object>(ia.entity.TItemCls.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "versionNo", "VERSION_NO");

    private final ia.entity.TItemClsListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItemCls, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItemCls, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItemCls, ?>> __entityPropertyTypeMap;

    private _TItemCls() {
        __listener = new ia.entity.TItemClsListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "TItemCls";
        __catalogName = "";
        __schemaName = "";
        __tableName = "T_ITEM_CLS";
        __qualifiedTableName = "T_ITEM_CLS";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItemCls, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItemCls, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItemCls, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItemCls, ?>>(8);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItemCls, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItemCls, ?>>(8);
        __idList.add($classId);
        __list.add($classId);
        __map.put("classId", $classId);
        __list.add($classIdP);
        __map.put("classIdP", $classIdP);
        __list.add($className);
        __map.put("className", $className);
        __list.add($regTime);
        __map.put("regTime", $regTime);
        __list.add($regUserId);
        __map.put("regUserId", $regUserId);
        __list.add($updTime);
        __map.put("updTime", $updTime);
        __list.add($updUserId);
        __map.put("updUserId", $updUserId);
        __list.add($versionNo);
        __map.put("versionNo", $versionNo);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return __tableName;
    }

    @Override
    public String getQualifiedTableName() {
        return __qualifiedTableName;
    }

    @Override
    public void preInsert(ia.entity.TItemCls entity, org.seasar.doma.jdbc.entity.PreInsertContext<ia.entity.TItemCls> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(ia.entity.TItemCls entity, org.seasar.doma.jdbc.entity.PreUpdateContext<ia.entity.TItemCls> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(ia.entity.TItemCls entity, org.seasar.doma.jdbc.entity.PreDeleteContext<ia.entity.TItemCls> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(ia.entity.TItemCls entity, org.seasar.doma.jdbc.entity.PostInsertContext<ia.entity.TItemCls> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(ia.entity.TItemCls entity, org.seasar.doma.jdbc.entity.PostUpdateContext<ia.entity.TItemCls> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(ia.entity.TItemCls entity, org.seasar.doma.jdbc.entity.PostDeleteContext<ia.entity.TItemCls> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItemCls, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItemCls, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItemCls, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, ia.entity.TItemCls, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TItemCls, ?, ?> getVersionPropertyType() {
        return $versionNo;
    }

    @Override
    public ia.entity.TItemCls newEntity() {
        return new ia.entity.TItemCls();
    }

    @Override
    public ia.entity.TItemCls newEntity(java.util.Map<String, Object> __args) {
        return new ia.entity.TItemCls();
    }

    @Override
    public Class<ia.entity.TItemCls> getEntityClass() {
        return ia.entity.TItemCls.class;
    }

    @Override
    public ia.entity.TItemCls getOriginalStates(ia.entity.TItemCls __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(ia.entity.TItemCls __entity) {
    }

    /**
     * @return the singleton
     */
    public static _TItemCls getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _TItemCls newInstance() {
        return new _TItemCls();
    }

}
