
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
