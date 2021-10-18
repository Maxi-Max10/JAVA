//. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
//la nota se pedirá de nuevo hasta que la nota sea correcta. 
package ejercicio13;

import java.util.Scanner;


public class ejercicio13jv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese nota entre 1 y 10");
        num = leer.nextInt();
        if (num>0 && num<10){
            System.out.println("Nota correcta");
        }else{
            do{
                System.out.println("Nota fuera de rango, vuelva a Ingresar");
                num =  leer.nextInt();
            }while(num>0 && num<10);
            
           
        }
       
        
    }
    
}
