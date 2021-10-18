//Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
//promedio de n números (n>0). El valor de n se solicitará al principio del programa y
//los números serán introducidos por el usuario. Realice dos versiones del programa,
//una usando el bucle “while” y otra con el bucle “do - while”
package Eeje7;

import java.util.Scanner;

public class extra7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n, num;    
        int contador = 0;
        int maximo = 0;
        int minimo = 0;
        int suma =  0;
        int pos = 0;
        System.out.println("ingrese la cantidad de numeros que va a introducir");
        n = leer.nextInt();
        System.out.println("Ingrese numeros enteros");
        /*
       
        while(contador<n){
           num = leer.nextInt();
           if(maximo==0 && minimo==0){
               maximo = num;
               minimo = num;              
           }
           if(num>maximo){
               maximo=num;
           }
           if(num<minimo){
               minimo=num;
           }
           if(num>0){
               suma += num;
               pos += 1;
           }
           contador++;
        }
        System.out.println("El numero maximo es: "+maximo);
        System.out.println("El numero minimo es: "+minimo);
        System.out.println("El numero promedio es: "+suma/pos);
        */
        
        do{
             num = leer.nextInt();
           if(maximo==0 && minimo==0){
               maximo = num;
               minimo = num;              
           }
           if(num>maximo){
               maximo=num;
           }
           if(num<minimo){
               minimo=num;
           }
           if(num>0){
               suma += num;
               pos += 1;
           }
           contador++;     
            
        }while(contador<n);
        System.out.println("El numero maximo es: "+maximo);
        System.out.println("El numero minimo es: "+minimo);
        System.out.println("El numero promedio es: "+suma/pos);
        
    }
    
}
