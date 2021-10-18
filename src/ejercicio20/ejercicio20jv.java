//Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
//número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//5 *****
//3 ***
package ejercicio20;

import java.util.Scanner;


public class ejercicio20jv {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int conta = 0;
        System.out.print("Ingrese 4 números entre 1 y 20");
        do{
            int num = leer.nextInt();
            
            if(num>1 && num<20){
                System.out.print(num);
                for(int i = 0; i<num; i++){
                    System.out.print("*");                   
                }
            }else{
                System.out.println("El numero no esta entre 1 y 20");
            }
            System.out.println("");
            
            conta = conta + 1;
            
            
        }while(conta<4);
            
        
    }
    
}
