//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
//cuántos de 2 dígitos.(hasta 5 dijitos)
package ejercicio24;

import java.util.Scanner;

public class ejercicio24jv {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño de vector");
        int n = leer.nextInt();
        
        System.out.println("Ingres numeros enteros");
        
        for(int i=0; i<=n; i++){
            int num = leer.nextInt();
            String x = Integer.toString(num); 
            if (x.length()<=5){
                System.out.println("El numero "+num+" tiene "+x.length()+" digitos");
            }else{
                System.out.println("El numero "+num+" tiene mas de 5 digitos, fin programa");
                break;
            }
        }
        
            
        
    }
    
}
