
package debergrpo3;
import java.util.Scanner;

    public class EJERCICIOS_CHUQUITARCO_NICOLAY {
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
        ejercicio9();
}

public static void ejercicio9(){
    //FACTORIAL
    System.out.println("===============");
    System.out.println("FACTORIAL"); 
    System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
 }

public static void ejercicio10(){
    //DETRERMINAR CUALES SON POSITIVOS, NEGATIVOS Y CEROS
    System.out.println("===============");
    System.out.println("Que numero es ?"); 
        
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        //cliclo for para ingresar los 15
        for (int i = 1; i <= 15; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = sc.nextInt();
        }


}