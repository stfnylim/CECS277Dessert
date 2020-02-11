package DessertShop;

public class DessertShopTester {
	public static void main(String[] args) {
		Checkout check = new Checkout();
		check.enterItem(new Candy("KitKat",12,.69));
		check.enterItem(new Candy("Snickers",10,.45));
		check.enterItem(new IceCream("Chocolate Double Fudge", 10));
		check.enterItem(new IceCream("Strawberry Extra Sweet", 13));
		check.enterItem(new Sundae("Truffle Chocolate", 10,"Banana", 2));
		check.enterItem(new Sundae("Almond", 12,"Cherry Coconut",  4));
		check.enterItem(new Cookie("Double Chocolate", 6, 9));
		check.enterItem(new Cookie("Oatmeal Raisin Vegan", 7, 10));
		check.getReceipt();
	}
	
}
