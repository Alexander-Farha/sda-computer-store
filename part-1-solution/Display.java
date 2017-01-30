public class Display {

  private String resolution;
  private int colorSupport;
  private int cost;

  public Display (String resolution , int colorSupport,  int cost) {
    this.resolution=resolution;
    this.colorSupport=colorSupport;
    this.cost=cost;
  }
  public void setResolution(String resolution) {
    this.resolution=resolution;
  }
  public String getResolution(){
    return resolution;
  }
  public void setColorSupport (int colorSupport){
    this.colorSupport=colorSupport;
  }
  public int getColorsupport() {
    return colorSupport;
  }
  public int getCost(){
    return cost;
  }
  public void setCost(int cost) {
    this.cost=cost;
  }

}
