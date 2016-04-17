package ia.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.38.0" }, date = "2016-03-05T12:46:06.932+0900")
public final class _TPoDetail extends org.seasar.doma.jdbc.entity.AbstractEntityType<ia.entity.TPoDetail> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.38.0");
    }

    private static final _TPoDetail __singleton = new _TPoDetail();

    /** the buyId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object> $buyId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object>(ia.entity.TPoDetail.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "buyId", "BUY_ID", true, true);

    /** the buyQty */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.Integer, java.lang.Object> $buyQty = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.Integer, java.lang.Object>(ia.entity.TPoDetail.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "buyQty", "BUY_QTY", true, true);

    /** the comment */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object> $comment = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object>(ia.entity.TPoDetail.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "comment", "COMMENT", true, true);

    /** the custId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object> $custId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object>(ia.entity.TPoDetail.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "custId", "CUST_ID", true, true);

    /** the itemCost */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.math.BigDecimal, java.lang.Object> $itemCost = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.math.BigDecimal, java.lang.Object>(ia.entity.TPoDetail.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "itemCost", "ITEM_COST", true, true);

    /** the itemId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object> $itemId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object>(ia.entity.TPoDetail.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "itemId", "ITEM_ID", true, true);

    /** the itemPrice */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.math.BigDecimal, java.lang.Object> $itemPrice = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.math.BigDecimal, java.lang.Object>(ia.entity.TPoDetail.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "itemPrice", "ITEM_PRICE", true, true);

    /** the itemPricePay */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.math.BigDecimal, java.lang.Object> $itemPricePay = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.math.BigDecimal, java.lang.Object>(ia.entity.TPoDetail.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "itemPricePay", "ITEM_PRICE_PAY", true, true);

    /** the itemProfit */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.math.BigDecimal, java.lang.Object> $itemProfit = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.math.BigDecimal, java.lang.Object>(ia.entity.TPoDetail.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "itemProfit", "ITEM_PROFIT", true, true);

    /** the itemQty */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.Integer, java.lang.Object> $itemQty = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.Integer, java.lang.Object>(ia.entity.TPoDetail.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "itemQty", "ITEM_QTY", true, true);

    /** the payState */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object> $payState = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object>(ia.entity.TPoDetail.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "payState", "PAY_STATE", true, true);

    /** the poDDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.sql.Timestamp, java.lang.Object> $poDDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.sql.Timestamp, java.lang.Object>(ia.entity.TPoDetail.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "poDDate", "PO_D_DATE", true, true);

    /** the poDId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object> $poDId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object>(ia.entity.TPoDetail.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "poDId", "PO_D_ID");

    /** the poId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object> $poId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object>(ia.entity.TPoDetail.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "poId", "PO_ID", true, true);

    /** the priceCutItem */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.math.BigDecimal, java.lang.Object> $priceCutItem = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.math.BigDecimal, java.lang.Object>(ia.entity.TPoDetail.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "priceCutItem", "PRICE_CUT_ITEM", true, true);

    /** the regTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.sql.Timestamp, java.lang.Object> $regTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.sql.Timestamp, java.lang.Object>(ia.entity.TPoDetail.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "regTime", "REG_TIME", true, true);

    /** the regUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object> $regUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object>(ia.entity.TPoDetail.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "regUserId", "REG_USER_ID", true, true);

    /** the shipId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object> $shipId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object>(ia.entity.TPoDetail.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "shipId", "SHIP_ID", true, true);

    /** the updTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.sql.Timestamp, java.lang.Object> $updTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.sql.Timestamp, java.lang.Object>(ia.entity.TPoDetail.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "updTime", "UPD_TIME", true, true);

    /** the updUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object> $updUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.String, java.lang.Object>(ia.entity.TPoDetail.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "updUserId", "UPD_USER_ID", true, true);

    /** the versionNo */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.Integer, java.lang.Object> $versionNo = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TPoDetail, java.lang.Integer, java.lang.Object>(ia.entity.TPoDetail.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "versionNo", "VERSION_NO");

    private final ia.entity.TPoDetailListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPoDetail, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPoDetail, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPoDetail, ?>> __entityPropertyTypeMap;

    private _TPoDetail() {
        __listener = new ia.entity.TPoDetailListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "TPoDetail";
        __catalogName = "";
        __schemaName = "";
        __tableName = "T_PO_DETAIL";
        __qualifiedTableName = "T_PO_DETAIL";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPoDetail, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPoDetail, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPoDetail, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPoDetail, ?>>(21);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPoDetail, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPoDetail, ?>>(21);
        __list.add($buyId);
        __map.put("buyId", $buyId);
        __list.add($buyQty);
        __map.put("buyQty", $buyQty);
        __list.add($comment);
        __map.put("comment", $comment);
        __list.add($custId);
        __map.put("custId", $custId);
        __list.add($itemCost);
        __map.put("itemCost", $itemCost);
        __list.add($itemId);
        __map.put("itemId", $itemId);
        __list.add($itemPrice);
        __map.put("itemPrice", $itemPrice);
        __list.add($itemPricePay);
        __map.put("itemPricePay", $itemPricePay);
        __list.add($itemProfit);
        __map.put("itemProfit", $itemProfit);
        __list.add($itemQty);
        __map.put("itemQty", $itemQty);
        __list.add($payState);
        __map.put("payState", $payState);
        __list.add($poDDate);
        __map.put("poDDate", $poDDate);
        __idList.add($poDId);
        __list.add($poDId);
        __map.put("poDId", $poDId);
        __list.add($poId);
        __map.put("poId", $poId);
        __list.add($priceCutItem);
        __map.put("priceCutItem", $priceCutItem);
        __list.add($regTime);
        __map.put("regTime", $regTime);
        __list.add($regUserId);
        __map.put("regUserId", $regUserId);
        __list.add($shipId);
        __map.put("shipId", $shipId);
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
    public void preInsert(ia.entity.TPoDetail entity, org.seasar.doma.jdbc.entity.PreInsertContext<ia.entity.TPoDetail> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(ia.entity.TPoDetail entity, org.seasar.doma.jdbc.entity.PreUpdateContext<ia.entity.TPoDetail> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(ia.entity.TPoDetail entity, org.seasar.doma.jdbc.entity.PreDeleteContext<ia.entity.TPoDetail> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(ia.entity.TPoDetail entity, org.seasar.doma.jdbc.entity.PostInsertContext<ia.entity.TPoDetail> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(ia.entity.TPoDetail entity, org.seasar.doma.jdbc.entity.PostUpdateContext<ia.entity.TPoDetail> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(ia.entity.TPoDetail entity, org.seasar.doma.jdbc.entity.PostDeleteContext<ia.entity.TPoDetail> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPoDetail, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPoDetail, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPoDetail, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, ia.entity.TPoDetail, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TPoDetail, ?, ?> getVersionPropertyType() {
        return $versionNo;
    }

    @Override
    public ia.entity.TPoDetail newEntity() {
        return new ia.entity.TPoDetail();
    }

    @Override
    public ia.entity.TPoDetail newEntity(java.util.Map<String, Object> __args) {
        return new ia.entity.TPoDetail();
    }

    @Override
    public Class<ia.entity.TPoDetail> getEntityClass() {
        return ia.entity.TPoDetail.class;
    }

    @Override
    public ia.entity.TPoDetail getOriginalStates(ia.entity.TPoDetail __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(ia.entity.TPoDetail __entity) {
    }

    /**
     * @return the singleton
     */
    public static _TPoDetail getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _TPoDetail newInstance() {
        return new _TPoDetail();
    }

}
