//Crea una aplicación que nos pida un número por teclado y con una función se lo
//pasamos por parámetro para que nos indique si es o no un número primo, debe
//devolver true si es primo, sino false.
//Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
//no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo
package Eeje16;

import java.util.Scanner;

public class extra16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean vf;
        System.out.println("Ingrese números primos");
        System.out.println("En caso de ser primo se devolvera TRUE, de lo contrario un FALSE ");
        int  num = leer.nextInt();
        if((num%2==0)&&(num%num==0)){
            System.out.println(vf=false);
        }else{
            System.out.println(vf=true);
        }
    }
    
}
