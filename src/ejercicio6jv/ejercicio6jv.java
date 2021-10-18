
package ejercicio6jv;
import java.util.Scanner;
public class ejercicio6jv {

//   6. Escribir un programa que lea un número entero por teclado y muestre por pantalla
//el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
//Math.sqrt()
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        System.out.print("Ingrese un numero entero por teclado: ");
        int num = leer.nextInt();
        double raiz = Math.sqrt(num);
        int doble;
        int triple;
        
        
        
        System.out.print("El la raiz cuadrada del numero es: "+raiz);
        doble = num * 2;
        System.out.print("El doble del numero es: "+doble);
        triple = num * 3;
        System.out.print("El triple del numero es: "+triple);
       
    }
    
}
