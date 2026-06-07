

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class EJERCICIO_WENDY_CHASIPANTA {

    public static void main(String[] args) {

        try (Scanner leer = new Scanner(System.in)) {

            System.out.print("Ingrese un número: ");
            int numero = leer.nextInt();

            System.out.println("Tabla de multiplicar del " + numero);

            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

        } // cierra try

    } // cierra main

 } // cierra clase
