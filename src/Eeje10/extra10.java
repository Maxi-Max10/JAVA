//Realice un programa para que el usuario adivine el resultado de una multiplicación
//entre dos números generados aleatoriamente entre 0 y 10. El programa debe
//indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
//incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
//realizar este ejercicio investigue como utilizar la función Math.random() de Java
package Eeje10;

import java.util.Scanner;

public class extra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int numero1 = (int) (Math.random() * 10);
        int numero2 = (int) (Math.random() * 10);
        int mult = numero1*numero2;
        System.out.println(mult);
        System.out.println("M-U-L-T-I-P-L-I-C-A-C-I-O-N");
        System.out.println("Adivine cual es el resultado");
        int res;
        int resp=0;
       
        do{
            res = leer.nextInt();
            resp = res;
            
            if(res==mult){
                System.out.println("Correcto");
                System.out.println(numero1+" * "+numero2+" = "+mult);
                break;
            }
            else{
                System.out.println("Incorrecto, vuelva a ingresar");
            }
        }while(resp!=mult);
        
    }
    
}
