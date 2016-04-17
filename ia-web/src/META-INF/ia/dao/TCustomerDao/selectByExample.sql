select
	CUST_ID,
	CUST_ID_P,
	CUST_NAME,
	WEICHAT_ID,
	WEICHAT_NAME,
	TEL_NO,
	COMMENT,
	REG_USER_ID,
	REG_TIME,
	UPD_USER_ID,
	UPD_TIME,
	VERSION_NO
from
	T_CUSTOMER
where
/*%if @isNotEmpty(entity.custId) */
  CUST_ID = /* entity.custId */'a'
/*%end*/
/*%if @isNotEmpty(entity.custIdP) */
  and
  CUST_ID_P = /* entity.custIdP */'a'
/*%end*/
/*%if @isNotEmpty(entity.custName) */
  and
  CUST_NAME = /* entity.custName */'a'
/*%end*/
/*%if @isNotEmpty(entity.weichatId) */
  and
  WEICHAT_ID = /* entity.weichatId */'a'
/*%end*/
/*%if @isNotEmpty(entity.weichatName) */
  and
  WEICHAT_NAME = /* entity.weichatName */'a'
/*%end*/
/*%if @isNotEmpty(entity.telNo) */
  and
  TEL_NO = /* entity.telNo */'a'
/*%end*/
/*%if @isNotEmpty(entity.comment) */
  and
  COMMENT = /* entity.comment */'a'
/*%end*/
/*%if @isNotEmpty(entity.regUserId) */
  and
  REG_USER_ID = /* entity.regUserId */'a'
/*%end*/
/*%if entity.regTime != null */
  and
  REG_TIME = /* entity.regTime */'2010-01-23 12:34:56'
/*%end*/
/*%if @isNotEmpty(entity.updUserId) */
  and
  UPD_USER_ID = /* entity.updUserId */'a'
/*%end*/
/*%if entity.updTime != null */
  and
  UPD_TIME = /* entity.updTime */'2010-01-23 12:34:56'
/*%end*/
/*%if entity.versionNo != null */
  and
  VERSION_NO = /* entity.versionNo */1
/*%end*/
/*# orderBy */
