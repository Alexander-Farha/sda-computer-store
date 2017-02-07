import java.util.HashMap;
public class HardDisk extends Component {
  private int loadUpload;
  private String  writeCash;

/**
 * @param  int    loadUpload
 * @param  String manufacturer
 * @param  int    cost
 * @param  String writeCash
 * @return
 */
  public HardDisk (int loadUpload , String manufacturer, int cost, String writeCash){
    super(manufacturer,cost);
    this.loadUpload=loadUpload;
    this.writeCash=writeCash;
  }
  //default constructor
  public HardDisk() {
  }

  /**
   * Getter method
   * @return loadUpload
   */
  public int getLoadUpload() {
    return loadUpload;
  }

  /**
   * Setter method for loadUpload field
   * @param int assings to loadUpload
   */

  public void setLoadUpload(int loadUpload){
    this.loadUpload=loadUpload;
  }

  /**
   * Getter method
   * @return  writeCash
   */
  public String getCash() {
    return writeCash;
  }

  /**
   * Setter method
   * @param String assigns to writeCash
   */
  public void setCash (String writeCash){
    this.writeCash=writeCash;
  }

  /**
   * @return Values for all fields in HardDisk class
   */

  public String getDescription () {
    return ("\nManufatcturer is :" + getManufacturer()+ "\nload and upload speed is " +loadUpload +"\nWrite Cash size " +writeCash+ "\nprice is :"+getCost()+"\n**********");
  }

  @Override
  public String toString()
  {return super.toString()+this.getDescription();

    }
}
