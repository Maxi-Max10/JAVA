//Realizar un programa que pida dos números enteros positivos por teclado y
//muestre por pantalla el siguiente menú:
//MENU
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//Elija opción:
package ejercicio15;

import java.util.Scanner;


public class ejercicio15jv {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int op;
        char si;
           System.out.println("Ingrese N°1");
        int num1 = leer.nextInt();
        System.out.println("Ingrese N°2");
        int num2 = leer.nextInt();
        System.out.println("------- M E N U ---------");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SALIR");
   
        do{       
            System.out.println("ELIJA OPCION:");
            op = leer.nextInt();     
            switch (op){
                case 1:
                    int resul = num1 + num2;
                    System.out.println("L suma es "+resul);
                    break;
                case 2:
                    int resu = num1 - num2;
                    System.out.println("La resta es "+resu);
                    break;
                case 3:
                    int res = num1 * num2;
                    System.out.println("La multiplicacion es "+res);
                    break;
                case 4:
                    double re = num1 / num2;
                    System.out.println("La division es"+re);                
                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir del programa(S/N)?");
                    si = leer.next().charAt(0);
                    if (si =='S'){
                        System.out.println("Programa finalizado");
                        break;
                    }else{
                        continue;
                        
                    }            
            }          
        }while(op!=5);
        
    }
            
}
