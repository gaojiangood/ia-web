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
  SHIP_ID = /* shipId */'a'
  and
  VERSION_NO = /* versionNo */1
