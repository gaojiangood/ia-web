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
/*%if @isNotEmpty(entity.nameCls) */
  NAME_CLS = /* entity.nameCls */'a'
/*%end*/
/*%if @isNotEmpty(entity.nameCd) */
  and
  NAME_CD = /* entity.nameCd */'a'
/*%end*/
/*%if @isNotEmpty(entity.nameChar) */
  and
  NAME_CHAR = /* entity.nameChar */'a'
/*%end*/
/*%if entity.nameNum != null */
  and
  NAME_NUM = /* entity.nameNum */1
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
