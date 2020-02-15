package DessertShop;

import java.util.Arrays;
import java.util.Collections;

public class DessertShopTester {
	//text table?
	public static void main(String[] args) {
		// making desserts
		
		Candy kitkat = new Candy("KitKat",12,.69);
		Candy snickers = new Candy("Snickers",10,.45);
		kitkat.setCalories(200);
		snickers.setCalories(300);
		
		Cookie doublechocolate = new Cookie("Double Chocolate", 6, 9);
		Cookie oatmeal = new Cookie("Oatmeal", 7, 10);
		doublechocolate.setCalories(150);
		oatmeal.setCalories(87);
		
		IceCream chocolatefudge = new IceCream("Double Fudge", 10);
		IceCream strawberry = new IceCream("Strawberry", 13);
		chocolatefudge.setCalories(145);
		strawberry.setCalories(120);
		
		Sundae truffle = new Sundae("Truffle Chocolate", 10,"Banana", 2);
		Sundae almond = new Sundae("Almond", 12,"Cherry Coconut",  4);
		truffle.setCalories(350);
		almond.setCalories(245);
		
		//tester for candy
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Candy Tester:");
		System.out.println(new Candy());
		System.out.println(kitkat);
		System.out.println(snickers);
		
		//tester for cookie
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Cookie Tester:");
		System.out.println(new Cookie());
		System.out.println(doublechocolate);
		System.out.println(oatmeal);
		
		//tester for ice cream
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Ice Cream Tester:");
		System.out.println(new IceCream());
		System.out.println(chocolatefudge);
		System.out.println(strawberry);
		
		//tester for sundae
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Sundae Tester:");
		System.out.println(new Sundae());
		System.out.println(truffle);
		System.out.println(almond);
		
	
		// tester for all types of desserts
		System.out.println("------------------------------------------------------------------------------");
		Checkout check = new Checkout();
		check.enterItem(kitkat); // candy
		check.enterItem(snickers);
		check.enterItem(chocolatefudge); // 
		check.enterItem(strawberry);
		check.enterItem(truffle); // 
		check.enterItem(almond);
		check.enterItem(doublechocolate); // cookies
		check.enterItem(oatmeal);
		
		check.getReceipt();
	
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Max test with the same dessert type:");
		kitkat.max(snickers);
		chocolatefudge.max(strawberry);
		truffle.max(almond);
		doublechocolate.max(oatmeal);
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Max test with different dessert type:");
		kitkat.max(chocolatefudge);
		snickers.max(truffle);
		strawberry.max(oatmeal);
		doublechocolate.max(almond);
		
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("The unsorted dessertList is:");
		
		for(DessertItem item:check.cart) {
			System.out.println(item.getName()+" at $"+ item.getCost());
		}
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("The unsorted dessertList is:");
		Collections.sort(check.cart);
		for(DessertItem item:check.cart) {
			System.out.println(item.getName()+" at $"+ item.getCost());
		}
		
	}
	
}
