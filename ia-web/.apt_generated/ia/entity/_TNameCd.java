package ia.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.38.0" }, date = "2016-03-05T12:46:07.046+0900")
public final class _TNameCd extends org.seasar.doma.jdbc.entity.AbstractEntityType<ia.entity.TNameCd> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.38.0");
    }

    private static final _TNameCd __singleton = new _TNameCd();

    /** the comment */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TNameCd, java.lang.String, java.lang.Object> $comment = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TNameCd, java.lang.String, java.lang.Object>(ia.entity.TNameCd.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "comment", "COMMENT", true, true);

    /** the nameCd */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, ia.entity.TNameCd, java.lang.String, java.lang.Object> $nameCd = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, ia.entity.TNameCd, java.lang.String, java.lang.Object>(ia.entity.TNameCd.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "nameCd", "NAME_CD");

    /** the nameChar */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TNameCd, java.lang.String, java.lang.Object> $nameChar = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TNameCd, java.lang.String, java.lang.Object>(ia.entity.TNameCd.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "nameChar", "NAME_CHAR", true, true);

    /** the nameCls */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, ia.entity.TNameCd, java.lang.String, java.lang.Object> $nameCls = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, ia.entity.TNameCd, java.lang.String, java.lang.Object>(ia.entity.TNameCd.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "nameCls", "NAME_CLS");

    /** the nameNum */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TNameCd, java.lang.Integer, java.lang.Object> $nameNum = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TNameCd, java.lang.Integer, java.lang.Object>(ia.entity.TNameCd.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "nameNum", "NAME_NUM", true, true);

    /** the regTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TNameCd, java.sql.Timestamp, java.lang.Object> $regTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TNameCd, java.sql.Timestamp, java.lang.Object>(ia.entity.TNameCd.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "regTime", "REG_TIME", true, true);

    /** the regUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TNameCd, java.lang.String, java.lang.Object> $regUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TNameCd, java.lang.String, java.lang.Object>(ia.entity.TNameCd.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "regUserId", "REG_USER_ID", true, true);

    /** the updTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TNameCd, java.sql.Timestamp, java.lang.Object> $updTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TNameCd, java.sql.Timestamp, java.lang.Object>(ia.entity.TNameCd.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "updTime", "UPD_TIME", true, true);

    /** the updUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TNameCd, java.lang.String, java.lang.Object> $updUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TNameCd, java.lang.String, java.lang.Object>(ia.entity.TNameCd.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "updUserId", "UPD_USER_ID", true, true);

    /** the versionNo */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TNameCd, java.lang.Integer, java.lang.Object> $versionNo = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TNameCd, java.lang.Integer, java.lang.Object>(ia.entity.TNameCd.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "versionNo", "VERSION_NO");

    private final ia.entity.TNameCdListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TNameCd, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TNameCd, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TNameCd, ?>> __entityPropertyTypeMap;

    private _TNameCd() {
        __listener = new ia.entity.TNameCdListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "TNameCd";
        __catalogName = "";
        __schemaName = "";
        __tableName = "T_NAME_CD";
        __qualifiedTableName = "T_NAME_CD";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TNameCd, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TNameCd, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TNameCd, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TNameCd, ?>>(10);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TNameCd, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TNameCd, ?>>(10);
        __list.add($comment);
        __map.put("comment", $comment);
        __idList.add($nameCd);
        __list.add($nameCd);
        __map.put("nameCd", $nameCd);
        __list.add($nameChar);
        __map.put("nameChar", $nameChar);
        __idList.add($nameCls);
        __list.add($nameCls);
        __map.put("nameCls", $nameCls);
        __list.add($nameNum);
        __map.put("nameNum", $nameNum);
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
    public void preInsert(ia.entity.TNameCd entity, org.seasar.doma.jdbc.entity.PreInsertContext<ia.entity.TNameCd> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(ia.entity.TNameCd entity, org.seasar.doma.jdbc.entity.PreUpdateContext<ia.entity.TNameCd> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(ia.entity.TNameCd entity, org.seasar.doma.jdbc.entity.PreDeleteContext<ia.entity.TNameCd> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(ia.entity.TNameCd entity, org.seasar.doma.jdbc.entity.PostInsertContext<ia.entity.TNameCd> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(ia.entity.TNameCd entity, org.seasar.doma.jdbc.entity.PostUpdateContext<ia.entity.TNameCd> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(ia.entity.TNameCd entity, org.seasar.doma.jdbc.entity.PostDeleteContext<ia.entity.TNameCd> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TNameCd, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TNameCd, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TNameCd, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, ia.entity.TNameCd, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TNameCd, ?, ?> getVersionPropertyType() {
        return $versionNo;
    }

    @Override
    public ia.entity.TNameCd newEntity() {
        return new ia.entity.TNameCd();
    }

    @Override
    public ia.entity.TNameCd newEntity(java.util.Map<String, Object> __args) {
        return new ia.entity.TNameCd();
    }

    @Override
    public Class<ia.entity.TNameCd> getEntityClass() {
        return ia.entity.TNameCd.class;
    }

    @Override
    public ia.entity.TNameCd getOriginalStates(ia.entity.TNameCd __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(ia.entity.TNameCd __entity) {
    }

    /**
     * @return the singleton
     */
    public static _TNameCd getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _TNameCd newInstance() {
        return new _TNameCd();
    }

}
