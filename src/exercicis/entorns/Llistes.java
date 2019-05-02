package exercicis.entorns;

public class Llistes {
    public static int[] ordenar (int[] llista1, int[] llista2){
        
        int[] llista3 = new int[llista1.length + llista2.length];
        for(int k = 0; k < llista1.length; k++){
            llista3[k] = llista1[k];
        }
        for(int k = llista1.length; k < llista3.length; k++){
            llista3[k] = llista2[k -llista1.length];
        }
        boolean ordenat = false;
        while ( ordenat == false ){
        for(int k = 0; k < llista3.length -1; k++){
            if(llista3[k] > llista3[k+1]){
            int a = llista3[k];
            llista3[k] = llista3[k+1];
            llista3[k+1] = a;
            }
        }
        for(int k = llista3.length -1; k > 0; k-- ){
            if(llista3[k] < llista3[k-1]){
                break;
            }else{
                if(k == 1){
                    ordenat = true;
                }
            }
        }
        }
        return llista3;
    }
}