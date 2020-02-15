package DessertShop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cookie extends DessertItem{
	public int number;
	public double pricedzn;
	/**
	 * default constructor of Cookie
	 */
	public Cookie() {
		number = 0;
		pricedzn = 0;
	}
	/**
	 * initializes the name, number of cookies and 
	 * price per dozen in constructor
	 * @param name - name of the cookie item
	 * @param num - number of cookies
	 * @param pd - price per dozen of the cookie.
	 */
	public Cookie(String name,int num, double pd) {
		super(name);
		number = num;
		pricedzn = pd;
	}
	/**
	 * returns info about number of cookies and price per dozen
	 * @return info about number of cookies and price per dozen
	 */
	public String extraInfo() {
		return number + " @ " + pricedzn + "/dz."; 
	}
	public String getName() {
		return name + "(Cookie)";
	}
	@Override
	public double getCost() {
		double input = (number)*(pricedzn/12);
		BigDecimal bd = new BigDecimal(input).setScale(2, RoundingMode.HALF_UP);
        double newInput = bd.doubleValue();
		return newInput;
	}
	public String toString() {
		String namePrice = String.format("%-30s $%.2f%n", this.getName(),this.getCost());
		String output = this.extraInfo() + "\n" + namePrice;
		if (this.getCalories()>0) {
		return output+ this.getName()+" cal:" +this.getCalories()+ "\n";
		}
		return output;
		
	}
}
