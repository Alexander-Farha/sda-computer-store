public class Processor extends Component {

  private int clockSpeed;
  private int numberOfCpuCores;
  private int cashLineSize;

/**
 * Processor constructor
 */
  public Processor (int clockSpeed,String manufacturer,int cost,int numberOfCpuCores,int cashLineSize) {
    super(manufacturer,cost);
    this.clockSpeed=clockSpeed;
    this.numberOfCpuCores=numberOfCpuCores;
    this.cashLineSize=cashLineSize;
  }
//default constructor
  public Processor () {
  }

/**
 * Getter method
 * @return clockSpeed
 */

  public int getClockSpeed(){
    return clockSpeed;
  }

  /**
   * Setter method
   * @param int assings to clockSpeed
   */

  public void setClockSpeed(int clockSpeed){
  this.clockSpeed=clockSpeed;
  }

  /**
   * Getter method
   * @return numberOfCpuCores
   */

  public int getNumberOfCpuCores() {
    return numberOfCpuCores;
  }

  /**
   * Setter method
   * @param int assigns to numberOfCpuCores
   */

  public void setNumberOfCpuCores(int numberOfCpuCores) {
    this.numberOfCpuCores=numberOfCpuCores;
  }

  /**
   * Getter method
   * @return cashLineSize
   */

  public int getCashLineSize() {
    return cashLineSize;
  }

  /**
   *Setter method
   * @param int assigns to cashLineSize
   */

  public void setCashLineSize(int cashLineSize){
    this.cashLineSize=cashLineSize;
  }

/**
 * @return Valuse that returned in all methods in Processor class
 */

  public String getDescription () {
    return ("\nManufatcturer is :" + getManufacturer()+"\nClock Speed "+clockSpeed+"\nNumbers Of Cores "+numberOfCpuCores+"\nCash line size"+cashLineSize+"\nPrice is : "+ getCost()+"\n**********");
  }

  @Override
  public String toString()
  {return super.toString()+this.getDescription();

    }
}
