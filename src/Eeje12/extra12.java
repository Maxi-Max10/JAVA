// Crear un programa que dibuje una escalera de números, donde cada línea de
//números comience en uno y termine en el número de la línea. Solicitar la altura de
//la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
//1
//12
//123
package Eeje12;

import java.util.Scanner;

public class extra12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese altura de la escalera");
        int n = leer.nextInt();
        
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+ 1 + " ");
            }
            System.out.println(" ");          
        }
    }
    
}
