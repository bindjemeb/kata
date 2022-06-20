package kata;


/**
 * produit avec la promotion 3 pour 1 dollar
 * @author bindj
 *
 */
public class ItemThreeForDollar implements ThreeForDollar{

	
	private String itemName;
	private double pound;
	
	public ItemThreeForDollar(String itemName , double pound) {
		
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
