//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
//muestre traspuesta. ¿Que es una matriz traspuesta?
package ejercicio25;

public class ejercicio25 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        System.out.println("--- M A T R I Z  O R I G I N A L ---");
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random()*9+1);
                System.out.print(" | "+matriz[i][j]+" | ");
            }System.out.println("");
        }
        // TRANSPONER MATRIZ
        int aux;
        for(int i = 0; i<matriz.length;i++){
            for(int j=0; j<i; j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i]= aux;
            }
        }
        System.out.println("--- M A T R I Z  T R A N S P U E S T A ---");
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                System.out.print(" | "+matriz[i][j]+" | ");
            }
            System.out.println("");
        }
    }
    
}
