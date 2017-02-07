public class Display extends Component {

  private String resolution;
  private int colorSupport;

/**
 * @param  int    cost          intital value for cos
 * @param  String manufacturer  intinal value for manufacturer
 * @param  String resolution    intinal value for resolution
 * @param  int    colorSupport  intinal value for colorSupport
 */

  public Display (int cost ,String manufacturer, String resolution , int colorSupport) {
    super(manufacturer,cost);
    this.resolution=resolution;
    this.colorSupport=colorSupport;

  }
  //default consctrucor
  public Display(){

  }

  /**
   * Setter method for resolution
   * @param String assings to resolution
   */

  public void setResolution(String resolution) {
    this.resolution=resolution;
  }

  /**
   * Getter method for resolution
   * @return resolution
   */

  public String getResolution(){
    return resolution;
  }

  /**
   * Setter method for colorSupport
   * @param int assings to colorSupport
   */

  public void setColorSupport (int colorSupport){
    this.colorSupport=colorSupport;
  }

  /**
   * Getter method for colorSupport
   * @return colorSupport
   */

  public int getColorsupport() {
    return colorSupport;
  }

/**
 * @return Display specifications
 */

  public String getDescription () {
    return ("\nManufatcturer is :" + getManufacturer()+"\nResolution is :"+resolution+"\nSupports"+colorSupport+"Colors"+"\nPrice is : "+getCost()+"\n**********");
  }

  @Override
  public String toString()
  {return super.toString()+this.getDescription();

    }

}
