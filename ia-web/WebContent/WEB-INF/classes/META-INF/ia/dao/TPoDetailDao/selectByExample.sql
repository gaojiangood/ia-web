select
	PO_D_ID,
	PO_ID,
	CUST_ID,
	ITEM_ID,
	PO_D_DATE,
	ITEM_QTY,
	BUY_QTY,
	ITEM_PRICE,
	ITEM_COST,
	PRICE_CUT_ITEM,
	ITEM_PRICE_PAY,
	ITEM_PROFIT,
	PAY_STATE,
	SHIP_ID,
	BUY_ID,
	COMMENT,
	REG_USER_ID,
	REG_TIME,
	UPD_USER_ID,
	UPD_TIME,
	VERSION_NO
from
	T_PO_DETAIL
where
/*%if @isNotEmpty(entity.poDId) */
  PO_D_ID = /* entity.poDId */'a'
/*%end*/
/*%if @isNotEmpty(entity.poId) */
  and
  PO_ID = /* entity.poId */'a'
/*%end*/
/*%if @isNotEmpty(entity.custId) */
  and
  CUST_ID = /* entity.custId */'a'
/*%end*/
/*%if @isNotEmpty(entity.itemId) */
  and
  ITEM_ID = /* entity.itemId */'a'
/*%end*/
/*%if entity.poDDate != null */
  and
  PO_D_DATE = /* entity.poDDate */'2010-01-23 12:34:56'
/*%end*/
/*%if entity.itemQty != null */
  and
  ITEM_QTY = /* entity.itemQty */1
/*%end*/
/*%if entity.buyQty != null */
  and
  BUY_QTY = /* entity.buyQty */1
/*%end*/
/*%if entity.itemPrice != null */
  and
  ITEM_PRICE = /* entity.itemPrice */1
/*%end*/
/*%if entity.itemCost != null */
  and
  ITEM_COST = /* entity.itemCost */1
/*%end*/
/*%if entity.priceCutItem != null */
  and
  PRICE_CUT_ITEM = /* entity.priceCutItem */1
/*%end*/
/*%if entity.itemPricePay != null */
  and
  ITEM_PRICE_PAY = /* entity.itemPricePay */1
/*%end*/
/*%if entity.itemProfit != null */
  and
  ITEM_PROFIT = /* entity.itemProfit */1
/*%end*/
/*%if @isNotEmpty(entity.payState) */
  and
  PAY_STATE = /* entity.payState */'a'
/*%end*/
/*%if @isNotEmpty(entity.shipId) */
  and
  SHIP_ID = /* entity.shipId */'a'
/*%end*/
/*%if @isNotEmpty(entity.buyId) */
  and
  BUY_ID = /* entity.buyId */'a'
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
