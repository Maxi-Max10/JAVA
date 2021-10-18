//Una obra social tiene tres clases de socios:
//o   Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
//    descuento en todos los tipos de tratamientos.
//o   Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
//    descuento para los mismos tratamientos que los socios del tipo A.
//o   Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
//dichos tratamientos.
//Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
//que represente el costo del tratamiento (previo al descuento) y determine el importe
//en efectivo a pagar por dicho socio.
package Eeje5;

import java.util.Scanner;

public class extra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double descuento;
        System.out.println("Ingrese que tipo de obra social tiene(A,B,C)");
        char abc = leer.next().toUpperCase().charAt(0);
        System.out.println("Ingrese el monto a pagar");
        double montoT = leer.nextDouble();
        
        if (abc=='A') {
            System.out.println("Tiene un 50% de descuento");
            descuento = (0.5 * montoT);
            System.out.println("Se descontaron $"+descuento+" el total a pagar es $"+(montoT-descuento));
            
        }else{
            if (abc=='B') {
                System.out.println("Tiene un 35% de descuento");
                descuento = (0.35 * montoT);
                System.out.println("Se descontaron $"+descuento+" el total a pagar es $"+(montoT-descuento));
            }else{
                if(abc=='C'){
                   System.out.println("No tiene descuentos");
                   System.out.println("El total a pagar es $"+montoT);
                }else{                  
                }
            }   
        }
    }
}
