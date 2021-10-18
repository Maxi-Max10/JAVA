//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
//si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
package ejercicio19;

import java.util.Scanner;


public class ejercicio19jv {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("Ingrese tamaño de cuadrado: ");
        int n = leer.nextInt();
        
        for(int i = 0; i<n; i++){
            System.out.print(" * ");
        }
        System.out.println();
        
        for(int i=0; i<n-2; i++ ){
            System.out.print(" * ");
            for( int j = 0; j<n-2; j++){
                System.out.print("   ");
            }
            System.out.println(" * ");
        }
        
        for(int i = 0; i<n; i++){
            System.out.print(" * ");
        }
        System.out.println("");
      
    }
    
}
