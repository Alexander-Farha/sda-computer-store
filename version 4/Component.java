public class Component {

  private String manufacturer;
  private int cost;

/**
 * Component constructor
 * @param  String manufacturer
 * @param  int    cost
 */
public Component (String manufacturer,int cost){
  this.manufacturer=manufacturer;
  this.cost=cost;
}
//default constructor
public Component (){

}

/**
 *  Getter method for cost
 * @return cost
 */

  public int getCost() {
    return cost;
  }

  /**
   * Setter method for cost
   * @param int assigns to cost
   */
public void setCost(int cost) {
  this.cost=cost;
}

/**
 * Getter method for manufacturer
 * @return manufacturer
 */

  public String getManufacturer(){
    return manufacturer;
  }

  /**
   * Setter method for manufacturer
   * @param String assigns to manufacturer
   */

  public void setManufacturer(String manufacturer) {
    this.manufacturer=manufacturer;
  }

/**
 * @return Name of the class which the object is an instance
 */
  @Override
  public String toString()
  {
    return this.getClass().getSimpleName()+":";
    }
}
