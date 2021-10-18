//Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
//debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
//números pares y la cantidad de números impares. Al igual que en el ejercicio
//anterior los números negativos no deben sumarse. Nota: recordar el uso de la
//sentencia break.
package Eeje8;

import java.util.Scanner;

public class extra8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int pares = 0;
        int impares = 0;
//        int suma = 0;
//        int contador = 0;
        int divi = 0;
        System.out.println("Ingrese numeros");
//        int n = leer.nextInt();
        while(divi==0){
            num= leer.nextInt();
            if(num%5==0){ // si es multiplo de 5 detengo el programa 
                divi = 0; // div vale 0 para detener el programa
                System.out.println("El numero ingresado es multiplo de 5");
                break;               
            }else{
                if (num>0){ //solo sumo numeros positivos
                    if (num%2==0){ // divido y veo si el resto es igual a 0
                        pares += 1;
                        
                    }else{
                        impares += 1;
                    }
                }
            }
        }
        System.out.println("Se encontaron "+pares+" números pares");
        System.out.println("Se encontaron "+impares+" números impares");
    }
    
}
