
package ejercicio26;

import static java.lang.Math.pow;
import java.util.Scanner;

public class ejercicio26jv {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño matriz");
        int n = leer.nextInt();
        int matriz[][] = new int[n][n];
        int matrizT[][] = new int[n][n];
        System.out.println("Ingrese numeros para llenar matriz");
        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                matriz[i][j] = leer.nextInt();
            }
        }
        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                matrizT[i][j]=matriz[j][i];
            }
        }
        int au = 0;
        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                if (matriz[i][j]== -matrizT[i][j]){
                    au += 1;
                }
            }
        }
        System.out.println("M-A-T-R-I-Z");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(" | "+matriz[i][j]+" | ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("M-A-T-R-I-Z---T-R-A-N-S-P");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(" | "+matrizT[i][j]+" | ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        if(au == pow(n,2)){
            System.out.println("Es una matriz antisimetrica");
        }else{
            System.out.println("No es una matiz antisimetrica");
        }
        leer.close();
    }
    
}
