package ia.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.38.0" }, date = "2016-03-05T12:46:06.995+0900")
public final class _TPo extends org.seasar.doma.jdbc.entity.AbstractEntityType<ia.entity.TPo> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.38.0");
    }

    private static final _TPo __singleton = new _TPo();

    /** the comment */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.lang.String, java.lang.Object> $comment = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.lang.String, java.lang.Object>(ia.entity.TPo.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "comment", "COMMENT", true, true);

    /** the custId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.lang.String, java.lang.Object> $custId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.lang.String, java.lang.Object>(ia.entity.TPo.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "custId", "CUST_ID", true, true);

    /** the itemCostSum */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.math.BigDecimal, java.lang.Object> $itemCostSum = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.math.BigDecimal, java.lang.Object>(ia.entity.TPo.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "itemCostSum", "ITEM_COST_SUM", true, true);

    /** the itemPriceSum */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.math.BigDecimal, java.lang.Object> $itemPriceSum = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.math.BigDecimal, java.lang.Object>(ia.entity.TPo.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "itemPriceSum", "ITEM_PRICE_SUM", true, true);

    /** the otherFee */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.math.BigDecimal, java.lang.Object> $otherFee = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.math.BigDecimal, java.lang.Object>(ia.entity.TPo.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "otherFee", "OTHER_FEE", true, true);

    /** the poDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.sql.Timestamp, java.lang.Object> $poDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.sql.Timestamp, java.lang.Object>(ia.entity.TPo.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "poDate", "PO_DATE", true, true);

    /** the poId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, ia.entity.TPo, java.lang.String, java.lang.Object> $poId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, ia.entity.TPo, java.lang.String, java.lang.Object>(ia.entity.TPo.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "poId", "PO_ID");

    /** the poName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.lang.String, java.lang.Object> $poName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.lang.String, java.lang.Object>(ia.entity.TPo.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "poName", "PO_NAME", true, true);

    /** the poState */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.lang.String, java.lang.Object> $poState = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.lang.String, java.lang.Object>(ia.entity.TPo.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "poState", "PO_STATE", true, true);

    /** the prePay */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.math.BigDecimal, java.lang.Object> $prePay = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.math.BigDecimal, java.lang.Object>(ia.entity.TPo.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "prePay", "PRE_PAY", true, true);

    /** the priceCut */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.math.BigDecimal, java.lang.Object> $priceCut = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.math.BigDecimal, java.lang.Object>(ia.entity.TPo.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "priceCut", "PRICE_CUT", true, true);

    /** the profitSum */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.math.BigDecimal, java.lang.Object> $profitSum = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.math.BigDecimal, java.lang.Object>(ia.entity.TPo.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "profitSum", "PROFIT_SUM", true, true);

    /** the qtySum */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.lang.Integer, java.lang.Object> $qtySum = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.lang.Integer, java.lang.Object>(ia.entity.TPo.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "qtySum", "QTY_SUM", true, true);

    /** the regTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.sql.Timestamp, java.lang.Object> $regTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.sql.Timestamp, java.lang.Object>(ia.entity.TPo.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "regTime", "REG_TIME", true, true);

    /** the regUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.lang.String, java.lang.Object> $regUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.lang.String, java.lang.Object>(ia.entity.TPo.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "regUserId", "REG_USER_ID", true, true);

    /** the shipFee */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.math.BigDecimal, java.lang.Object> $shipFee = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.math.BigDecimal, java.lang.Object>(ia.entity.TPo.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "shipFee", "SHIP_FEE", true, true);

    /** the updTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.sql.Timestamp, java.lang.Object> $updTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.sql.Timestamp, java.lang.Object>(ia.entity.TPo.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "updTime", "UPD_TIME", true, true);

    /** the updUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.lang.String, java.lang.Object> $updUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TPo, java.lang.String, java.lang.Object>(ia.entity.TPo.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "updUserId", "UPD_USER_ID", true, true);

    /** the versionNo */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TPo, java.lang.Integer, java.lang.Object> $versionNo = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TPo, java.lang.Integer, java.lang.Object>(ia.entity.TPo.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "versionNo", "VERSION_NO");

    private final ia.entity.TPoListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPo, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPo, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPo, ?>> __entityPropertyTypeMap;

    private _TPo() {
        __listener = new ia.entity.TPoListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "TPo";
        __catalogName = "";
        __schemaName = "";
        __tableName = "T_PO";
        __qualifiedTableName = "T_PO";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPo, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPo, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPo, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPo, ?>>(19);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPo, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPo, ?>>(19);
        __list.add($comment);
        __map.put("comment", $comment);
        __list.add($custId);
        __map.put("custId", $custId);
        __list.add($itemCostSum);
        __map.put("itemCostSum", $itemCostSum);
        __list.add($itemPriceSum);
        __map.put("itemPriceSum", $itemPriceSum);
        __list.add($otherFee);
        __map.put("otherFee", $otherFee);
        __list.add($poDate);
        __map.put("poDate", $poDate);
        __idList.add($poId);
        __list.add($poId);
        __map.put("poId", $poId);
        __list.add($poName);
        __map.put("poName", $poName);
        __list.add($poState);
        __map.put("poState", $poState);
        __list.add($prePay);
        __map.put("prePay", $prePay);
        __list.add($priceCut);
        __map.put("priceCut", $priceCut);
        __list.add($profitSum);
        __map.put("profitSum", $profitSum);
        __list.add($qtySum);
        __map.put("qtySum", $qtySum);
        __list.add($regTime);
        __map.put("regTime", $regTime);
        __list.add($regUserId);
        __map.put("regUserId", $regUserId);
        __list.add($shipFee);
        __map.put("shipFee", $shipFee);
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
    public void preInsert(ia.entity.TPo entity, org.seasar.doma.jdbc.entity.PreInsertContext<ia.entity.TPo> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(ia.entity.TPo entity, org.seasar.doma.jdbc.entity.PreUpdateContext<ia.entity.TPo> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(ia.entity.TPo entity, org.seasar.doma.jdbc.entity.PreDeleteContext<ia.entity.TPo> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(ia.entity.TPo entity, org.seasar.doma.jdbc.entity.PostInsertContext<ia.entity.TPo> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(ia.entity.TPo entity, org.seasar.doma.jdbc.entity.PostUpdateContext<ia.entity.TPo> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(ia.entity.TPo entity, org.seasar.doma.jdbc.entity.PostDeleteContext<ia.entity.TPo> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPo, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPo, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TPo, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, ia.entity.TPo, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TPo, ?, ?> getVersionPropertyType() {
        return $versionNo;
    }

    @Override
    public ia.entity.TPo newEntity() {
        return new ia.entity.TPo();
    }

    @Override
    public ia.entity.TPo newEntity(java.util.Map<String, Object> __args) {
        return new ia.entity.TPo();
    }

    @Override
    public Class<ia.entity.TPo> getEntityClass() {
        return ia.entity.TPo.class;
    }

    @Override
    public ia.entity.TPo getOriginalStates(ia.entity.TPo __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(ia.entity.TPo __entity) {
    }

    /**
     * @return the singleton
     */
    public static _TPo getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _TPo newInstance() {
        return new _TPo();
    }

}
