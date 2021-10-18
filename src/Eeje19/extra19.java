//Crear una función rellene un vector con números aleatorios, pasándole un arreglo
//por parámetro. Después haremos otra función o procedimiento que imprima el
//vector
package Eeje19;

import java.util.Scanner;

public class extra19 {
     public static void llenar(int[] vecAll, int [] valores){
            for(int i=0; i<5; i++){
               vecAll[i] = valores[i];
            }
        }
     public static void llenarV_al(int[] vec ){
            for (int i = 0; i < 5; i++) {
                vec[i] =(int) (Math.random()*10);
            }
        }
     public static void imprimir(int vec[]){
         System.out.print(" [ ");
         for (int i = 0; i < 5; i++) {
             if(i<(int)(5-1)){
                 System.out.print(vec[i]+", ");
             }else{
                 System.out.print(vec[i]);
             }
         }
         System.out.println(" ]");
     }
      


    public static void main(String[] args) {
       
        int vecP[] =  new int [5];
        int vec [] = new int [5];
        llenarV_al(vecP);
        llenar(vec,vecP);
        imprimir(vec);
       
      }
}
