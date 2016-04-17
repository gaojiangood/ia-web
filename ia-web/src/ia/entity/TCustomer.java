package ia.entity;

import java.sql.Timestamp;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import org.seasar.doma.Version;

/**
 * 
 */
@Entity(listener = TCustomerListener.class)
@Table(name = "T_CUSTOMER")
public class TCustomer {

    /**  */
    @Id
    @Column(name = "CUST_ID")
    String custId;

    /**  */
    @Column(name = "CUST_ID_P")
    String custIdP;

    /**  */
    @Column(name = "CUST_NAME")
    String custName;

    /**  */
    @Column(name = "WEICHAT_ID")
    String weichatId;

    /**  */
    @Column(name = "WEICHAT_NAME")
    String weichatName;

    /**  */
    @Column(name = "TEL_NO")
    String telNo;

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
     * Returns the custIdP.
     * 
     * @return the custIdP
     */
    public String getCustIdP() {
        return custIdP;
    }

    /** 
     * Sets the custIdP.
     * 
     * @param custIdP the custIdP
     */
    public void setCustIdP(String custIdP) {
        this.custIdP = custIdP;
    }

    /** 
     * Returns the custName.
     * 
     * @return the custName
     */
    public String getCustName() {
        return custName;
    }

    /** 
     * Sets the custName.
     * 
     * @param custName the custName
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /** 
     * Returns the weichatId.
     * 
     * @return the weichatId
     */
    public String getWeichatId() {
        return weichatId;
    }

    /** 
     * Sets the weichatId.
     * 
     * @param weichatId the weichatId
     */
    public void setWeichatId(String weichatId) {
        this.weichatId = weichatId;
    }

    /** 
     * Returns the weichatName.
     * 
     * @return the weichatName
     */
    public String getWeichatName() {
        return weichatName;
    }

    /** 
     * Sets the weichatName.
     * 
     * @param weichatName the weichatName
     */
    public void setWeichatName(String weichatName) {
        this.weichatName = weichatName;
    }

    /** 
     * Returns the telNo.
     * 
     * @return the telNo
     */
    public String getTelNo() {
        return telNo;
    }

    /** 
     * Sets the telNo.
     * 
     * @param telNo the telNo
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
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