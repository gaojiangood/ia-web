package ia.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.38.0" }, date = "2016-03-05T12:46:07.121+0900")
public final class _TShip extends org.seasar.doma.jdbc.entity.AbstractEntityType<ia.entity.TShip> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.38.0");
    }

    private static final _TShip __singleton = new _TShip();

    /** the addrId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object> $addrId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object>(ia.entity.TShip.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "addrId", "ADDR_ID", true, true);

    /** the custId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object> $custId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object>(ia.entity.TShip.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "custId", "CUST_ID", true, true);

    /** the labelDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.sql.Timestamp, java.lang.Object> $labelDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.sql.Timestamp, java.lang.Object>(ia.entity.TShip.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "labelDate", "LABEL_DATE", true, true);

    /** the lableNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object> $lableNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object>(ia.entity.TShip.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "lableNo", "LABLE_NO", true, true);

    /** the lableState */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object> $lableState = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object>(ia.entity.TShip.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "lableState", "LABLE_STATE", true, true);

    /** the regTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.sql.Timestamp, java.lang.Object> $regTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.sql.Timestamp, java.lang.Object>(ia.entity.TShip.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "regTime", "REG_TIME", true, true);

    /** the regUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object> $regUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object>(ia.entity.TShip.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "regUserId", "REG_USER_ID", true, true);

    /** the shipAddr */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object> $shipAddr = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object>(ia.entity.TShip.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "shipAddr", "SHIP_ADDR", true, true);

    /** the shipDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.util.Date, java.lang.Object> $shipDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.util.Date, java.lang.Object>(ia.entity.TShip.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "shipDate", "SHIP_DATE", true, true);

    /** the shipFee */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.math.BigDecimal, java.lang.Object> $shipFee = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.math.BigDecimal, java.lang.Object>(ia.entity.TShip.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "shipFee", "SHIP_FEE", true, true);

    /** the shipId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object> $shipId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object>(ia.entity.TShip.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "shipId", "SHIP_ID");

    /** the shipState */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object> $shipState = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object>(ia.entity.TShip.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "shipState", "SHIP_STATE", true, true);

    /** the shipWay */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object> $shipWay = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object>(ia.entity.TShip.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "shipWay", "SHIP_WAY", true, true);

    /** the updTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.sql.Timestamp, java.lang.Object> $updTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.sql.Timestamp, java.lang.Object>(ia.entity.TShip.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "updTime", "UPD_TIME", true, true);

    /** the updUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object> $updUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.lang.String, java.lang.Object>(ia.entity.TShip.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "updUserId", "UPD_USER_ID", true, true);

    /** the versionNo */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TShip, java.lang.Integer, java.lang.Object> $versionNo = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TShip, java.lang.Integer, java.lang.Object>(ia.entity.TShip.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "versionNo", "VERSION_NO");

    /** the wight */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.math.BigDecimal, java.lang.Object> $wight = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TShip, java.math.BigDecimal, java.lang.Object>(ia.entity.TShip.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "wight", "WIGHT", true, true);

    private final ia.entity.TShipListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TShip, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TShip, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TShip, ?>> __entityPropertyTypeMap;

    private _TShip() {
        __listener = new ia.entity.TShipListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "TShip";
        __catalogName = "";
        __schemaName = "";
        __tableName = "T_SHIP";
        __qualifiedTableName = "T_SHIP";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TShip, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TShip, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TShip, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TShip, ?>>(17);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TShip, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TShip, ?>>(17);
        __list.add($addrId);
        __map.put("addrId", $addrId);
        __list.add($custId);
        __map.put("custId", $custId);
        __list.add($labelDate);
        __map.put("labelDate", $labelDate);
        __list.add($lableNo);
        __map.put("lableNo", $lableNo);
        __list.add($lableState);
        __map.put("lableState", $lableState);
        __list.add($regTime);
        __map.put("regTime", $regTime);
        __list.add($regUserId);
        __map.put("regUserId", $regUserId);
        __list.add($shipAddr);
        __map.put("shipAddr", $shipAddr);
        __list.add($shipDate);
        __map.put("shipDate", $shipDate);
        __list.add($shipFee);
        __map.put("shipFee", $shipFee);
        __idList.add($shipId);
        __list.add($shipId);
        __map.put("shipId", $shipId);
        __list.add($shipState);
        __map.put("shipState", $shipState);
        __list.add($shipWay);
        __map.put("shipWay", $shipWay);
        __list.add($updTime);
        __map.put("updTime", $updTime);
        __list.add($updUserId);
        __map.put("updUserId", $updUserId);
        __list.add($versionNo);
        __map.put("versionNo", $versionNo);
        __list.add($wight);
        __map.put("wight", $wight);
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
    public void preInsert(ia.entity.TShip entity, org.seasar.doma.jdbc.entity.PreInsertContext<ia.entity.TShip> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(ia.entity.TShip entity, org.seasar.doma.jdbc.entity.PreUpdateContext<ia.entity.TShip> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(ia.entity.TShip entity, org.seasar.doma.jdbc.entity.PreDeleteContext<ia.entity.TShip> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(ia.entity.TShip entity, org.seasar.doma.jdbc.entity.PostInsertContext<ia.entity.TShip> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(ia.entity.TShip entity, org.seasar.doma.jdbc.entity.PostUpdateContext<ia.entity.TShip> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(ia.entity.TShip entity, org.seasar.doma.jdbc.entity.PostDeleteContext<ia.entity.TShip> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TShip, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TShip, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TShip, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, ia.entity.TShip, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TShip, ?, ?> getVersionPropertyType() {
        return $versionNo;
    }

    @Override
    public ia.entity.TShip newEntity() {
        return new ia.entity.TShip();
    }

    @Override
    public ia.entity.TShip newEntity(java.util.Map<String, Object> __args) {
        return new ia.entity.TShip();
    }

    @Override
    public Class<ia.entity.TShip> getEntityClass() {
        return ia.entity.TShip.class;
    }

    @Override
    public ia.entity.TShip getOriginalStates(ia.entity.TShip __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(ia.entity.TShip __entity) {
    }

    /**
     * @return the singleton
     */
    public static _TShip getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _TShip newInstance() {
        return new _TShip();
    }

}
