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
        //sistema de estudiante 
         try (Scanner leer = new Scanner(System.in)) {
             int opcion;
             String nombre;
             double nota1, nota2, promedio;
             do {
                 System.out.println("\n****** MENU DE ESTUDIANTES ******");
                 System.out.println("1. Registrar estudiante");
                 System.out.println("2. Calcular promedio");
                 System.out.println("3. Mostrar estado");
                 System.out.println("4. Salir");
                 System.out.print("Seleccione una opcion: ");
                 opcion = leer.nextInt();
                 leer.nextLine();
                 
                 switch (opcion) {
                     
                     case 1 -> {
                         System.out.print("Ingrese el nombre del estudiante: ");
                         nombre = leer.nextLine();
                         
                         System.out.println("Estudiante registrado: " + nombre);
                     }
                         
                     case 2 -> {
                         System.out.print("Ingrese la primera nota: ");
                         nota1 = leer.nextDouble();
                         
                         System.out.print("Ingrese la segunda nota: ");
                         nota2 = leer.nextDouble();
                         
                         promedio = (nota1 + nota2) / 2;
                         
                         System.out.println("Promedio: " + promedio);
                     }
                         
                     case 3 -> {
                         System.out.print("Ingrese el promedio del estudiante: ");
                         promedio = leer.nextDouble();
                         
                         if (promedio >= 7) {
                             System.out.println("APROBADO");
                         } else {
                             System.out.println("REPROBADO");
                         }
                     }
                         
                     case 4 -> System.out.println("Gracias por utilizar el sistema.");
                         
                     default -> System.out.println("Opción incorrecta.");
                 }
                 
             } while (opcion != 4);
         }
    }
}

    
    
    
