package ia.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import org.seasar.doma.Version;

/**
 * 
 */
@Entity(listener = TShipListener.class)
@Table(name = "T_SHIP")
public class TShip {

    /**  */
    @Id
    @Column(name = "SHIP_ID")
    String shipId;

    /**  */
    @Column(name = "SHIP_WAY")
    String shipWay;

    /**  */
    @Column(name = "CUST_ID")
    String custId;

    /**  */
    @Column(name = "ADDR_ID")
    String addrId;

    /**  */
    @Column(name = "SHIP_STATE")
    String shipState;

    /**  */
    @Column(name = "LABLE_NO")
    String lableNo;

    /**  */
    @Column(name = "SHIP_DATE")
    Date shipDate;

    /**  */
    @Column(name = "WIGHT")
    BigDecimal wight;

    /**  */
    @Column(name = "SHIP_FEE")
    BigDecimal shipFee;

    /**  */
    @Column(name = "LABLE_STATE")
    String lableState;

    /**  */
    @Column(name = "LABEL_DATE")
    Timestamp labelDate;

    /**  */
    @Column(name = "SHIP_ADDR")
    String shipAddr;

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
     * Returns the shipWay.
     * 
     * @return the shipWay
     */
    public String getShipWay() {
        return shipWay;
    }

    /** 
     * Sets the shipWay.
     * 
     * @param shipWay the shipWay
     */
    public void setShipWay(String shipWay) {
        this.shipWay = shipWay;
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
     * Returns the addrId.
     * 
     * @return the addrId
     */
    public String getAddrId() {
        return addrId;
    }

    /** 
     * Sets the addrId.
     * 
     * @param addrId the addrId
     */
    public void setAddrId(String addrId) {
        this.addrId = addrId;
    }

    /** 
     * Returns the shipState.
     * 
     * @return the shipState
     */
    public String getShipState() {
        return shipState;
    }

    /** 
     * Sets the shipState.
     * 
     * @param shipState the shipState
     */
    public void setShipState(String shipState) {
        this.shipState = shipState;
    }

    /** 
     * Returns the lableNo.
     * 
     * @return the lableNo
     */
    public String getLableNo() {
        return lableNo;
    }

    /** 
     * Sets the lableNo.
     * 
     * @param lableNo the lableNo
     */
    public void setLableNo(String lableNo) {
        this.lableNo = lableNo;
    }

    /** 
     * Returns the shipDate.
     * 
     * @return the shipDate
     */
    public Date getShipDate() {
        return shipDate;
    }

    /** 
     * Sets the shipDate.
     * 
     * @param shipDate the shipDate
     */
    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    /** 
     * Returns the wight.
     * 
     * @return the wight
     */
    public BigDecimal getWight() {
        return wight;
    }

    /** 
     * Sets the wight.
     * 
     * @param wight the wight
     */
    public void setWight(BigDecimal wight) {
        this.wight = wight;
    }

    /** 
     * Returns the shipFee.
     * 
     * @return the shipFee
     */
    public BigDecimal getShipFee() {
        return shipFee;
    }

    /** 
     * Sets the shipFee.
     * 
     * @param shipFee the shipFee
     */
    public void setShipFee(BigDecimal shipFee) {
        this.shipFee = shipFee;
    }

    /** 
     * Returns the lableState.
     * 
     * @return the lableState
     */
    public String getLableState() {
        return lableState;
    }

    /** 
     * Sets the lableState.
     * 
     * @param lableState the lableState
     */
    public void setLableState(String lableState) {
        this.lableState = lableState;
    }

    /** 
     * Returns the labelDate.
     * 
     * @return the labelDate
     */
    public Timestamp getLabelDate() {
        return labelDate;
    }

    /** 
     * Sets the labelDate.
     * 
     * @param labelDate the labelDate
     */
    public void setLabelDate(Timestamp labelDate) {
        this.labelDate = labelDate;
    }

    /** 
     * Returns the shipAddr.
     * 
     * @return the shipAddr
     */
    public String getShipAddr() {
        return shipAddr;
    }

    /** 
     * Sets the shipAddr.
     * 
     * @param shipAddr the shipAddr
     */
    public void setShipAddr(String shipAddr) {
        this.shipAddr = shipAddr;
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