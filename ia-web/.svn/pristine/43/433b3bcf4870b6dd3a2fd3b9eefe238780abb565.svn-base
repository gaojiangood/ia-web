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
/*%if @isNotEmpty(entity.classId) */
  CLASS_ID = /* entity.classId */'a'
/*%end*/
/*%if @isNotEmpty(entity.classIdP) */
  and
  CLASS_ID_P = /* entity.classIdP */'a'
/*%end*/
/*%if @isNotEmpty(entity.className) */
  and
  CLASS_NAME = /* entity.className */'a'
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
