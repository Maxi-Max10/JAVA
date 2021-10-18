//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
//investigar la función equals() en Java.

package ejercicio9jv;

import java.util.Scanner;

//// la Funcion EQUALS() COMPARA SI MIS DOS VARIABLES SON IGUALES
public class ejercicio9jv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        String se = "eureka";
        System.out.println("Ingrese frase");
        String fra = leer.next();
       
        
        if(se.equals(fra)){            
            System.out.println("Correcto");          
        }else{
            System.out.println("Incorrecto");
        }
     
    }
    
}
