import java.util.HashMap;
public class HardDisk extends Component {
  private int loadUpload;
  private String  writeCash;

//HardDisk constructor
  public HardDisk (int loadUpload , String manufacturer, int cost, String writeCash){
    super(manufacturer,cost);
    this.loadUpload=loadUpload;
    this.writeCash=writeCash;
  }
  //default constructor
  public HardDisk() {
  }

  /**
   * [getLoadUpload getter method]
   * @return [loadUpload]
   */
  public int getLoadUpload() {
    return loadUpload;
  }

  /**
   * [ setter method for loadUpload field]
   * @param int loadUpload [int value]
   */

  public void setLoadUpload(int loadUpload){
    this.loadUpload=loadUpload;
  }

  /**
   * [ getter method] for getCash field
   * @return [string vlaue in writeCash]
   */
  public String getCash() {
    return writeCash;
  }

  /**
   * [ setter method for writeCash field]
   * @param String
   */
  public void setCash (String writeCash){
    this.writeCash=writeCash;
  }

  /**
   * [getDescription prints values for all fields in HardDisk class]
   * @return [description]
   */

  public String getDescription () {
    return ("\nManufatcturer is :" + getManufacturer()+ "\nload and upload speed is " +loadUpload +"\nWrite Cash size " +writeCash+ "\nprice is :"+getCost()+"\n**********");
  }

  @Override
  public String toString()
  {return super.toString()+this.getDescription();

    }
}
