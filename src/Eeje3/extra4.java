//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
//vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
//clase String.
package Eeje3;

import java.util.Scanner;

public class extra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char a,e,i,o,u;
        a = 'a';
        e = 'e';
        i = 'i';
        o = 'o';
        u = 'u';
        System.out.println("Ingrese una letra");
        char let = leer.next().charAt(0);
        if(let==a || let==e || let==i || let==o || let==u){
            System.out.println("La letra "+let+" es una vocal.");
        } else {
            System.out.println("La letra "+let+" no es una vocal.");
        }
    }
    
}
