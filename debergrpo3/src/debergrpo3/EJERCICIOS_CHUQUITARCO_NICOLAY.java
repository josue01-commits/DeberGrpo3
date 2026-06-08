package debergrpo3;
import java.util.Scanner;
    public class EJERCICIOS_CHUQUITARCO_NICOLAY {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        //CREANDO MENU
        do {
            System.out.println("\n==============================");
            System.out.println("      MENU DE EJERCICIOS");
            System.out.println("==============================");
            System.out.println("1. Ejercicio 9");
            System.out.println("2. Ejercicio 10");
            System.out.println("3. Ejercicio 11");
            System.out.println("4. Ejercicio 12");
            System.out.println("5. SALIR");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    ejercicio9();
                    break;
                case 2:
                    ejercicio10();
                    break;
                case 3:
                    ejercicio11();
                    break;
                case 4:
                    ejercicio12();
                    break;
                case 5:
                    System.out.println("GRACIAS POR USAR EL PROGRAMA");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 5);
        
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
    System.out.println("CONTADOR DE POSITIVOS, NEGATIVOS Y CEROS");
    int numero;
    int positivos = 0;
    int negativos = 0;
    int ceros = 0;
    for (int i = 1; i <= 15; i++) {
        while (!sc.hasNextInt()) {
            System.out.println("Error: Debe ingresar un numero entero.");
            sc.next(); // limpia la entrada incorrecta
            System.out.print("Ingrese el numero " + i + ": ");
        }
        System.out.print("Ingrese el numero " + i + ": ");
        numero = sc.nextInt();
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

public static void ejercicio11() {
    // PROMEDIO DE 20 ESTUDIANTES
    System.out.println("===============");
    System.out.println("PROMEDIO DE 20 ESTUDIANTES");
    double suma = 0;
    double promedio;
    double nota;
    for (int i = 1; i <= 20; i++) {
        while (true) {
            System.out.print("Ingrese la nota del estudiante " + i + " (0-10): ");
            if (!sc.hasNextDouble()) {
                System.out.println("Error: Debe ingresar un número.");
                sc.next();
                continue;
            }
            nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: La nota debe estar entre 0 y 10.");
            } else {
                break;
            }
        }
        suma += nota;
    }
    promedio = suma / 20;
    System.out.println("\nPromedio general del curso: " + promedio);
}

public static void ejercicio12() {
    //FIBONACCI
    System.out.println("===============");
    System.out.println("SECUENCIA DE FIBONACCI");
    int n;
    while (true) {
        System.out.print("Ingrese la cantidad de terminos: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            if (n > 0) {             
                break;
            } else {
                System.out.println("Error: Debe ingresar un numero mayor que 0.");
            }
        } else {
            System.out.println("Error: Debe ingresar un numero entero.");
            sc.next(); // limpia la entrada incorrecta
        }
    }
    int a = 0;
    int b = 1;
    System.out.println("Secuencia de Fibonacci:");
    for (int i = 1; i <= n; i++) {
        System.out.print(a + " ");

        int siguiente = a + b;
        a = b;
        b = siguiente;
    }
    System.out.println();
}
}

