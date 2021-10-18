//Leer la altura de N personas y determinar el promedio de estaturas que se
//encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
package Eeje6;

import java.util.Scanner;

public class extra7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float promD,promG;
        int contador1 = 0;
        int contador2 = 0;
        System.out.println("Ingrese la cantidad de personas");
        int n = leer.nextInt();
        float altura[]= new float[n];
        System.out.println("Ingrese la altura de las personas");
        for(int i=0; i<n; i++){
            altura[i]=leer.nextFloat();
            
            if (altura[i]<1.60){
                contador1++;
                
            }else{
                contador2++;
            }
                
        }
        System.out.println(contador1+" personas se encuentran por debajo de 1.60mts");
        System.out.println(contador2+" personas se encuentran por arriba de 1.60mts");
        System.out.println("Promedio");
        promD = ((contador1*100)/n);
        promG = ((contador2*100)/n);
        System.out.println(promD+"% SE ENCUENTA POR DEBAJO DE 1,60 MTS ");
        System.out.println(promG+"% SE ENCUENTA POR ARRIBA DE 1,60 MTS ");
    }
    
}
