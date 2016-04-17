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
  PO_D_ID = /* poDId */'a'
  and
  VERSION_NO = /* versionNo */1
