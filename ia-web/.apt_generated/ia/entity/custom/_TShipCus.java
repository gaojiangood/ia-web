package ia.entity.custom;

/** */
@javax.annotation.Generated(value = { "Doma", "1.38.0" }, date = "2016-03-05T12:46:07.089+0900")
public final class _TShipCus extends org.seasar.doma.jdbc.entity.AbstractEntityType<ia.entity.custom.TShipCus> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.38.0");
    }

    private static final _TShipCus __singleton = new _TShipCus();

    /** the addrId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object> $addrId = new org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object>(ia.entity.custom.TShipCus.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, ia.entity._TShip.getSingletonInternal().$addrId, null, "addrId", "ADDR_ID", true, true);

    /** the custId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object> $custId = new org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object>(ia.entity.custom.TShipCus.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, ia.entity._TShip.getSingletonInternal().$custId, null, "custId", "CUST_ID", true, true);

    /** the labelDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.sql.Timestamp, java.lang.Object> $labelDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.sql.Timestamp, java.lang.Object>(ia.entity.custom.TShipCus.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, ia.entity._TShip.getSingletonInternal().$labelDate, null, "labelDate", "LABEL_DATE", true, true);

    /** the lableNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object> $lableNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object>(ia.entity.custom.TShipCus.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, ia.entity._TShip.getSingletonInternal().$lableNo, null, "lableNo", "LABLE_NO", true, true);

    /** the lableState */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object> $lableState = new org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object>(ia.entity.custom.TShipCus.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, ia.entity._TShip.getSingletonInternal().$lableState, null, "lableState", "LABLE_STATE", true, true);

    /** the regTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.sql.Timestamp, java.lang.Object> $regTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.sql.Timestamp, java.lang.Object>(ia.entity.custom.TShipCus.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, ia.entity._TShip.getSingletonInternal().$regTime, null, "regTime", "REG_TIME", true, true);

    /** the regUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object> $regUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object>(ia.entity.custom.TShipCus.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, ia.entity._TShip.getSingletonInternal().$regUserId, null, "regUserId", "REG_USER_ID", true, true);

    /** the shipAddr */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object> $shipAddr = new org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object>(ia.entity.custom.TShipCus.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, ia.entity._TShip.getSingletonInternal().$shipAddr, null, "shipAddr", "SHIP_ADDR", true, true);

    /** the shipDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.util.Date, java.lang.Object> $shipDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.util.Date, java.lang.Object>(ia.entity.custom.TShipCus.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, ia.entity._TShip.getSingletonInternal().$shipDate, null, "shipDate", "SHIP_DATE", true, true);

    /** the shipFee */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.math.BigDecimal, java.lang.Object> $shipFee = new org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.math.BigDecimal, java.lang.Object>(ia.entity.custom.TShipCus.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, ia.entity._TShip.getSingletonInternal().$shipFee, null, "shipFee", "SHIP_FEE", true, true);

    /** the shipId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object> $shipId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object>(ia.entity.custom.TShipCus.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, ia.entity._TShip.getSingletonInternal().$shipId, null, "shipId", "SHIP_ID");

    /** the shipState */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object> $shipState = new org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object>(ia.entity.custom.TShipCus.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, ia.entity._TShip.getSingletonInternal().$shipState, null, "shipState", "SHIP_STATE", true, true);

    /** the shipWay */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object> $shipWay = new org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object>(ia.entity.custom.TShipCus.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, ia.entity._TShip.getSingletonInternal().$shipWay, null, "shipWay", "SHIP_WAY", true, true);

    /** the updTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.sql.Timestamp, java.lang.Object> $updTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.sql.Timestamp, java.lang.Object>(ia.entity.custom.TShipCus.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, ia.entity._TShip.getSingletonInternal().$updTime, null, "updTime", "UPD_TIME", true, true);

    /** the updUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object> $updUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.String, java.lang.Object>(ia.entity.custom.TShipCus.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, ia.entity._TShip.getSingletonInternal().$updUserId, null, "updUserId", "UPD_USER_ID", true, true);

    /** the versionNo */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.Integer, java.lang.Object> $versionNo = new org.seasar.doma.jdbc.entity.VersionPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.lang.Integer, java.lang.Object>(ia.entity.custom.TShipCus.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, ia.entity._TShip.getSingletonInternal().$versionNo, null, "versionNo", "VERSION_NO");

    /** the wight */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.math.BigDecimal, java.lang.Object> $wight = new org.seasar.doma.jdbc.entity.BasicPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, java.math.BigDecimal, java.lang.Object>(ia.entity.custom.TShipCus.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, ia.entity._TShip.getSingletonInternal().$wight, null, "wight", "WIGHT", true, true);

    /** the itemCostSum */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.custom.TShipCus, java.math.BigDecimal, java.lang.Object> $itemCostSum = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.custom.TShipCus, java.math.BigDecimal, java.lang.Object>(ia.entity.custom.TShipCus.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "itemCostSum", "ITEM_COST_SUM", true, true);

    /** the itemPriceSum */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.custom.TShipCus, java.math.BigDecimal, java.lang.Object> $itemPriceSum = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.custom.TShipCus, java.math.BigDecimal, java.lang.Object>(ia.entity.custom.TShipCus.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "itemPriceSum", "ITEM_PRICE_SUM", true, true);

    /** the itemQtySum */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.custom.TShipCus, java.math.BigDecimal, java.lang.Object> $itemQtySum = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.custom.TShipCus, java.math.BigDecimal, java.lang.Object>(ia.entity.custom.TShipCus.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "itemQtySum", "ITEM_QTY_SUM", true, true);

    /** the profit */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.custom.TShipCus, java.math.BigDecimal, java.lang.Object> $profit = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.custom.TShipCus, java.math.BigDecimal, java.lang.Object>(ia.entity.custom.TShipCus.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "profit", "PROFIT", true, true);

    private final ia.entity.custom.TShipCusListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.custom.TShipCus, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.custom.TShipCus, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.custom.TShipCus, ?>> __entityPropertyTypeMap;

    private _TShipCus() {
        __listener = new ia.entity.custom.TShipCusListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "TShipCus";
        __catalogName = "";
        __schemaName = "";
        __tableName = "TShipCus";
        __qualifiedTableName = "TShipCus";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.custom.TShipCus, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.custom.TShipCus, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.custom.TShipCus, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.custom.TShipCus, ?>>(21);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.custom.TShipCus, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.custom.TShipCus, ?>>(21);
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
        __list.add($itemCostSum);
        __map.put("itemCostSum", $itemCostSum);
        __list.add($itemPriceSum);
        __map.put("itemPriceSum", $itemPriceSum);
        __list.add($itemQtySum);
        __map.put("itemQtySum", $itemQtySum);
        __list.add($profit);
        __map.put("profit", $profit);
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
    public void preInsert(ia.entity.custom.TShipCus entity, org.seasar.doma.jdbc.entity.PreInsertContext<ia.entity.custom.TShipCus> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(ia.entity.custom.TShipCus entity, org.seasar.doma.jdbc.entity.PreUpdateContext<ia.entity.custom.TShipCus> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(ia.entity.custom.TShipCus entity, org.seasar.doma.jdbc.entity.PreDeleteContext<ia.entity.custom.TShipCus> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(ia.entity.custom.TShipCus entity, org.seasar.doma.jdbc.entity.PostInsertContext<ia.entity.custom.TShipCus> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(ia.entity.custom.TShipCus entity, org.seasar.doma.jdbc.entity.PostUpdateContext<ia.entity.custom.TShipCus> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(ia.entity.custom.TShipCus entity, org.seasar.doma.jdbc.entity.PostDeleteContext<ia.entity.custom.TShipCus> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.custom.TShipCus, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.custom.TShipCus, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.custom.TShipCus, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, ia.entity.custom.TShipCus, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<ia.entity.TShip, ia.entity.custom.TShipCus, ?, ?> getVersionPropertyType() {
        return $versionNo;
    }

    @Override
    public ia.entity.custom.TShipCus newEntity() {
        return new ia.entity.custom.TShipCus();
    }

    @Override
    public ia.entity.custom.TShipCus newEntity(java.util.Map<String, Object> __args) {
        return new ia.entity.custom.TShipCus();
    }

    @Override
    public Class<ia.entity.custom.TShipCus> getEntityClass() {
        return ia.entity.custom.TShipCus.class;
    }

    @Override
    public ia.entity.custom.TShipCus getOriginalStates(ia.entity.custom.TShipCus __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(ia.entity.custom.TShipCus __entity) {
    }

    /**
     * @return the singleton
     */
    public static _TShipCus getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _TShipCus newInstance() {
        return new _TShipCus();
    }

}
