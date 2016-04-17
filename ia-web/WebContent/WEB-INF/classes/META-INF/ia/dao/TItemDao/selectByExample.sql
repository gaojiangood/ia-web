select
	ITEM_ID,
	ITEM_NAME,
	CLASS_ID,
	BLAND,
	ITEM_COMMENT,
	ITEM_PRICE,
	ITEM_COST,
	ITEM_PROFIT,
	ITEM_COST_JPY,
	BAR_CODE,
	SIZE,
	WIGHT,
	PIC_URL,
	COMMENT,
	REG_USER_ID,
	REG_TIME,
	UPD_USER_ID,
	UPD_TIME,
	VERSION_NO
from
	T_ITEM
where
/*%if @isNotEmpty(entity.itemId) */
  ITEM_ID = /* entity.itemId */'a'
/*%end*/
/*%if @isNotEmpty(entity.itemName) */
  and
  ITEM_NAME = /* entity.itemName */'a'
/*%end*/
/*%if @isNotEmpty(entity.classId) */
  and
  CLASS_ID = /* entity.classId */'a'
/*%end*/
/*%if @isNotEmpty(entity.bland) */
  and
  BLAND = /* entity.bland */'a'
/*%end*/
/*%if @isNotEmpty(entity.itemComment) */
  and
  ITEM_COMMENT = /* entity.itemComment */'a'
/*%end*/
/*%if entity.itemPrice != null */
  and
  ITEM_PRICE = /* entity.itemPrice */1
/*%end*/
/*%if entity.itemCost != null */
  and
  ITEM_COST = /* entity.itemCost */1
/*%end*/
/*%if entity.itemProfit != null */
  and
  ITEM_PROFIT = /* entity.itemProfit */1
/*%end*/
/*%if entity.itemCostJpy != null */
  and
  ITEM_COST_JPY = /* entity.itemCostJpy */1
/*%end*/
/*%if @isNotEmpty(entity.barCode) */
  and
  BAR_CODE = /* entity.barCode */'a'
/*%end*/
/*%if @isNotEmpty(entity.size) */
  and
  SIZE = /* entity.size */'a'
/*%end*/
/*%if entity.wight != null */
  and
  WIGHT = /* entity.wight */1
/*%end*/
/*%if @isNotEmpty(entity.picUrl) */
  and
  PIC_URL = /* entity.picUrl */'a'
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
