//Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
//salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
//deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
//número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
package ejercicio16;

import java.util.Scanner;

public class ejercicio16jv {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int suma = 0;
        System.out.println("Ingrese 20 numeros");
        int cont = 0;
        
        
        while((cont!=5)){
            
            cont++;
            int num = leer.nextInt();
            if (num<0){
                continue;
            }else{
                suma = suma + num;
            }
            if (0==num){
                System.out.println("Se capturo el numero 0");
                break;
            }
                    
        }
        
        System.out.println("La suma es "+suma);
    }
    
}
