package DessertShop;


public abstract class DessertItem {

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

}




