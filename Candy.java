package DessertShop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Candy extends DessertItem{
	public double weight;
	public double pricelbs;
	/**
	 * default constructor
	 */
	public Candy() {
		weight = 0;
		pricelbs = 0;
	}
	/**
	 * creates a constructor for the name, weight and price per pound of the Candy class
	 * while also naming the object Candy.
	 * @param name - name of the Candy item
	 * @param w - weight of the Candy item
	 * @param pp - price per pound of the Candy item
	 */
	public Candy(String name, double w, double pp) {
		super(name);
		weight = w;
		pricelbs = pp;
	}
	/**
	 * sets the weight of the Candy item
	 * @param w - weight of the Candy item
	 */
	public void setWeight(double w) {
		weight = w;
	}
	/**
	 * sets the price per pound of the Candy item.
	 * @param pp - price per pound of the Candy item
	 */
	public void setPriceLbs(double pp) {
		pricelbs = pp;
	}
	public String getName() {
		return name + "(Candy)";
	}
	/**
	 * returns info about weight and price per pound
	 * @return info about weight and price per pound
	 */
	public String extraInfo() {
		return weight+" lbs. @ "+ pricelbs+" /lb.";
	}
	@Override
	public double getCost() {
		double input = weight*pricelbs;
		BigDecimal bd = new BigDecimal(input).setScale(2, RoundingMode.HALF_UP);
        double newInput = bd.doubleValue();
		return newInput;
	}
	public String toString() {
		String namePrice = String.format("%-30s $%.2f%n", this.getName(),this.getCost());
		String output = this.extraInfo() +"\n"+ namePrice;
		String nameCal = this.getName()+" cal:" +this.getCalories();
		if (this.getCalories()>0) {
			return output+ nameCal+ "\n";
		}
		else {
		return output;
		}
	}
}
