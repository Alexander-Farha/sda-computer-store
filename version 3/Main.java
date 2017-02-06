import java.util.*;

public class Main {


public static void main(String args[]) throws java.lang.ClassNotFoundException{

Computer myPc = new Computer();
HardDisk hdd1 = new HardDisk(1,"Seagate" , 150, "2");
Display p1= new Display (12,"ss","bb",1) ;
Processor p2=new Processor (15,"tt",1,2,3);
myPc.addComponent("ka",hdd1);
myPc.addComponent("screen",p1);
myPc.addComponent("Processor",p2);
myPc.printComputerSummary();
Computer pc3 = new Computer();
Processor p3=new Processor (15,"tt",1,2,3);
pc3.addComponent("processor",p3);
ComputerStore store=new ComputerStore ();
store.addComputer(myPc);
store.addComputer(pc3);
store.findMostExpensiveComputerV1();
store.findMostExpensiveComputerV2();
store.findMostExpensiveComputerV3();
store.findMostExpensiveComputerV4();
store.printAllComputers();
System.out.println("\n************\n");
myPc.printComputerSummary();
myPc.totalCost();
myPc.getTotalPrice();
}
}
