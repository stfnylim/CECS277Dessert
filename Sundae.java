package DessertShop;

public class Sundae extends IceCream{
	public double costTop;
	public String topping;
	/**
	 * default constructor
	 */
	public Sundae(){
		super("Sundae");
	}
	/**
	 * Initializes the IceCream name, cost and the toppings cost
	 * in the Sundae item
	 * @param name - name of the Sundae item
	 * @param cost - cost of the IceCream in the Sundae item
	 * @param ct - cost of the toppings in the Sundae item
	 */
	public Sundae(String name,double cost,String topping,double ct){
		super(name);
		this.cost = cost;
		costTop = ct;
		this.topping = topping;
	}
	public String getName() {
		return name+"(Sundae)"+" with "+topping+"(Topping)";
	}
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return cost + costTop;
	}
}
