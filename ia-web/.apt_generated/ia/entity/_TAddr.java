package ia.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.38.0" }, date = "2016-03-05T12:46:07.020+0900")
public final class _TAddr extends org.seasar.doma.jdbc.entity.AbstractEntityType<ia.entity.TAddr> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.38.0");
    }

    private static final _TAddr __singleton = new _TAddr();

    /** the addr */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TAddr, java.lang.String, java.lang.Object> $addr = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TAddr, java.lang.String, java.lang.Object>(ia.entity.TAddr.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "addr", "ADDR", true, true);

    /** the addrId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, ia.entity.TAddr, java.lang.String, java.lang.Object> $addrId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, ia.entity.TAddr, java.lang.String, java.lang.Object>(ia.entity.TAddr.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "addrId", "ADDR_ID");

    /** the custId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TAddr, java.lang.String, java.lang.Object> $custId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TAddr, java.lang.String, java.lang.Object>(ia.entity.TAddr.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "custId", "CUST_ID", true, true);

    /** the postCode */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TAddr, java.lang.String, java.lang.Object> $postCode = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TAddr, java.lang.String, java.lang.Object>(ia.entity.TAddr.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "postCode", "POST_CODE", true, true);

    /** the receiver */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TAddr, java.lang.String, java.lang.Object> $receiver = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TAddr, java.lang.String, java.lang.Object>(ia.entity.TAddr.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "receiver", "RECEIVER", true, true);

    /** the regTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TAddr, java.sql.Timestamp, java.lang.Object> $regTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TAddr, java.sql.Timestamp, java.lang.Object>(ia.entity.TAddr.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "regTime", "REG_TIME", true, true);

    /** the regUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TAddr, java.lang.String, java.lang.Object> $regUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TAddr, java.lang.String, java.lang.Object>(ia.entity.TAddr.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "regUserId", "REG_USER_ID", true, true);

    /** the telNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TAddr, java.lang.String, java.lang.Object> $telNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TAddr, java.lang.String, java.lang.Object>(ia.entity.TAddr.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "telNo", "TEL_NO", true, true);

    /** the updTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TAddr, java.sql.Timestamp, java.lang.Object> $updTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TAddr, java.sql.Timestamp, java.lang.Object>(ia.entity.TAddr.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "updTime", "UPD_TIME", true, true);

    /** the updUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TAddr, java.lang.String, java.lang.Object> $updUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TAddr, java.lang.String, java.lang.Object>(ia.entity.TAddr.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "updUserId", "UPD_USER_ID", true, true);

    /** the versionNo */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TAddr, java.lang.Integer, java.lang.Object> $versionNo = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TAddr, java.lang.Integer, java.lang.Object>(ia.entity.TAddr.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "versionNo", "VERSION_NO");

    private final ia.entity.TAddrListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TAddr, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TAddr, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TAddr, ?>> __entityPropertyTypeMap;

    private _TAddr() {
        __listener = new ia.entity.TAddrListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "TAddr";
        __catalogName = "";
        __schemaName = "";
        __tableName = "T_ADDR";
        __qualifiedTableName = "T_ADDR";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TAddr, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TAddr, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TAddr, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TAddr, ?>>(11);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TAddr, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TAddr, ?>>(11);
        __list.add($addr);
        __map.put("addr", $addr);
        __idList.add($addrId);
        __list.add($addrId);
        __map.put("addrId", $addrId);
        __list.add($custId);
        __map.put("custId", $custId);
        __list.add($postCode);
        __map.put("postCode", $postCode);
        __list.add($receiver);
        __map.put("receiver", $receiver);
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
    public void preInsert(ia.entity.TAddr entity, org.seasar.doma.jdbc.entity.PreInsertContext<ia.entity.TAddr> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(ia.entity.TAddr entity, org.seasar.doma.jdbc.entity.PreUpdateContext<ia.entity.TAddr> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(ia.entity.TAddr entity, org.seasar.doma.jdbc.entity.PreDeleteContext<ia.entity.TAddr> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(ia.entity.TAddr entity, org.seasar.doma.jdbc.entity.PostInsertContext<ia.entity.TAddr> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(ia.entity.TAddr entity, org.seasar.doma.jdbc.entity.PostUpdateContext<ia.entity.TAddr> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(ia.entity.TAddr entity, org.seasar.doma.jdbc.entity.PostDeleteContext<ia.entity.TAddr> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TAddr, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TAddr, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TAddr, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, ia.entity.TAddr, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TAddr, ?, ?> getVersionPropertyType() {
        return $versionNo;
    }

    @Override
    public ia.entity.TAddr newEntity() {
        return new ia.entity.TAddr();
    }

    @Override
    public ia.entity.TAddr newEntity(java.util.Map<String, Object> __args) {
        return new ia.entity.TAddr();
    }

    @Override
    public Class<ia.entity.TAddr> getEntityClass() {
        return ia.entity.TAddr.class;
    }

    @Override
    public ia.entity.TAddr getOriginalStates(ia.entity.TAddr __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(ia.entity.TAddr __entity) {
    }

    /**
     * @return the singleton
     */
    public static _TAddr getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _TAddr newInstance() {
        return new _TAddr();
    }

}
