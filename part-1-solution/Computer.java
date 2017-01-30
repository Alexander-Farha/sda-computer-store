
public class Computer {

  private Processor theProcessor;
  private HardDisk theHardDisk;
  private Display theDisplay;

  public Computer() {
   theProcessor= new Processor(2,"S",12,12,12);
   theHardDisk = new HardDisk(2,"b",3,"b");
   theDisplay  = new Display("c",1,1);
  }
  public void printComputerSummary() {
    System.out.println("Procrssor Manufaturer"+theProcessor.getManufaturer()+"/n Number of Cores is :" + theProcessor.getNumberOfCpuCores()+ "/n Cash Line Size is :" +theProcessor.getCost()+"/n Procrssor Clock Speed is :"+theProcessor.getClockSpeed()+"Procrssor prise is:"+theProcessor.getCost() );
    System.out.println("Hard Disk Manufaturer"+theHardDisk.getManufaturer()+"/n Upload Download Speed"+theHardDisk.getLoadUpload()+"/n Write Cash"+theHardDisk.getCash()+"/n Hard Disk Price is"+theHardDisk.getCost());
  }

}
