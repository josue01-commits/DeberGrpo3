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
     public static void main(String[] args) {
         
       try (Scanner leer = new Scanner(System.in)) {
            int cantidad;
            double nota, suma = 0, promedio;
            double mayor = 0;
            double menor = 100;

            System.out.print("Cuantos estudiantes desea registrar?: ");
            cantidad = leer.nextInt();

            for (int i = 1; i <= cantidad; i++) {

                System.out.print("Ingrese la nota del estudiante " + i + ": ");
                nota = leer.nextDouble();

                suma += nota;

                if (nota > mayor) {
                    mayor = nota;
                }

                if (nota < menor) {
                    menor = nota;
                }
            }

            promedio = suma / cantidad;

            System.out.println("\n===== RESULTADOS =====");
            System.out.println("Promedio general: " + promedio);
            System.out.println("Nota mas alta: " + mayor);
            System.out.println("Nota mas baja: " + menor);

            if (promedio >= 7) {
                System.out.println("El curso aprobo.");
            } else {
                System.out.println("El curso no aprobo.");
            }

            leer.close();
    }
        }
    }
    
    
