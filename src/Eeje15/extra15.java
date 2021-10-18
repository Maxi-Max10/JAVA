//Diseñe una función que pida el nombre y la edad de N personas e imprima los
//datos de las personas ingresadas por teclado e indique si son mayores o menores
//de edad. Después de cada persona, el programa debe preguntarle al usuario si
//quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra
//“No”
package Eeje15;

import java.util.Scanner;

public class extra15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero de persona que ingresará");
        int persona = leer.nextInt();
        int cant = 1;
        String nombre[] = new String[persona];
        int edad[] = new int[persona];
        int may=0;
        int men=0;
        String sn;
        for(int i=0; i<persona; i++){
            System.out.println("Nombre persona "+(cant));
            nombre[i] = leer.next();
            System.out.println("Edad"); 
            edad[i] = leer.nextInt();
            cant++;
        }
        cant = 1;
        for(int i=0; i<persona; i++){
            System.out.println("DATOS PERSONA "+cant);
            System.out.println("Nombre: "+nombre[i]);
            System.out.println("Edad: "+edad[i]);
            cant++;
            if(edad[i]>18){
                System.out.println("Mayor de edad");
                may++;
            }else{
                System.out.println("Menor de edad");
                men++;
            }
            if(i<(persona-1)){
                System.out.println("¿Seguir mostrando personas?(Si/No)");
                sn = leer.next();
                if(sn.equals("Si")){
                    continue;
                }
                if(sn.equals("No")){
                    break;
                }   
                
            }
        }
       
    }
    
}
