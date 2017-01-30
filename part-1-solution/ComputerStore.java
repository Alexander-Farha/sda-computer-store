import java.util.ArrayList;
class CompuerStore {
private  ArrayList<Computer> computers ;

  public boolean addComputer(Computer newComputer){
    if(computers.add(newComputer))
    return true;
    else
    return false;

}

public boolean removeComputer (int index) {
  if(index<computers.size()) {
  computers.remove(index);
  return true;
 }
  else{
  return false;
}

}
public void printTotalValue() {
  System.out.println(computers.size());
}
}
