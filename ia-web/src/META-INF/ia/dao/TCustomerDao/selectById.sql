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
  CUST_ID = /* custId */'a'
