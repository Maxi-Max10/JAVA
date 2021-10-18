//Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
//cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
//cada familia la cantidad de hijos para averiguar la media de edad de los hijos de
//todas las familias.
package Eeje13;

import java.util.Scanner;

public class extra13 {

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int familias, hijos;
        float edad = 0;
        int totalH = 0;
        float promE = 0;
        int cont = 1;
        System.out.println("Ingrese la cantidad de familias");
        familias = lee.nextInt();
        
        for (int i=0; i<familias; i++){
            
            System.out.println("Ingrese la cantidad de hijos FAMIL. "+cont);
            hijos = lee.nextInt();
            cont += 1;
            for(int j=0; j<hijos; j++){
                System.out.println("Ingrese Edad");
                edad += lee.nextFloat();
                totalH += 1;
            }
        }
        promE = Math.round(edad/totalH);
        System.out.println("La edad media de los hijos es: "+ (int) promE+" años.");
    }
    
}
