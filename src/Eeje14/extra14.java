//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
//sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
//operación matemática y deben devolver sus resultados para imprimirlos en el main.
package Eeje14;

import java.util.Scanner;

public class extra14 {
    public static double suma(double a, double b){
        return a + b;
    }
    public static double resta(double a, double b){
        return a - b;
    }
    public static double multiplicacion(double a, double b){
        return a * b;
    }
    public static double div(double a, double b){
        if (b==0){
            return 0;
        }else{
            return a / b;
        }
        
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese segundo número");
        int num2 = leer.nextInt();
        
        System.out.println("ELIJA OPERACION A REALIZAR");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        int op = leer.nextInt();
        
        switch(op){
            case 1:
                System.out.println("El resultado de la suma es: "+(int) suma(num1,num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: "+(int) resta(num1,num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: "+(int) multiplicacion(num1,num2));
                break;
            case 4:
                System.out.println("El resultado de la division es: "+div(num1,num2));
                break;
            default:
                if(op>4 || op<1){
                    System.out.println("Operacion Invalida");
                }
        }
       
      
    }
    
}
