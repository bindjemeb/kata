package kata;

/**
 * produit avec la promotion 2 achetés un offert
 * @author bindj
 *
 */
public class ItemBuyTwooGetOneFree implements BuyTwooGetOneFree {

	private String itemName;
	private double pound;
	
	public ItemBuyTwooGetOneFree(String itemName , double pound) {
		
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
