package exercicis.entorns;

import java.util.ArrayList;
import java.util.List;

public class Fila {
    List<Integer> fila = new ArrayList<Integer>();

    public void encolar(int n){
        fila.add(n);
    }
    public void desencolar(){
        fila.remove(0);
    }
    public int frente(){
        return fila.get(0);
    }
    
  public boolean empty(){
     if (fila.size() == 0){
         return true;
     }
     return false;
}
}