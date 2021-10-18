//Escribir un programa que lea un número entero y devuelva el número de dígitos
//que componen ese número. Por ejemplo, si introducimos el número 12345, el
//programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
//utilizando el operador de división. Nota: recordar que las variables de tipo entero
//truncan los números o resultados
package Eeje11;

import java.util.Scanner;

public class extra11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cifr = 0;
        System.out.println("Ingrese numero entero");
        int n = leer.nextInt();
        int res;
        while(n!=0){
            n =(n/10);
            cifr++;
            
        }
        System.out.println("Tiene "+cifr+" dígitos");
    }
    
}
