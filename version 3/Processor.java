public class Processor extends Component {

  private int clockSpeed;
  private int numberOfCpuCores;
  private int cashLineSize;

/**
 * [Processor description]
 * @param  int    clockSpeed       []
 * @param  String manufacturer     []
 * @param  int    cost             []
 * @param  int    numberOfCpuCores []
 * @param  int    cashLineSize     []
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

  public int getClockSpeed(){
    return clockSpeed;
  }
  public void setClockSpeed(int clockSpeed){
  this.clockSpeed=clockSpeed;
  }
  public int getNumberOfCpuCores() {
    return numberOfCpuCores;
  }
  public void setNumberOfCpuCores(int numberOfCpuCores) {
    this.numberOfCpuCores=numberOfCpuCores;
  }
  public int getCashLineSize() {
    return cashLineSize;
  }
  public void setCashLineSize(int cashLineSize){
    this.cashLineSize=cashLineSize;
  }
  public String getDescription () {
    return ("\nManufatcturer is :" + getManufacturer()+"\nClock Speed "+clockSpeed+"\nNumbers Of Cores "+numberOfCpuCores+"\nCash line size"+cashLineSize+"\nPrice is : "+ getCost()+"\n**********");
  }

  @Override
  public String toString()
  {return super.toString()+this.getDescription();

    }
}
