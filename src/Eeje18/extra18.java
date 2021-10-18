
package Eeje18;

import java.util.Scanner;

public class extra18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores");
        int n = leer.nextInt();
        int vec1[] = new int[n];
        int vec2[] = new int[n];
        System.out.println("Llene vector 1");
        for(int i=0; i<n; i++){
            vec1[i] = leer.nextInt();
            
        }
        System.out.println("Llene vector 2");
        for(int i=0; i<n; i++){
            vec2[i] = leer.nextInt();
            
        }
        
        for(int i=0; i<n; i++){
            if(vec1[i]!=vec2[i]){
                System.out.println("Se encontro un número diferente");
                break;
            }else{
                continue;
            }
        }
        
        
       
    }
    
}
