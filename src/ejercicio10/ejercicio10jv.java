//Realizar un programa que solo permita introducir solo frases o palabras de 8 de
//largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
//un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
//imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
package ejercicio10;

import java.util.Scanner;

 // la Funcion Lenght() nos permite saber la longitud de una palabra

public class ejercicio10jv {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        System.out.println("Ingrese palabra o frase de 8 caractereres");
        String pal = leer.next();
        
        int longi = pal.length();
        
        if(longi == 8){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
     
    
    }
    
}
