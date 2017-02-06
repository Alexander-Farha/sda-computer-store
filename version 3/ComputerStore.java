
import java.lang.Object;
import java.util.*;

public class ComputerStore extends java.lang.Object{


private  ArrayList<Computer> computers ;
private ArrayList<Component> components ;
// constructor
public ComputerStore() {
computers = new  ArrayList<Computer>();
components= new ArrayList<Component>();
}

/**
 * [addComputer adds new computer to the arraylist computers]
 * @param computer newComputer is the element this method will add
 * @return          [true if the computer added and false if its not]
 */

  public boolean addComputer(Computer newComputer){
    if(newComputer instanceof Computer){
    computers.add(newComputer);
    return true;
}
    else
    return false;

}

/**
 * [addComponent adds new component to the arraylist called component]
 * @param  Component newComponent is the element this method will add
 * @return           [true if the component added and false if its not]
 */

public boolean addComponent(Component newComponent){
  if(newComponent instanceof Component) {
  components.add(newComponent) ;
  return true;}
 else
  return false;
}

/**
 * [removeComputer removes a computer from the arraylist using spisefic index]
 * @param  int index         [the index of the computer should be removed]
 * @return     [true in the element removed or false if its not availble or the index out of the range of the arraylist]
 */

public boolean removeComputer (int index) {
  if(index<computers.size()) {
  computers.remove(index);
  return true;
 }
  else{
  return false;
}

}

/**
 * [totalCostOfComponents return the total cost for all components that is from the same type in the store]
 * @param  String                           component_type [the component that method will return total cost for all components under this type ]
 * @return                                  [total price for specefic component type]
 * @throws java.lang.ClassNotFoundException [in case that the string parameter not match with one of the components classes(HardDisk,Display,Processor)  ]
 */

public int totalCostOfComponents(String component_type) throws java.lang.ClassNotFoundException{
  int price=0;

for(Component co:components)
{
if(Class.forName(component_type).isInstance(co))
  {
    price+=co.getCost();
  }
}
  System.out.println("The Total Cost of all components :"+price);
  return price;

  }

/**
 * [printTotalValue prints out the total price for all computers in the store]
 */

public void printTotalValue() {
   int total=0;
  for(Computer c: computers){
      total=c.totalCost();
    }
    System.out.println("Computer no."+ total+"$");
}

/**
 * [getTotalPrice ]
 * @param  int index         [ index for computer in the computers arraylist ]
 * @return     [total cost for the computer]
 */

public int getTotalPrice(int index) {
  return computers.get(index).totalCost();
}

/**
 * [printAllComputers prints the summary for all copmuters in the store]
 * @return [called printComputerSummary method for each computer]
 */

public void printAllComputers() {
  for(Computer c: computers)
  {
    c.printComputerSummary();
  }
}

/**
 * [findMostExpensiveComputerV1 using for loop]
 * @return [the most expensive computer in store]
 */

public Computer findMostExpensiveComputerV1(){
  Computer currentMostExpensive=computers.get(0);
  int index;
  for(index=1;index<computers.size();index++){
      if(computers.get(index).totalCost() >= currentMostExpensive.totalCost())
          currentMostExpensive=computers.get(index);
  }
  System.out.println("The Most Expensive Computer total price is :" +currentMostExpensive.totalCost());
  return currentMostExpensive;
}

/**
 * [findMostExpensiveComputerV2 using while loop]
 * @return [the most expensive computer in store]
 */

public Computer findMostExpensiveComputerV2(){
  int index=0;
  Computer currentMostExpensive=computers.get(0);
  while(index<computers.size()){
    if(computers.get(index).totalCost() >= currentMostExpensive.totalCost())
        currentMostExpensive=computers.get(index);
        index ++;
  }
   System.out.println("The Most Expensive Computer total price is :" +currentMostExpensive.totalCost());
  return currentMostExpensive;
}

/**
 * [findMostExpensiveComputerV3 using for each loop]
 * @return [the most expenive computer in store]
 */

public Computer findMostExpensiveComputerV3() {
  Computer currentMostExpensive=computers.get(0);
  for(Computer c: computers){
    if(c.totalCost() >= currentMostExpensive.totalCost())
        currentMostExpensive=c;
  }
   System.out.println("The Most Expensive Computer total price is :" +currentMostExpensive.totalCost());
  return currentMostExpensive;
}

/**
 * [findMostExpensiveComputerV4 using iterator]
 * @return [the most expenive computer in store]
 */

public Computer findMostExpensiveComputerV4() {
  Computer currentMostExpensive=computers.get(0);
  Iterator<Computer> itera=computers.iterator();
  while(itera.hasNext()) {
    Computer tempCurrentMostExpensive=itera.next();
    if(itera.next().totalCost() >= currentMostExpensive.totalCost())
    currentMostExpensive=tempCurrentMostExpensive;
  }
   System.out.println("The Most Expensive Computer total price is :" +currentMostExpensive.totalCost());
  return currentMostExpensive;
}
}
