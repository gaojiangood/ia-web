SELECT
        SHIP.SHIP_ID
        ,SHIP_WAY
        ,CUST_ID
        ,ADDR_ID
        ,SHIP_STATE
        ,LABLE_NO
        ,SHIP_DATE
        ,WIGHT
        ,SHIP_FEE
        ,LABLE_STATE
        ,LABEL_DATE
        ,SHIP_ADDR
        ,COALESCE(ITEM_QTY_SUM, 0) as ITEM_QTY_SUM
        ,COALESCE(ITEM_PRICE_SUM, 0) as ITEM_PRICE_SUM
        ,COALESCE(ITEM_COST_SUM, 0) as ITEM_COST_SUM
        ,CASE
            WHEN ITEM_QTY_SUM IS null THEN 0
            ELSE ITEM_PRICE_SUM - ITEM_COST_SUM - SHIP_FEE
        END AS PROFIT
        ,REG_USER_ID
        ,REG_TIME
        ,UPD_USER_ID
        ,UPD_TIME
        ,VERSION_NO
    FROM
        T_SHIP SHIP
            LEFT OUTER JOIN (
                SELECT
                        SHIP_ID
                        ,SUM(ITEM_QTY) AS ITEM_QTY_SUM
                        ,SUM(ITEM_PRICE_PAY * ITEM_QTY) AS ITEM_PRICE_SUM
                        ,SUM(ITEM_COST * ITEM_QTY) AS ITEM_COST_SUM
                    FROM
                        T_PO_DETAIL
                    GROUP BY
                        SHIP_ID
            ) AS PO_DETAIL
                ON SHIP.SHIP_ID = PO_DETAIL.SHIP_ID
    where
    1=1
    /*%if @isNotEmpty(entity.custId) */
  	and
  	CUST_ID = /* entity.custId */'a'
	/*%end*/
  	/*%if @isNotEmpty(entity.shipState) */
  	and
  	SHIP_STATE = /* entity.shipState */'a'
	/*%end*/

/*# orderBy */
