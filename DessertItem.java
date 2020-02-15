package DessertShop;


public abstract class DessertItem implements Comparable<DessertItem>{

  protected String name;
  protected int calories;
/**
 * Null constructor for DessertItem class
 */
  public DessertItem() {
    this("");
    
  }
/**
 * Initializes DessertItem data
 */
  public DessertItem(String name) {
      this.name = name;
      
      }
  /**
   * Initializes DessertItem data
   */
  public DessertItem(int cal) {
      this.calories = cal;
      
      }
 
/**
 * Returns name of DessertItem
 * @return name of DessertItem
 */
  public String getName() {
    return name;
  }
  /**
   * Returns name of DessertItem
   * @return name of DessertItem
   */
    public final int getCalories() {
      return calories;
    }
    /**
     * changes the calories' value.
     * @param cal - takes in the calories and sets the calories.
     */
    public final void setCalories(int cal) {
        calories = cal;
      }
/**
 * Returns cost of DessertItem
 * @return cost of DessertItem
 */
  public abstract double getCost();
  /**
   *  Compares the Dessert Item based on its price
   */
  @Override
  public int compareTo(DessertItem anotherDes) {
	  return  ((int)this.getCost() - (int)anotherDes.getCost());
  }
  
  /**
   * outputs the Dessert Item that is more expensive.
   * @param that - other Dessert Item being compared to this Dessert Item.
   */
  public void max(DessertItem that) {
	  int compare = this.compareTo(that);
	  if (compare < 0) {
		  System.out.println(that.getName()+" at $"+that.getCost()+ " is bigger than "+ this.getName() + " at $"+this.getCost());
	  }
	  else {
		  System.out.println(this.getName()+" at $"+this.getCost()+ " is bigger than "+ that.getName() + " at $"+that.getCost());
	  }
  }
  
  
  
  
}




