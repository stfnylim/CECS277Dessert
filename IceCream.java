package DessertShop;

public class IceCream extends DessertItem{
	public double cost;
	/**
	 * default constructor sets name to IceCream
	 */
	public IceCream() {
	}
	/**
	 * initializes the name and cost of the IceCream item
	 * @param nm - name of the IceCream item
	 * @param c - cost of the IceCream item
	 */
	public IceCream(String nm,double c) {
		super(nm);
		cost = c;
	}
	public String getName() {
		return name + "(IceCream)";
	}
	/**
	 * initializes the name of the IceCream item
	 * @param string - name of the IceCream item
	 */
	public IceCream(String nm) {
		name = nm;
	}
	@Override
	public double getCost() {
		return cost;
	}
	public String toString() {
		String namePrice = String.format("%-30s $%.2f%n", this.getName(),this.getCost());
		if (this.getCalories()>0) {
			return namePrice+ this.getName()+" cal:" +this.getCalories()+"\n";
		}
		return namePrice;
		
	}
}
