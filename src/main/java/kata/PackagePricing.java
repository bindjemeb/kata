package kata;

import java.math.BigDecimal;

public interface PackagePricing {
	
	public String getItemName();
	/**
	 *  ThreeForDollar ||BuyTwooGetOneFree|| default
	 * @return
	 */
	default public String getPricingLibelle() {
		return "defaut";
	}
	
	default public BigDecimal getPrice() {
		return new BigDecimal(getPound()* 1.99) ;
	}
	
	public double getPound();

	
}
