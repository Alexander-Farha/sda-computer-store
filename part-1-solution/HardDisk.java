public class HardDisk {

  private int loadUpload;
  private String manufaturer;
  private int coast;
  private String  writeCash;

  public HardDisk (int loadUpload , String manufaturer, int cost, String writeCash){
    this.loadUpload=loadUpload;
    this.manufaturer=manufaturer;
    this.coast=cost;
    this.writeCash=writeCash;
  }
  public int getLoadUpload() {
    return loadUpload;
  }
  public void setLoadUpload(int loadUpload){
    this.loadUpload=loadUpload;
  }
  public String getManufaturer(){
    return manufaturer;
  }
  public void setManufaturer(String manufaturer) {
    this.manufaturer=manufaturer;
  }
  public int getCost() {
    return coast;
  }
  public void setCost (int coast){
    this.coast=coast;
  }
  public String getCash() {
    return writeCash;
  }
  public void setCash (String writeCash){
    this.writeCash=writeCash;
  }
}
