package ia.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.38.0" }, date = "2016-03-05T12:46:06.983+0900")
public final class _TItem extends org.seasar.doma.jdbc.entity.AbstractEntityType<ia.entity.TItem> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.38.0");
    }

    private static final _TItem __singleton = new _TItem();

    /** the barCode */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object> $barCode = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object>(ia.entity.TItem.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "barCode", "BAR_CODE", true, true);

    /** the bland */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object> $bland = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object>(ia.entity.TItem.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "bland", "BLAND", true, true);

    /** the classId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object> $classId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object>(ia.entity.TItem.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "classId", "CLASS_ID", true, true);

    /** the comment */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object> $comment = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object>(ia.entity.TItem.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "comment", "COMMENT", true, true);

    /** the itemComment */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object> $itemComment = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object>(ia.entity.TItem.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "itemComment", "ITEM_COMMENT", true, true);

    /** the itemCost */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.math.BigDecimal, java.lang.Object> $itemCost = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.math.BigDecimal, java.lang.Object>(ia.entity.TItem.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "itemCost", "ITEM_COST", true, true);

    /** the itemCostJpy */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.math.BigDecimal, java.lang.Object> $itemCostJpy = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.math.BigDecimal, java.lang.Object>(ia.entity.TItem.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "itemCostJpy", "ITEM_COST_JPY", true, true);

    /** the itemId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object> $itemId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object>(ia.entity.TItem.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "itemId", "ITEM_ID");

    /** the itemName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object> $itemName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object>(ia.entity.TItem.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "itemName", "ITEM_NAME", true, true);

    /** the itemPrice */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.math.BigDecimal, java.lang.Object> $itemPrice = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.math.BigDecimal, java.lang.Object>(ia.entity.TItem.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "itemPrice", "ITEM_PRICE", true, true);

    /** the itemProfit */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.math.BigDecimal, java.lang.Object> $itemProfit = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.math.BigDecimal, java.lang.Object>(ia.entity.TItem.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "itemProfit", "ITEM_PROFIT", true, true);

    /** the picUrl */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object> $picUrl = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object>(ia.entity.TItem.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "picUrl", "PIC_URL", true, true);

    /** the regTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.sql.Timestamp, java.lang.Object> $regTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.sql.Timestamp, java.lang.Object>(ia.entity.TItem.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "regTime", "REG_TIME", true, true);

    /** the regUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object> $regUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object>(ia.entity.TItem.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "regUserId", "REG_USER_ID", true, true);

    /** the size */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object> $size = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object>(ia.entity.TItem.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "size", "SIZE", true, true);

    /** the updTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.sql.Timestamp, java.lang.Object> $updTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.sql.Timestamp, java.lang.Object>(ia.entity.TItem.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "updTime", "UPD_TIME", true, true);

    /** the updUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object> $updUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.lang.String, java.lang.Object>(ia.entity.TItem.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "updUserId", "UPD_USER_ID", true, true);

    /** the versionNo */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TItem, java.lang.Integer, java.lang.Object> $versionNo = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TItem, java.lang.Integer, java.lang.Object>(ia.entity.TItem.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "versionNo", "VERSION_NO");

    /** the wight */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.math.BigDecimal, java.lang.Object> $wight = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, ia.entity.TItem, java.math.BigDecimal, java.lang.Object>(ia.entity.TItem.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "wight", "WIGHT", true, true);

    private final ia.entity.TItemListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItem, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItem, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItem, ?>> __entityPropertyTypeMap;

    private _TItem() {
        __listener = new ia.entity.TItemListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "TItem";
        __catalogName = "";
        __schemaName = "";
        __tableName = "T_ITEM";
        __qualifiedTableName = "T_ITEM";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItem, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItem, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItem, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItem, ?>>(19);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItem, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItem, ?>>(19);
        __list.add($barCode);
        __map.put("barCode", $barCode);
        __list.add($bland);
        __map.put("bland", $bland);
        __list.add($classId);
        __map.put("classId", $classId);
        __list.add($comment);
        __map.put("comment", $comment);
        __list.add($itemComment);
        __map.put("itemComment", $itemComment);
        __list.add($itemCost);
        __map.put("itemCost", $itemCost);
        __list.add($itemCostJpy);
        __map.put("itemCostJpy", $itemCostJpy);
        __idList.add($itemId);
        __list.add($itemId);
        __map.put("itemId", $itemId);
        __list.add($itemName);
        __map.put("itemName", $itemName);
        __list.add($itemPrice);
        __map.put("itemPrice", $itemPrice);
        __list.add($itemProfit);
        __map.put("itemProfit", $itemProfit);
        __list.add($picUrl);
        __map.put("picUrl", $picUrl);
        __list.add($regTime);
        __map.put("regTime", $regTime);
        __list.add($regUserId);
        __map.put("regUserId", $regUserId);
        __list.add($size);
        __map.put("size", $size);
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
    public void preInsert(ia.entity.TItem entity, org.seasar.doma.jdbc.entity.PreInsertContext<ia.entity.TItem> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(ia.entity.TItem entity, org.seasar.doma.jdbc.entity.PreUpdateContext<ia.entity.TItem> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(ia.entity.TItem entity, org.seasar.doma.jdbc.entity.PreDeleteContext<ia.entity.TItem> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(ia.entity.TItem entity, org.seasar.doma.jdbc.entity.PostInsertContext<ia.entity.TItem> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(ia.entity.TItem entity, org.seasar.doma.jdbc.entity.PostUpdateContext<ia.entity.TItem> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(ia.entity.TItem entity, org.seasar.doma.jdbc.entity.PostDeleteContext<ia.entity.TItem> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItem, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItem, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<ia.entity.TItem, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, ia.entity.TItem, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, ia.entity.TItem, ?, ?> getVersionPropertyType() {
        return $versionNo;
    }

    @Override
    public ia.entity.TItem newEntity() {
        return new ia.entity.TItem();
    }

    @Override
    public ia.entity.TItem newEntity(java.util.Map<String, Object> __args) {
        return new ia.entity.TItem();
    }

    @Override
    public Class<ia.entity.TItem> getEntityClass() {
        return ia.entity.TItem.class;
    }

    @Override
    public ia.entity.TItem getOriginalStates(ia.entity.TItem __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(ia.entity.TItem __entity) {
    }

    /**
     * @return the singleton
     */
    public static _TItem getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _TItem newInstance() {
        return new _TItem();
    }

}
