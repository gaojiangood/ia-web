select
	SHIP_ID,
	SHIP_WAY,
	CUST_ID,
	ADDR_ID,
	SHIP_STATE,
	LABLE_NO,
	SHIP_DATE,
	WIGHT,
	SHIP_FEE,
	LABLE_STATE,
	LABEL_DATE,
	SHIP_ADDR,
	REG_USER_ID,
	REG_TIME,
	UPD_USER_ID,
	UPD_TIME,
	VERSION_NO
from
	T_SHIP
where
/*%if @isNotEmpty(entity.shipId) */
  SHIP_ID = /* entity.shipId */'a'
/*%end*/
/*%if @isNotEmpty(entity.shipWay) */
  and
  SHIP_WAY = /* entity.shipWay */'a'
/*%end*/
/*%if @isNotEmpty(entity.custId) */
  and
  CUST_ID = /* entity.custId */'a'
/*%end*/
/*%if @isNotEmpty(entity.addrId) */
  and
  ADDR_ID = /* entity.addrId */'a'
/*%end*/
/*%if @isNotEmpty(entity.shipState) */
  and
  SHIP_STATE = /* entity.shipState */'a'
/*%end*/
/*%if @isNotEmpty(entity.lableNo) */
  and
  LABLE_NO = /* entity.lableNo */'a'
/*%end*/
/*%if entity.shipDate != null */
  and
  SHIP_DATE = /* entity.shipDate */'2010-01-23 12:34:56'
/*%end*/
/*%if entity.wight != null */
  and
  WIGHT = /* entity.wight */1
/*%end*/
/*%if entity.shipFee != null */
  and
  SHIP_FEE = /* entity.shipFee */1
/*%end*/
/*%if @isNotEmpty(entity.lableState) */
  and
  LABLE_STATE = /* entity.lableState */'a'
/*%end*/
/*%if entity.labelDate != null */
  and
  LABEL_DATE = /* entity.labelDate */'2010-01-23 12:34:56'
/*%end*/
/*%if @isNotEmpty(entity.shipAddr) */
  and
  SHIP_ADDR = /* entity.shipAddr */'a'
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
