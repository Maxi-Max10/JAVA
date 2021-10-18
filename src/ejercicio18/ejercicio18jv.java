
package ejercicio18;
//Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
//del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
//por una E. Ejemplo:
//0-0-0
//0-0-1
//0-0-2
//0-0-E
//0-0-4
public class ejercicio18jv {

    
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++){
            for(int j = 0; j<=9; j++){
                for(int k = 0; k<= 9; k++){
                    System.out.print(i!=3 ? i: "E");
                    System.out.print(j!=3 ? i: "E");
                    System.out.println(k!=3 ? i: "E");
                }
            }
        }
    }
    
}
