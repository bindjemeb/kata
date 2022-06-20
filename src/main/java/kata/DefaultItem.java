package kata;

/**
 * produit par défaut sans  promotion
 * @author bindj
 *
 */
public class DefaultItem implements PackagePricing{

	private String itemName;
	private double pound;
	
	public DefaultItem(String itemName , double pound) {
		
		this.itemName = itemName;
		this.pound = pound;
	}
	
	
	@Override
	public String getItemName() {
		return this.itemName;
	}

	@Override
	public double getPound() {
		return this.pound;
	}
}
