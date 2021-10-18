//Crea una aplicación que a través de una función nos convierta una cantidad de
//euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
//libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
//converir que será una cadena, este no devolverá ningún valor y mostrará un
//mensaje indicando el cambio (void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €
package ejercicio21;

import java.util.Scanner;

public class ejercicio21jv {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese la cantidad de euros a convertir");
        float euro = leer.nextFloat();
      
        
        System.out.println("El cambio de moneda es:");
        float cambioE = (float) (euro*0.86);
        System.out.println(cambioE+" libras es "+euro+" €");
        float cambioD = (float) (euro*1.18);
        System.out.println(cambioE+" dolares es "+euro+" €");
        float cambioY = (float) (euro*129.852);
        System.out.println(cambioE+" yenes es "+euro+" €");
        
    }
    
}
