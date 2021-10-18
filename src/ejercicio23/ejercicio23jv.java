//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
//pida al usuario un numero a buscar en el vector. El programa mostrará donde se
//encuentra el numero y si se encuentra repetido
package ejercicio23;

import java.util.Scanner;

public class ejercicio23jv {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int c = 0;
        
        System.out.println("Ingrese tamaño de vector");
        int n = leer.nextInt();
        System.out.println("Ingrese numero a buscar");
        int nb = leer.nextInt();
        
        System.out.println("-----V E C T O R-----");
        for (int i = 0; i<=n; i++){
            int numero = (int)(Math. random()*10+1);
            System.out.print(" "+numero+" ");
            if (nb==numero){
                c++;
               
            }
        }System.out.println("");
        
        System.out.println("El numero "+nb+" se encuentra "+c+ " veces repetidas");
        
        
    }
    
}
