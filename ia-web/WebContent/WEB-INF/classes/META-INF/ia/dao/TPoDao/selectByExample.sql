select
	PO_ID,
	PO_DATE,
	PO_NAME,
	CUST_ID,
	ITEM_PRICE_SUM,
	PRICE_CUT,
	PRE_PAY,
	SHIP_FEE,
	OTHER_FEE,
	QTY_SUM,
	ITEM_COST_SUM,
	PROFIT_SUM,
	PO_STATE,
	COMMENT,
	REG_USER_ID,
	REG_TIME,
	UPD_USER_ID,
	UPD_TIME,
	VERSION_NO
from
	T_PO
where
/*%if @isNotEmpty(entity.poId) */
  PO_ID = /* entity.poId */'a'
/*%end*/
/*%if entity.poDate != null */
  and
  PO_DATE = /* entity.poDate */'2010-01-23 12:34:56'
/*%end*/
/*%if @isNotEmpty(entity.poName) */
  and
  PO_NAME = /* entity.poName */'a'
/*%end*/
/*%if @isNotEmpty(entity.custId) */
  and
  CUST_ID = /* entity.custId */'a'
/*%end*/
/*%if entity.itemPriceSum != null */
  and
  ITEM_PRICE_SUM = /* entity.itemPriceSum */1
/*%end*/
/*%if entity.priceCut != null */
  and
  PRICE_CUT = /* entity.priceCut */1
/*%end*/
/*%if entity.prePay != null */
  and
  PRE_PAY = /* entity.prePay */1
/*%end*/
/*%if entity.shipFee != null */
  and
  SHIP_FEE = /* entity.shipFee */1
/*%end*/
/*%if entity.otherFee != null */
  and
  OTHER_FEE = /* entity.otherFee */1
/*%end*/
/*%if entity.qtySum != null */
  and
  QTY_SUM = /* entity.qtySum */1
/*%end*/
/*%if entity.itemCostSum != null */
  and
  ITEM_COST_SUM = /* entity.itemCostSum */1
/*%end*/
/*%if entity.profitSum != null */
  and
  PROFIT_SUM = /* entity.profitSum */1
/*%end*/
/*%if @isNotEmpty(entity.poState) */
  and
  PO_STATE = /* entity.poState */'a'
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
