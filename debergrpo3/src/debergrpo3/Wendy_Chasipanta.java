/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debergrpo3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Wendy_Chasipanta {
    static Scanner sc = new Scanner(System.in);
    
        public static void main(String[] args) {
            // MENU DE OPCIONES
        int opcion;
        do{
            System.out.println("""
                            MENU DE OPCIONES
                            1. Ejercicio13
                            2. ejercicio14
                            3. ejercicio15
                            4. Salir  
                            """);
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> ejercicio13();
                case 2 -> ejercicio14();
                case 3 -> ejercicio15();
                case 4 -> System.out.println("SALIENDO DEL SISTEMA...");
                default -> System.out.println("Opcion invalida.");
            }
        } while (opcion != 4);
        
            
        }
        
    // EJERCICIO 13
    // Solicitar 10 numeros y mostrar el mayor y el menor
    public static void ejercicio13() {

        int num;
        int mayor = 0;
        int menor = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Ingrese el numero " + i + ": ");
            num = sc.nextInt();

            if (i == 1) {
                mayor = num;
                menor = num;
            }

            if (num > mayor) {
                mayor = num;
            }

            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
    
    // EJERCICIO 14
    // Sumar números pares entre 1 y 200
    public static void ejercicio14() {

        int suma = 0;

        for (int i = 1; i <= 200; i++) {

            if (i % 2 == 0) {
                suma += i;
            }
        }
        
        
        System.out.println("La suma de los numeros pares es: " + suma);
    }
    
    
    
    // EJERCICIO 15
    // Verificar si un número es primo
    public static void ejercicio15() {
        System.out.println("Alexis, Liliana, Chen");

        int numero;
        boolean primo = true;

        System.out.print("Ingrese un numero entero: ");
        numero = sc.nextInt();

        if (numero <= 1) {

            primo = false;

        } else {

            for (int i = 2; i < numero; i++) {

                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println("El numero si es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }
}
    


    
    
    
