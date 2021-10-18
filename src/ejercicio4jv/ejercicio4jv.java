
package ejercicio4jv;

import java.util.Scanner;


public class ejercicio4jv {
//4. Escribir un programa que pida una frase y la muestre toda en mayúsculas y
//después toda en minúsculas. Nota: investigar la función toUpperCase() y
//toLowerCase() en Java.
//   
    
//    use un USEDELIMITED("\n")
    
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        
        System.out.println("Frase en minusculas es "+frase.toUpperCase());
        System.out.println("Frase en MAYUSCULA es "+frase.toLowerCase());
     
        
      
    }
    
}
