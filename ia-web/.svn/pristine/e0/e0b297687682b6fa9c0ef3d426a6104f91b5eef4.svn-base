package ia.entity.custom;

import java.math.BigDecimal;

import ia.entity.TShip;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

/**
 * 
 */
@Entity(listener = TShipCusListener.class)
public class TShipCus extends TShip{
	
    @Column(name = "ITEM_QTY_SUM")
    BigDecimal itemQtySum;
    
    @Column(name = "ITEM_PRICE_SUM")
    BigDecimal itemPriceSum;
    
    @Column(name = "ITEM_COST_SUM")
    BigDecimal itemCostSum;
    
    @Column(name = "PROFIT")
    BigDecimal profit;

	public BigDecimal getItemQtySum() {
		return itemQtySum;
	}

	public void setItemQtySum(BigDecimal itemQtySum) {
		this.itemQtySum = itemQtySum;
	}

	public BigDecimal getItemPriceSum() {
		return itemPriceSum;
	}

	public void setItemPriceSum(BigDecimal itemPriceSum) {
		this.itemPriceSum = itemPriceSum;
	}

	public BigDecimal getItemCostSum() {
		return itemCostSum;
	}

	public void setItemCostSum(BigDecimal itemCostSum) {
		this.itemCostSum = itemCostSum;
	}

	public BigDecimal getProfit() {
		return profit;
	}

	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}
    
    
}