package kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PricingTest {

	
	//BuyTwooGetOneFree
	@Test
	public void shoul_BuyTwooGetOneFree_be_39_8() {
		
		ItemBuyTwooGetOneFree item1 = new ItemBuyTwooGetOneFree("item_1", 10.0);
		ItemBuyTwooGetOneFree item2 = new ItemBuyTwooGetOneFree("item_1", 10.0);
		Cart cart =  new Cart();
		cart.addItem(item1);
		cart.addItem(item2);
		assertEquals(39.8, cart.getCartPrice().doubleValue(),0);
	}
	
	@Test
	public void shoul_BuyTwooGetOneFree_also_be_39_8() {
		
		ItemBuyTwooGetOneFree item1 = new ItemBuyTwooGetOneFree("item_1", 10.0);
		ItemBuyTwooGetOneFree item2 = new ItemBuyTwooGetOneFree("item_1", 10.0);
		ItemBuyTwooGetOneFree item3 = new ItemBuyTwooGetOneFree("item_1", 10.0);
		Cart cart =  new Cart();
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		assertEquals(39.8, cart.getCartPrice().doubleValue(),0);
	}
	
	@Test
	public void shoul_BuyTwooGetOneFree_also_be_59_7() {
		
		ItemBuyTwooGetOneFree item1 = new ItemBuyTwooGetOneFree("item_1", 10.0);
		ItemBuyTwooGetOneFree item2 = new ItemBuyTwooGetOneFree("item_1", 10.0);
		ItemBuyTwooGetOneFree item3 = new ItemBuyTwooGetOneFree("item_1", 10.0);
		ItemBuyTwooGetOneFree item4 = new ItemBuyTwooGetOneFree("item_1", 10.0);
		Cart cart =  new Cart();
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		cart.addItem(item4);
		assertEquals(59.7, cart.getCartPrice().doubleValue(),0);
	}
	
	@Test
	public void shoul_BuyTwooGetOneFree_6_also_be_39_8() {
		
		ItemBuyTwooGetOneFree item1 = new ItemBuyTwooGetOneFree("item_2", 5.0);
		ItemBuyTwooGetOneFree item2 = new ItemBuyTwooGetOneFree("item_2", 5.0);
		ItemBuyTwooGetOneFree item3 = new ItemBuyTwooGetOneFree("item_2", 5.0);
		ItemBuyTwooGetOneFree item4 = new ItemBuyTwooGetOneFree("item_2", 5.0);
		ItemBuyTwooGetOneFree item5 = new ItemBuyTwooGetOneFree("item_2", 5.0);
		ItemBuyTwooGetOneFree item6 = new ItemBuyTwooGetOneFree("item_2", 5.0);
		Cart cart =  new Cart();
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		cart.addItem(item4);
		cart.addItem(item5);
		cart.addItem(item6);
		assertEquals(39.8, cart.getCartPrice().doubleValue(),0);
	}
	
	//ThreeForDollar
	
	@Test
	public void shoul_ThreeForDollar_be_19_9() {
		
		ItemThreeForDollar item1 = new ItemThreeForDollar("item_5", 10.0);

		Cart cart =  new Cart();
		cart.addItem(item1);
		assertEquals(19.9, cart.getCartPrice().doubleValue(),0);
	}

	
	@Test
	public void shoul_ThreeForDollar_be_39_8() {
		
		ItemThreeForDollar item1 = new ItemThreeForDollar("item_5", 10.0);
		ItemThreeForDollar item2 = new ItemThreeForDollar("item_5", 10.0);

		Cart cart =  new Cart();
		cart.addItem(item1);
		cart.addItem(item2);
		assertEquals(39.8, cart.getCartPrice().doubleValue(),0);
	}

	@Test
	public void shoul_ThreeForDollar_be_1() {
		
		ItemThreeForDollar item1 = new ItemThreeForDollar("item_5", 7.2);
		ItemThreeForDollar item2 = new ItemThreeForDollar("item_5", 7.2);
		ItemThreeForDollar item3 = new ItemThreeForDollar("item_5", 7.2);
		Cart cart =  new Cart();
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		assertEquals(1.0, cart.getCartPrice().doubleValue(),0);
	}
	
	@Test
	public void shoul_ThreeForDollar_be_2_9() {
		
		ItemThreeForDollar item1 = new ItemThreeForDollar("item_5", 10.0);
		ItemThreeForDollar item2 = new ItemThreeForDollar("item_5", 10.0);
		ItemThreeForDollar item3 = new ItemThreeForDollar("item_5", 10.0);
		ItemThreeForDollar item4 = new ItemThreeForDollar("item_5", 10.0);
		Cart cart =  new Cart();
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		cart.addItem(item4);
		assertEquals(20.9, cart.getCartPrice().doubleValue(),0);
	}
	
	@Test
	public void shoul_ThreeForDollar_be_2() {
		
		ItemThreeForDollar item1 = new ItemThreeForDollar("item_5", 10.0);
		ItemThreeForDollar item2 = new ItemThreeForDollar("item_5", 10.0);
		ItemThreeForDollar item3 = new ItemThreeForDollar("item_5", 10.0);
		ItemThreeForDollar item4 = new ItemThreeForDollar("item_5", 10.0);
		ItemThreeForDollar item5 = new ItemThreeForDollar("item_5", 10.0);
		ItemThreeForDollar item6 = new ItemThreeForDollar("item_5", 10.0);
		Cart cart =  new Cart();
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		cart.addItem(item4);
		cart.addItem(item5);
		cart.addItem(item6);
		assertEquals(2.0, cart.getCartPrice().doubleValue(),0);
	}
	
	
	//defaut priice
	
	@Test
	public void shoul_Default_be_19_9() {
		
		DefaultItem item1 = new DefaultItem("item_5", 10.0);

		Cart cart =  new Cart();
		cart.addItem(item1);
		assertEquals(19.9, cart.getCartPrice().doubleValue(),0);
	}

	
	@Test
	public void shoul_Default_be_39_8() {
		
		DefaultItem item1 = new DefaultItem("item_5", 10.0);
		DefaultItem item2 = new DefaultItem("item_5", 10.0);

		Cart cart =  new Cart();
		cart.addItem(item1);
		cart.addItem(item2);
		assertEquals(39.8, cart.getCartPrice().doubleValue(),0);
	}

	@Test
	public void shoul_DefaultItem_be_59_7() {
		
		DefaultItem item1 = new DefaultItem("item_5", 7.2);
		DefaultItem item2 = new DefaultItem("item_5", 7.2);
		DefaultItem item3 = new DefaultItem("item_5", 7.2);
		Cart cart =  new Cart();
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		assertEquals(43, cart.getCartPrice().doubleValue(),0);
	}
	
	//mixte
	
	@Test
	public void shoul_mixte_be_59_7() {
		
		ItemThreeForDollar item1 = new ItemThreeForDollar("item_1", 10.0);
		ItemBuyTwooGetOneFree item2 = new ItemBuyTwooGetOneFree("item_2", 10.0);
		DefaultItem item3 = new DefaultItem("item_", 10.0);
		Cart cart =  new Cart();
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		assertEquals(59.7, cart.getCartPrice().doubleValue(),0);
	}
	
	@Test
	public void shoul_mixte_be_40_8() {
		
		ItemThreeForDollar item1 = new ItemThreeForDollar("item_1", 10.0);
		ItemThreeForDollar item2 = new ItemThreeForDollar("item_1", 10.0);
		ItemThreeForDollar item3 = new ItemThreeForDollar("item_1", 10.0);
		ItemBuyTwooGetOneFree item4 = new ItemBuyTwooGetOneFree("item_2", 10.0);
		DefaultItem item5 = new DefaultItem("item_", 10.0);
		Cart cart =  new Cart();
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		cart.addItem(item4);
		cart.addItem(item5);
		assertEquals(40.8, cart.getCartPrice().doubleValue(),0);
	}
	
	@Test
	public void shoul_mixte_be_79_6() {
		
		ItemBuyTwooGetOneFree item1 = new ItemBuyTwooGetOneFree("item_1", 10.0);
		ItemBuyTwooGetOneFree item2 = new ItemBuyTwooGetOneFree("item_1", 10.0);
		ItemBuyTwooGetOneFree item3 = new ItemBuyTwooGetOneFree("item_1", 10.0);
		ItemThreeForDollar item4 = new ItemThreeForDollar("item_2", 10.0);
		DefaultItem item5 = new DefaultItem("item_3", 10.0);
		Cart cart =  new Cart();
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		cart.addItem(item4);
		cart.addItem(item5);
		assertEquals(79.6, cart.getCartPrice().doubleValue(),0);
	}
	
	@Test
	public void shoul_mixte_be_60_7() {
		
		ItemBuyTwooGetOneFree item1 = new ItemBuyTwooGetOneFree("item_1", 10.0);
		ItemBuyTwooGetOneFree item2 = new ItemBuyTwooGetOneFree("item_1", 10.0);
		ItemBuyTwooGetOneFree item3 = new ItemBuyTwooGetOneFree("item_1", 10.0);
		ItemThreeForDollar item4 = new ItemThreeForDollar("item_2", 10.0);
		ItemThreeForDollar item5 = new ItemThreeForDollar("item_2", 10.0);
		ItemThreeForDollar item6 = new ItemThreeForDollar("item_2", 10.0);
		DefaultItem item7 = new DefaultItem("item_3", 10.0);
		Cart cart =  new Cart();
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		cart.addItem(item4);
		cart.addItem(item5);
		cart.addItem(item6);
		cart.addItem(item7);
		assertEquals(60.7, cart.getCartPrice().doubleValue(),0);
	}

}
