select
	ADDR_ID,
	CUST_ID,
	ADDR,
	POST_CODE,
	TEL_NO,
	RECEIVER,
	REG_USER_ID,
	REG_TIME,
	UPD_USER_ID,
	UPD_TIME,
	VERSION_NO
from
	T_ADDR
where
/*%if @isNotEmpty(entity.addrId) */
  ADDR_ID = /* entity.addrId */'a'
/*%end*/
/*%if @isNotEmpty(entity.custId) */
  and
  CUST_ID = /* entity.custId */'a'
/*%end*/
/*%if @isNotEmpty(entity.addr) */
  and
  ADDR = /* entity.addr */'a'
/*%end*/
/*%if @isNotEmpty(entity.postCode) */
  and
  POST_CODE = /* entity.postCode */'a'
/*%end*/
/*%if @isNotEmpty(entity.telNo) */
  and
  TEL_NO = /* entity.telNo */'a'
/*%end*/
/*%if @isNotEmpty(entity.receiver) */
  and
  RECEIVER = /* entity.receiver */'a'
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
