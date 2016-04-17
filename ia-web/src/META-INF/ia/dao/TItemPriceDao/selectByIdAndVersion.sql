select
  ITEM_ID,
  PRICE_ADPT_DATE,
  ITEM_PRICE,
  ITEM_COST,
  REG_USER_ID,
  REG_TIME,
  UPD_USER_ID,
  UPD_TIME,
  VERSION_NO
from
  T_ITEM_PRICE
where
  ITEM_ID = /* itemId */'a'
  and
  PRICE_ADPT_DATE = /* priceAdptDate */'2010-01-23'
  and
  VERSION_NO = /* versionNo */1
