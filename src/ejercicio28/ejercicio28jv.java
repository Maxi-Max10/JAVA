
package ejercicio28;

public class ejercicio28jv {

    public static void main(String[] args) {
        int contador =0;
        int matrizG[][] = new int [10][10];
        
  
        int [] vecG = { 1 , 26 , 36 , 47 , 5 , 6 , 72 , 81 , 95 , 10 , 11 , 12 , 13 , 21 , 41 , 22 , 67 , 20 , 10 , 61 , 56 , 78 , 87 ,
                90 , 9 , 90 , 17 , 12 , 87 , 67 , 41 , 87 , 24 , 56 , 97 , 74 , 87 , 42 , 64 , 35 , 32 , 76 , 79 , 1 , 36 , 5 , 67 , 96 , 12 , 11 ,
                99 , 13 , 54 , 88 , 89 , 90 , 75 , 12 , 41 , 76 , 67 , 78 , 87 , 45 , 14 , 22 , 26 , 42 , 56 , 78 , 98 , 45 , 34 , 23 , 32 , 56 ,
                74 , 16 , 19 , 18 , 24 , 67 , 97 , 46 , 87 , 13 , 67 , 89 , 93 , 24 , 21 , 68 , 78 , 98 , 90 , 67 , 12 , 41 , 65 , 12 };
        
        // LLENO MATRIZ GRANDE Y MUESTRO
        for (int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                matrizG[i][j]=vecG[contador];
                contador += 1;
            }
        }
        for (int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print(" "+matrizG[i][j]+" ");
                
            }
            System.out.println("");
        }
        // LLENO MATRIZ PEQUEÑA Y MUESTRO
        int[]vecC = {36,5,67,89,90,75,14,22,26};
        int[][] matrizC = new int [3][3];
        contador =0;
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                matrizC[i][j]=vecC[contador];
                contador += 1;
            }
        }
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(" "+matrizC[i][j]+" ");                
            }
            System.out.println("");
        }
        
        
        
    
    
    }
    
}
