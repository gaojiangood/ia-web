package ia.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.38.0" }, date = "2016-03-05T12:46:07.011+0900")
public final class _TCustomer extends org.seasar.doma.jdbc.entity.AbstractEntityType<ia.entity.TCustomer> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.38.0");
    }

    private static final _TCustomer __singleton = new _TCustomer();

    /** the comment */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.String, java.lang.Object> $comment = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.String, java.lang.Object>(ia.entity.TCustomer.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "comment", "COMMENT", true, true);

    /** the custId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.String, java.lang.Object> $custId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.String, java.lang.Object>(ia.entity.TCustomer.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "custId", "CUST_ID");

    /** the custIdP */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.String, java.lang.Object> $custIdP = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.String, java.lang.Object>(ia.entity.TCustomer.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "custIdP", "CUST_ID_P", true, true);

    /** the custName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.String, java.lang.Object> $custName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.String, java.lang.Object>(ia.entity.TCustomer.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "custName", "CUST_NAME", true, true);

    /** the regTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.sql.Timestamp, java.lang.Object> $regTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.sql.Timestamp, java.lang.Object>(ia.entity.TCustomer.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "regTime", "REG_TIME", true, true);

    /** the regUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.String, java.lang.Object> $regUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.String, java.lang.Object>(ia.entity.TCustomer.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "regUserId", "REG_USER_ID", true, true);

    /** the telNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.String, java.lang.Object> $telNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.String, java.lang.Object>(ia.entity.TCustomer.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "telNo", "TEL_NO", true, true);

    /** the updTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.sql.Timestamp, java.lang.Object> $updTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.sql.Timestamp, java.lang.Object>(ia.entity.TCustomer.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "updTime", "UPD_TIME", true, true);

    /** the updUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.String, java.lang.Object> $updUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.String, java.lang.Object>(ia.entity.TCustomer.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "updUserId", "UPD_USER_ID", true, true);

    /** the versionNo */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.Integer, java.lang.Object> $versionNo = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.Integer, java.lang.Object>(ia.entity.TCustomer.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "versionNo", "VERSION_NO");

    /** the weichatId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.String, java.lang.Object> $weichatId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.String, java.lang.Object>(ia.entity.TCustomer.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "weichatId", "WEICHAT_ID", true, true);

    /** the weichatName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.String, java.lang.Object> $weichatName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TCustomer, java.lang.String, java.lang.Object>(ia.entity.TCustomer.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "weichatName", "WEICHAT_NAME", true, true);

    private final ia.entity.TCustomerListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TCustomer, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TCustomer, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TCustomer, ?>> __entityPropertyTypeMap;

    private _TCustomer() {
        __listener = new ia.entity.TCustomerListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "TCustomer";
        __catalogName = "";
        __schemaName = "";
        __tableName = "T_CUSTOMER";
        __qualifiedTableName = "T_CUSTOMER";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TCustomer, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TCustomer, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TCustomer, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TCustomer, ?>>(12);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TCustomer, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TCustomer, ?>>(12);
        __list.add($comment);
        __map.put("comment", $comment);
        __idList.add($custId);
        __list.add($custId);
        __map.put("custId", $custId);
        __list.add($custIdP);
        __map.put("custIdP", $custIdP);
        __list.add($custName);
        __map.put("custName", $custName);
        __list.add($regTime);
        __map.put("regTime", $regTime);
        __list.add($regUserId);
        __map.put("regUserId", $regUserId);
        __list.add($telNo);
        __map.put("telNo", $telNo);
        __list.add($updTime);
        __map.put("updTime", $updTime);
        __list.add($updUserId);
        __map.put("updUserId", $updUserId);
        __list.add($versionNo);
        __map.put("versionNo", $versionNo);
        __list.add($weichatId);
        __map.put("weichatId", $weichatId);
        __list.add($weichatName);
        __map.put("weichatName", $weichatName);
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
    public void preInsert(ia.entity.TCustomer entity, org.seasar.doma.jdbc.entity.PreInsertContext<ia.entity.TCustomer> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(ia.entity.TCustomer entity, org.seasar.doma.jdbc.entity.PreUpdateContext<ia.entity.TCustomer> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(ia.entity.TCustomer entity, org.seasar.doma.jdbc.entity.PreDeleteContext<ia.entity.TCustomer> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(ia.entity.TCustomer entity, org.seasar.doma.jdbc.entity.PostInsertContext<ia.entity.TCustomer> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(ia.entity.TCustomer entity, org.seasar.doma.jdbc.entity.PostUpdateContext<ia.entity.TCustomer> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(ia.entity.TCustomer entity, org.seasar.doma.jdbc.entity.PostDeleteContext<ia.entity.TCustomer> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TCustomer, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TCustomer, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TCustomer, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, ia.entity.TCustomer, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TCustomer, ?, ?> getVersionPropertyType() {
        return $versionNo;
    }

    @Override
    public ia.entity.TCustomer newEntity() {
        return new ia.entity.TCustomer();
    }

    @Override
    public ia.entity.TCustomer newEntity(java.util.Map<String, Object> __args) {
        return new ia.entity.TCustomer();
    }

    @Override
    public Class<ia.entity.TCustomer> getEntityClass() {
        return ia.entity.TCustomer.class;
    }

    @Override
    public ia.entity.TCustomer getOriginalStates(ia.entity.TCustomer __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(ia.entity.TCustomer __entity) {
    }

    /**
     * @return the singleton
     */
    public static _TCustomer getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _TCustomer newInstance() {
        return new _TCustomer();
    }

}
