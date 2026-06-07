
package debergrpo3;
import java.util.Scanner;

    public class EJERCICIOS_CHUQUITARCO_NICOLAY {
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
        //ejercicio9();
        //ejercicio10();
        ejercicio11();
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
 

public static void ejercicio10(){
    //DETRERMINAR CUALES SON POSITIVOS, NEGATIVOS Y CEROS
    
    System.out.println("===============");
    System.out.println("Ingresa los numeros porfavor"); 
        
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Numero " + i + ": ");
            int numero = sc.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

}
public static void ejercicio11(){
        //PROMEDIO DE 20 ESTUDIANTES
    
        System.out.println("===============");
        System.out.println("PROMEDIOS");
        
        double suma = 0;
        double promedio;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese la calificación del estudiante " + i + ": ");
            double nota = sc.nextDouble();

            suma += nota;
        }

        promedio = suma / 20;

        System.out.println("\nPromedio general del curso: " + promedio);
    }
}
