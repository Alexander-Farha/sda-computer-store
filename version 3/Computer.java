import java.util.*;
import java.util.HashMap;

public class Computer {

  private HashMap <String , Component> configuration;

  public Computer() {
      configuration= new HashMap <String , Component>();
  }

  /**
   * [printComputerSummary prints out summary for all components in the computer]
   */

 public void printComputerSummary() {
     for(String k:configuration.keySet() )
     {
    System.out.println( configuration.get(k)+"\n");
}
  }

  /**
   * [totalCost for all the components in the computer]
   * @return [total cost]
   */

  public int totalCost() {

      int totalcost=0;
    for(Map.Entry<String, Component> configuration : configuration.entrySet()) {
        totalcost += configuration.getValue().getCost();
    }
      return totalcost;
  }

  /**
   * [getTotalPrice print out totalCost() returned value  ]
   */

  public void getTotalPrice() {
      System.out.println("Total price is :"+totalCost());
    }

    /**
     * [addComponent add new component to the configuration hashmap]
     * @param String    name [name of the component]
     * @param Component c    [component type (HardDisk,Display,processor)]
     */

  public void addComponent (String name, Component c) {
    configuration.put(name,c);
  }

  /**
   * [removeComponent delete element from the configuration hashmap ]
   * @param String s [name of the element to be remoed from the configuration hashmap ]
   */

  public  void removeComponent(String s){
    configuration.remove(s);
  }
}
