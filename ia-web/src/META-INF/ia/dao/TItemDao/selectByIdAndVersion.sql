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
  ITEM_ID = /* itemId */'a'
  and
  VERSION_NO = /* versionNo */1
