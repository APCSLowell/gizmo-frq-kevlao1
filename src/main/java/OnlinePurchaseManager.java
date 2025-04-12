import java.util.ArrayList;
public class OnlinePurchaseManager
{
  /** An ArrayList of purchased Gizmo objects,
  * instantiated in the constructor.
  */
  private ArrayList<Gizmo> purchases;
  
  /** Returns the number of purchased Gizmo objects that are electronic
  * whose manufacturer is maker, as described in part (a).
  */
  public int countElectronicsByMaker(String maker)
  {
    int counter = 0;
    for(int i = 0; i < purchases.size(); i++){
    if(purchases.get(i).isElectronic() == true && purchases.get(i).getMaker().equals(maker)){
      counter++;
    }
    }
    return counter;
  }
  
  /** Returns true if any pair of adjacent purchased Gizmo objects are
  * equivalent, and false otherwise, as described in part (b).
  */
  public boolean hasAdjacentEqualPair()
  {
    if(purchases.size() < 2) return false;
    else{
      for(int i = 1; i < purchases.size(); i++){
        if(purchases.get(i-1).isElectronic() == purchases.get(i).isElectronic() && purchases.get(i-1).getMaker().equals(purchases.get(i).getMaker())){return true;}
      }
    }
    return false;
  }
  public OnlinePurchaseManager()
  {
    purchases = new ArrayList <Gizmo>();
  }
  public void add(Gizmo g)
  {
    purchases.add(g);
  }
}
