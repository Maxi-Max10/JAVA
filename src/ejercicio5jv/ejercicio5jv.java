
package ejercicio5jv;

//5. Dada una cantidad de grados centígrados se debe mostrar su equivalente en

import java.util.Scanner;

//grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
// DENOMINE A LAS VARIABLE NUM Y TEMP COMO REAL, PARA QUE EL RESULTADO ME DIERA
// COMPLETO Y  NO REDONDEE.

public class ejercicio5jv {
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
    
         double temp=0;
         
         System.out.println("Ingrese grados Centigrados");
         double num = leer.nextInt();
         
         temp= (32+(9*num/5));
         
         System.out.println("La T° en Fahrenheit es "+temp);
          
     }
    
}
     
