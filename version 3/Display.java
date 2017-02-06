public class Display extends Component {

  private String resolution;
  private int colorSupport;

/**
 * [Display description]
 * @param  int    cost          [intital value for cos]
 * @param  String manufacturer  [intinal value for manufacturer]
 * @param  String resolution    [intinal value for resolution]
 * @param  int    colorSupport  [intinal value for colorSupport]
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
   * [setResolution setter method for resolution]
   * @param String resolution
   */

  public void setResolution(String resolution) {
    this.resolution=resolution;
  }

  /**
   * [getResolution getter method for resolution]
   * @return [resolution]
   */

  public String getResolution(){
    return resolution;
  }

  /**
   * [setColorSupport setter method for colorSupport]
   * @param int colorSupport []
   */

  public void setColorSupport (int colorSupport){
    this.colorSupport=colorSupport;
  }

  /**
   * [getColorsupport getter method for colorSupport]
   * @return [colorSupport]
   */

  public int getColorsupport() {
    return colorSupport;
  }

/**
 * [getDescription ]
 * @return [Display specifications]
 */

  public String getDescription () {
    return ("\nManufatcturer is :" + getManufacturer()+"\nResolution is :"+resolution+"\nSupports"+colorSupport+"Colors"+"\nPrice is : "+getCost()+"\n**********");
  }

  @Override
  public String toString()
  {return super.toString()+this.getDescription();

    }

}
