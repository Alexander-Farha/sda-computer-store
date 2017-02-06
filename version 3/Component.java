public class Component {

  private String manufacturer;
  private int cost;

/**
 * [Component constructor]
 * @param  String manufacturer
 * @param  int    cost
 */
public Component (String manufacturer,int cost){
  this.manufacturer=manufacturer;
  this.cost=cost;
}

//deafult constructor
public Component (){

}

/**
 * [getCost getter method for cost]
 * @return [cost]
 */

  public int getCost() {
    return cost;
  }

  /**
   * [setCost setter method for cost]
   * @param int cost
   */
public void setCost(int cost) {
  this.cost=cost;
}

/**
 * [getManufacturer getter method for manufacturer]
 * @return [manufacturer]
 */

  public String getManufacturer(){
    return manufacturer;
  }

  /**
   * [setManufacturer setter method for manufacturer]
   * @param String manufacturer
   */

  public void setManufacturer(String manufacturer) {
    this.manufacturer=manufacturer;
  }

/**
 * [toString ]
   * @return [name of the class which the object is an instance]
 */
  @Override
  public String toString()
  {
    return this.getClass().getSimpleName()+":";
    }
}
