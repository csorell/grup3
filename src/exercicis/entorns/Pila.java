package exercicis.entorns;

import java.util.ArrayList;
import java.util.List;

public class Pila {
 List<Integer> pila = new ArrayList<Integer> ();
 
 public void push(int numero){
     pila.add(numero);
 }
 
 public void pop(){
     pila.remove(pila.size() -1);
 }
 
 public int top(){
     return pila.get(pila.size() -1);
}
 
  public boolean empty(){
     if (pila.size() == 0){
         return true;
     }
     return false;
}
 
}



