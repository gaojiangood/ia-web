select
  CLASS_ID,
  CLASS_ID_P,
  CLASS_NAME,
  REG_USER_ID,
  REG_TIME,
  UPD_USER_ID,
  UPD_TIME,
  VERSION_NO
from
  T_ITEM_CLS
where
  CLASS_ID = /* classId */'a'
  and
  VERSION_NO = /* versionNo */1
