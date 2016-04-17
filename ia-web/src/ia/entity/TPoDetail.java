package ia.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import org.seasar.doma.Version;

/**
 * 
 */
@Entity(listener = TPoDetailListener.class)
@Table(name = "T_PO_DETAIL")
public class TPoDetail {

    /**  */
    @Id
    @Column(name = "PO_D_ID")
    String poDId;

    /**  */
    @Column(name = "PO_ID")
    String poId;

    /**  */
    @Column(name = "CUST_ID")
    String custId;

    /**  */
    @Column(name = "ITEM_ID")
    String itemId;

    /**  */
    @Column(name = "PO_D_DATE")
    Timestamp poDDate;

    /**  */
    @Column(name = "ITEM_QTY")
    Integer itemQty;

    /**  */
    @Column(name = "BUY_QTY")
    Integer buyQty;

    /**  */
    @Column(name = "ITEM_PRICE")
    BigDecimal itemPrice;

    /**  */
    @Column(name = "ITEM_COST")
    BigDecimal itemCost;

    /**  */
    @Column(name = "PRICE_CUT_ITEM")
    BigDecimal priceCutItem;

    /**  */
    @Column(name = "ITEM_PRICE_PAY")
    BigDecimal itemPricePay;

    /**  */
    @Column(name = "ITEM_PROFIT")
    BigDecimal itemProfit;

    /**  */
    @Column(name = "PAY_STATE")
    String payState;

    /**  */
    @Column(name = "SHIP_ID")
    String shipId;

    /**  */
    @Column(name = "BUY_ID")
    String buyId;

    /**  */
    @Column(name = "COMMENT")
    String comment;

    /**  */
    @Column(name = "REG_USER_ID")
    String regUserId;

    /**  */
    @Column(name = "REG_TIME")
    Timestamp regTime;

    /**  */
    @Column(name = "UPD_USER_ID")
    String updUserId;

    /**  */
    @Column(name = "UPD_TIME")
    Timestamp updTime;

    /**  */
    @Version
    @Column(name = "VERSION_NO")
    Integer versionNo;

    /** 
     * Returns the poDId.
     * 
     * @return the poDId
     */
    public String getPoDId() {
        return poDId;
    }

    /** 
     * Sets the poDId.
     * 
     * @param poDId the poDId
     */
    public void setPoDId(String poDId) {
        this.poDId = poDId;
    }

    /** 
     * Returns the poId.
     * 
     * @return the poId
     */
    public String getPoId() {
        return poId;
    }

    /** 
     * Sets the poId.
     * 
     * @param poId the poId
     */
    public void setPoId(String poId) {
        this.poId = poId;
    }

    /** 
     * Returns the custId.
     * 
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /** 
     * Sets the custId.
     * 
     * @param custId the custId
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /** 
     * Returns the itemId.
     * 
     * @return the itemId
     */
    public String getItemId() {
        return itemId;
    }

    /** 
     * Sets the itemId.
     * 
     * @param itemId the itemId
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /** 
     * Returns the poDDate.
     * 
     * @return the poDDate
     */
    public Timestamp getPoDDate() {
        return poDDate;
    }

    /** 
     * Sets the poDDate.
     * 
     * @param poDDate the poDDate
     */
    public void setPoDDate(Timestamp poDDate) {
        this.poDDate = poDDate;
    }

    /** 
     * Returns the itemQty.
     * 
     * @return the itemQty
     */
    public Integer getItemQty() {
        return itemQty;
    }

    /** 
     * Sets the itemQty.
     * 
     * @param itemQty the itemQty
     */
    public void setItemQty(Integer itemQty) {
        this.itemQty = itemQty;
    }

    /** 
     * Returns the buyQty.
     * 
     * @return the buyQty
     */
    public Integer getBuyQty() {
        return buyQty;
    }

    /** 
     * Sets the buyQty.
     * 
     * @param buyQty the buyQty
     */
    public void setBuyQty(Integer buyQty) {
        this.buyQty = buyQty;
    }

