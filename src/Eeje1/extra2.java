//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
//el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
//horas
package Eeje1;

import java.util.Scanner;

public class extra2 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese minutos");
        int min = leer.nextInt();
        int horas = (int) Math.floor(min/60);
        int dias = horas / 24;
        if ( horas >= 24){
            horas -= 24;
            dias += 0;
        }
         System.out.println( dias+" dias "+horas+" horas");       
    }
    
}
