/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicis.entorns;
public class Factorial {
        public static void main(String[] args) {
    
        int num = 49;
        System.out.println(num);
        }  
    
        public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
        }
}
