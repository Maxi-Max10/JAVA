//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
//donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
//programa que permita introducir un cuadrado por teclado y determine si este
//cuadrado es mágico o no. El programa deberá comprobar que los números
//introducidos son correctos, es decir, están entre el 1 y el 9.
package ejercicio27;

import java.util.Arrays;
import java.util.Scanner;

public class ejer {

    public static void main(String[] args) { 
        Scanner leer = new Scanner(System.in);
        int cuadrado[][]= new int[3][3];
        
        int cont = 0;
        int sumatoriaF;
        int sumatoriaC;
        int diaP=0;
        int diaS=0;
        int sumaF[]= new int[3];
        int sumaC[]= new int[3];
        int sumD[]= new int[2];          
        System.out.println("Ingrese numeros del 1 al 9");
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                int num = leer.nextInt();
                if(num>9 || num<1){
                    System.out.println("¡SOLO NUMEROS DEL 1 AL 9! vuelva a ingresar");
                    num = leer.nextInt();
                }else{
                    cuadrado[i][j]=num;
                    
                }
            }
        }
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(" "+cuadrado[i][j]+" ");     
            }
            System.out.println("");
        }
        
        for(int i=0; i<3; i++){
            sumatoriaF=0;
            sumatoriaC=0;
            for (int j=0; j<3; j++){
                sumatoriaF += cuadrado[i][j]; 
                sumatoriaC += cuadrado[j][i];
                if (i + j==2){
                    diaS += cuadrado[i][j];
                }
            }
            diaP += cuadrado[i][i];
            sumaF[i] = sumatoriaF;
            sumaC[i] = sumatoriaC;           
        }
        sumD[0] = diaS;
        sumD[1] += diaP;
        cont=0;
         for (int i=0; i<3; i++){
             if (sumaF[i] == sumaC[i] && sumaF[i]==sumD[0] && sumD[0]==sumD[1]){
                 cont += 1;
             }
         }
         if (cont ==3){
             System.out.println("Es un cuadrado mágico");
         }else{
             System.out.println("No es un cuadrado mágico");
         }
//         System.out.println(Arrays.toString(sumD));
//         System.out.println(Arrays.toString(sumaF));
//         System.out.println(Arrays.toString(sumaC));
//    
    }
    
}
