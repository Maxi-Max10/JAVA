//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere
//el límite inicial. 
package ejercicio14;

import java.util.Scanner;

public class ejercicio14jv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int lim;
        int numeros;
        System.out.println("Ingrese el numero limite");
        lim = leer.nextInt();
        System.out.println("Ingres numeros hasta llegar al limite");
        numeros = leer.nextInt();
        
        if (lim>numeros){
             while(lim != suma){
             numeros = leer.nextInt();
             suma = suma + numeros;
             }       
        }else{
            System.out.println("Numero mayor al limite");
            
        }
        
      
    }
    
}