    /** 
     * Returns the itemPrice.
     * 
     * @return the itemPrice
     */
    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    /** 
     * Sets the itemPrice.
     * 
     * @param itemPrice the itemPrice
     */
    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    /** 
     * Returns the itemCost.
     * 
     * @return the itemCost
     */
    public BigDecimal getItemCost() {
        return itemCost;
    }

    /** 
     * Sets the itemCost.
     * 
     * @param itemCost the itemCost
     */
    public void setItemCost(BigDecimal itemCost) {
        this.itemCost = itemCost;
    }

    /** 
     * Returns the priceCutItem.
     * 
     * @return the priceCutItem
     */
    public BigDecimal getPriceCutItem() {
        return priceCutItem;
    }

    /** 
     * Sets the priceCutItem.
     * 
     * @param priceCutItem the priceCutItem
     */
    public void setPriceCutItem(BigDecimal priceCutItem) {
        this.priceCutItem = priceCutItem;
    }

    /** 
     * Returns the itemPricePay.
     * 
     * @return the itemPricePay
     */
    public BigDecimal getItemPricePay() {
        return itemPricePay;
    }

    /** 
     * Sets the itemPricePay.
     * 
     * @param itemPricePay the itemPricePay
     */
    public void setItemPricePay(BigDecimal itemPricePay) {
        this.itemPricePay = itemPricePay;
    }

    /** 
     * Returns the itemProfit.
     * 
     * @return the itemProfit
     */
    public BigDecimal getItemProfit() {
        return itemProfit;
    }

    /** 
     * Sets the itemProfit.
     * 
     * @param itemProfit the itemProfit
     */
    public void setItemProfit(BigDecimal itemProfit) {
        this.itemProfit = itemProfit;
    }

    /** 
     * Returns the payState.
     * 
     * @return the payState
     */
    public String getPayState() {
        return payState;
    }

    /** 
     * Sets the payState.
     * 
     * @param payState the payState
     */
    public void setPayState(String payState) {
        this.payState = payState;
    }

    /** 
     * Returns the shipId.
     * 
     * @return the shipId
     */
    public String getShipId() {
        return shipId;
    }

    /** 
     * Sets the shipId.
     * 
     * @param shipId the shipId
     */
    public void setShipId(String shipId) {
        this.shipId = shipId;
    }

    /** 
     * Returns the buyId.
     * 
     * @return the buyId
     */
    public String getBuyId() {
        return buyId;
    }

    /** 
     * Sets the buyId.
     * 
     * @param buyId the buyId
     */
    public void setBuyId(String buyId) {
        this.buyId = buyId;
    }

    /** 
     * Returns the comment.
     * 
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Sets the comment.
     * 
     * @param comment the comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /** 
     * Returns the regUserId.
     * 
     * @return the regUserId
     */
    public String getRegUserId() {
        return regUserId;
    }

    /** 
     * Sets the regUserId.
     * 
     * @param regUserId the regUserId
     */
    public void setRegUserId(String regUserId) {
        this.regUserId = regUserId;
    }

    /** 
     * Returns the regTime.
     * 
     * @return the regTime
     */
    public Timestamp getRegTime() {
        return regTime;
    }

    /** 
     * Sets the regTime.
     * 
     * @param regTime the regTime
     */
    public void setRegTime(Timestamp regTime) {
        this.regTime = regTime;
    }

    /** 
     * Returns the updUserId.
     * 
     * @return the updUserId
     */
    public String getUpdUserId() {
        return updUserId;
    }

    /** 
     * Sets the updUserId.
     * 
     * @param updUserId the updUserId
     */
    public void setUpdUserId(String updUserId) {
        this.updUserId = updUserId;
    }

    /** 
     * Returns the updTime.
     * 
     * @return the updTime
     */
    public Timestamp getUpdTime() {
        return updTime;
    }

    /** 
     * Sets the updTime.
     * 
     * @param updTime the updTime
     */
    public void setUpdTime(Timestamp updTime) {
        this.updTime = updTime;
    }

    /** 
     * Returns the versionNo.
     * 
     * @return the versionNo
     */
    public Integer getVersionNo() {
        return versionNo;
    }

    /** 
     * Sets the versionNo.
     * 
     * @param versionNo the versionNo
     */
    public void setVersionNo(Integer versionNo) {
        this.versionNo = versionNo;
    }
}