/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eeje17;

import java.util.Scanner;

public class extra17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos números desea sumar");
        int n = leer.nextInt();
        int suma = 0;
        int numeros [] = new int [n];
        System.out.println("Ingrese números enteros");
        for(int i=0; i<n; i++){
            numeros[i] = leer.nextInt();           
        }
        for(int i=0; i<n; i++){
            suma = suma + numeros[i];
        }
        System.out.println("La suma es: "+suma);
        
    }
    
}
