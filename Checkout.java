package DessertShop;
import java.lang.Object;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Checkout {
	public ArrayList<DessertItem> cart = new ArrayList<DessertItem>();
	/**
	 * Creates a Checkout instance with an empty list of DessertItem's
	 */
	public Checkout() {
		
	}
	/**
	 * Returns the number of DessertItem's in the list
	 * @return number of DessertItem's in the list
	 */
	public int numberOfItems() {
		return cart.size();
	}
	/**
	 * A DessertItem is added to the end of the list of items
	 * @param item - DessertItem to add to list of items
	 */
	public void enterItem(DessertItem item) {
		cart.add(item);
	}
	/**
	 * Clears the Checkout to begin checking out a new set of items
	 */
	public void clear() {
		cart.clear();
	}
	/**
	 * Returns total cost of items in cents (without tax)
	 * @return - total cost of items in cents (without tax)
	 */
	public float totalCost() {
		float cost = 0;
		for(DessertItem item: cart) {
			cost += item.getCost();
		}
		return cost;
	}
	/**
	 * Returns total tax on items in cents
	 * @return total tax on items in cents
	 */
	public double totalTax() {
		double input = this.totalCost()*.0725;
		BigDecimal bd = new BigDecimal(input).setScale(2, RoundingMode.HALF_UP);
        double newInput = bd.doubleValue();
		return newInput;
	}
	
	public void getReceipt() {
		double total = this.totalCost()+this.totalTax();
		System.out.println("Number of items:"+ this.numberOfItems());
		System.out.println("Total cost:" + this.totalCost()*100);
		System.out.println("Total tax:"+ this.totalTax()*100);
		System.out.println("Cost + tax:" + total*100 + "\n");
		
		
		
		System.out.println("----Steph's Sweet Shop----");
		for (DessertItem item: cart) {
			if(item instanceof Candy ) {
				System.out.println(((Candy)item).extraInfo());
			}
			else if(item instanceof Cookie) {
				System.out.println(((Cookie)item).extraInfo());
			}
			System.out.printf("%-20s $%.2f%n",item.getName(), item.getCost());
		}
		System.out.println();
		System.out.printf("%-20s $%.2f%n","Tax", this.totalTax());
		System.out.printf("%-20s $%.2f%n","Total Cost", total);
	}
	/**
	 * @return - a String representing a receipt for the current list of
	 *  DessertItem's with the name of the Dessert store, 
	 *  the items purchased, the tax, and the total cost
	 *  @Overrides toString in class java.lang.Object
	 */
	public java.lang.String toString(){
		
		return null;
	}
	
}
