
package Eeje21;

import java.util.Scanner;


public class Eeje21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese tamaño de matriz N x M");
        int n = leer.nextInt();
        int m = leer.nextInt();
        int [][] matrizNM = new int [n][m];
        int suma=0;
        
        for (int i = 0; i < matrizNM.length; i++) {
            for (int j = 0; j < matrizNM[i].length; j++) {
                matrizNM[i][j] = (int) (Math.random()*10+1);
                
            }
           
        }
        
        for (int i = 0; i < matrizNM.length; i++) {
            for (int j = 0; j < matrizNM[i].length; j++) {
                System.out.print(" [" +matrizNM[i][j]+"] ");
                
            }
            System.out.println("");           
        }
        
        for (int i = 0; i < matrizNM.length; i++) {
            for (int j = 0; j < matrizNM[i].length; j++) {
                suma = matrizNM[i][j] + suma;
                
            }
           
        }
        System.out.println("La de los elementos es: "+suma);
              
    }

}
