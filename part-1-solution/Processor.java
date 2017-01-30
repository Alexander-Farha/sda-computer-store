public class Processor {

  private int clockSpeed;
  private String manufaturer;
  private int cost;
  private int numberOfCpuCores;
  private int cashLineSize;

  public Processor (int clockSpeed,String manufaturer,int cost,int numberOfCpuCores,int cashLineSize) {
    this.clockSpeed=clockSpeed;
    this.manufaturer=manufaturer;
    this.cost=cost;
    this.numberOfCpuCores=numberOfCpuCores;
    this.cashLineSize=cashLineSize;
  }

  public int getClockSpeed(){
    return clockSpeed;
  }
  public void setClockSpeed(int clockSpeed){
  this.clockSpeed=clockSpeed;
  }
  public String getManufaturer(){
    return manufaturer;
  }
  public void setManufaturer(String manufaturer){
    this.manufaturer=manufaturer;
  }
  public int getCost() {
    return cost;
  }
  public void setCost(int cost) {
    this.cost=cost;
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
}
