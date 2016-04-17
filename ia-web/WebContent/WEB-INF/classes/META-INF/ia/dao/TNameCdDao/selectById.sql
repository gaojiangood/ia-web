select
  NAME_CLS,
  NAME_CD,
  NAME_CHAR,
  NAME_NUM,
  COMMENT,
  REG_USER_ID,
  REG_TIME,
  UPD_USER_ID,
  UPD_TIME,
  VERSION_NO
from
  T_NAME_CD
where
  NAME_CLS = /* nameCls */'a'
  and
  NAME_CD = /* nameCd */'a'
