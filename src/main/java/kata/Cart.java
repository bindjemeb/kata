package kata;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * panier de course
 * @author bindj
 *
 */
public class Cart {

	private String  customer;
	private List<PackagePricing> listItems ;
	
	public Cart() {
		super();
		this.listItems = new ArrayList<PackagePricing>();
	}
	
	public Cart(String  customer) {
		super();
		this.customer = customer;
		this.listItems = new ArrayList<PackagePricing>();
	}
	
	public  void addItem(PackagePricing item) {
		listItems.add(item);
	}
	
	
	/**
	 * caculate the price of the cart
	 * @return
	 */
	public BigDecimal getCartPrice() { 
		
		return getCartBuyTwooGetOneFreePrice().add(getCartThreeForDollarPrice()).add(getCartDefaultItemPrice());
	}
	
	
	/**
	 * calculate the price of all item whith promo BuyTwooGetOneFree
	 * @return
	 */
	public BigDecimal getCartBuyTwooGetOneFreePrice() {
		
		//liste item by name
		Collection<List<PackagePricing>> items =  listItems.stream()
				.filter(i -> i.getPricingLibelle().equals("BuyTwooGetOneFree"))
				.collect(Collectors.groupingBy(i -> i.getItemName())).values();
				
		BigDecimal price  = items.stream()
		.map(l ->{
				double val =  l.size()%3 *l.get(0).getPrice().doubleValue() + (int)(l.size()/3)*2*l.get(0).getPrice().doubleValue();
				return BigDecimal.valueOf(val);
			})
		.reduce(BigDecimal.valueOf(0.0),(x,y) -> x.add(y));
		
		return price.setScale(1, BigDecimal.ROUND_HALF_UP);
	}
	
	/**
	 * calculate the price of all item whith promo ThreeForDollar
	 * @return
	 */
	public BigDecimal getCartThreeForDollarPrice() {
		
		//liste item by name
		Collection<List<PackagePricing>> items =  listItems.stream()
				.filter(i -> i.getPricingLibelle().equals("ThreeForDollar"))
				.collect(Collectors.groupingBy(i -> i.getItemName())).values();
				
		BigDecimal price  = items.stream()
		.map(l ->{
				double val =  l.size()%3 *l.get(0).getPrice().doubleValue() + ((int)(l.size()/3))*1.0 ;
				return BigDecimal.valueOf(val);
			})
		.reduce(BigDecimal.valueOf(0.0),(x,y) -> x.add(y));
		
		return price.setScale(1, BigDecimal.ROUND_HALF_UP);
	}
	
	/**
	 * calculate the price of all item whithout promo	
	 * @return
	 */
	public BigDecimal getCartDefaultItemPrice() {
		
		//liste item by name
		BigDecimal price = listItems.stream()
				.filter(i -> i.getPricingLibelle().equals("defaut"))
				.map(p ->p.getPrice())
				.reduce(BigDecimal.valueOf(0.0),(x,y) -> x.add(y));
		
		return price.setScale(1, BigDecimal.ROUND_HALF_UP);
	}

	public String getCustomer() {
		return customer;
	}
	
	
	
}
