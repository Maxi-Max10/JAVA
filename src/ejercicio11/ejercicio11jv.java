//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
//frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
//pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
//“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.

package ejercicio11;

import java.util.Scanner;

/*
LA FUNCION EQUALS NOS COMPARA PALABRAS  
LA FUNCION SUBSTRING NOS PERMITE TOMAR UNA LETRA O UNA PARTE DE ESA PALABRA(subcadena)
*/
public class ejercicio11jv {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String a = "A";
        System.out.println("INGRESE PALABRA(la primer letra tiene que ser 'A' de lo contrario se lo tomara como error");
        String pal = leer.next();
        
        String ver = pal.substring(0,1);
        
      
        if(ver.equals(a)){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    
    }
    
}
