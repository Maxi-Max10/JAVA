/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8jv;

import java.util.Scanner;
//
//Crear un programa que dado un numero determine si es par o impar
// para dividir use el "%"
public class ejercicio8jv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1;
        System.out.println("Ingrese un número para determinar si es par o impar");
        num1 = leer.nextInt();
        
        if ((num1%2)==0){
            System.out.println("El numero "+num1+" es par");
        }else{
            System.out.println("El numero "+num1+" es impar");
            
        }
    }
    
}
