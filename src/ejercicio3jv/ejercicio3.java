package ejercicio3jv;

import java.util.Scanner;

public class ejercicio3 {
//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
//por pantalla.

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        
        System.out.println("Ingrese nombre");
        String nombre = leer.next();
        
        System.out.println("Bienvenido "+nombre);
      
    }
    
}
