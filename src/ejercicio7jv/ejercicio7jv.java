/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7jv;

import java.util.Scanner;

/**
 *
 * @author COMPAC
 */
public class ejercicio7jv {

//    7. Implementar un programa que dado dos números enteros determine cuál es el
//mayor y lo muestre por pantalla
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese dos numeros para determinar cua el es mayor");
        System.out.println("Numero1");
        int num1 = leer.nextInt();
        System.out.println("Numero2");
        int num2 = leer.nextInt();
        
        if (num1>num2){
            System.out.print("El numero mayor es "+num1);
        }else{
            System.out.print("El numero mayor es "+num2);
        }
            
    }
    
}
