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
         //cambio de biblioteca
         try (Scanner leer = new Scanner(System.in)) {
             int opcion;
             String libro;
             double multa = 0;
             
             do {
                 System.out.println("\n===== SISTEMA DE BIBLIOTECA =====");
                 System.out.println("1. Registrar prestamo");
                 System.out.println("2. Registrar devolucion");
                 System.out.println("3. Consultar multa");
                 System.out.println("4. Salir");
                 System.out.print("Seleccione una opcion: ");
                 opcion = leer.nextInt();
                 leer.nextLine();
                 
                 switch (opcion) {
                     
                     case 1 -> {
                         System.out.print("Ingrese el nombre del libro: ");
                         libro = leer.nextLine();
                         System.out.println("Libro prestado: " + libro);
                     }
                     
                     case 2 -> {
                         System.out.print("Ingrese el nombre del libro devuelto: ");
                         libro = leer.nextLine();
                         
                         System.out.print("Ingrese los dias de retraso: ");
                         int dias = leer.nextInt();
                         
                         multa = dias * 0.50;
                         
                         System.out.println("Libro devuelto: " + libro);
                         System.out.println("Multa generada: $" + multa);
                     }
                     
                     case 3 -> System.out.println("ultima multa registrada: $" + multa);
                     
                     case 4 -> System.out.println("SALIENDO DEL SISTEMA......");
                     
                     default -> System.out.println("Opcion incorrecta.");
                 }
             } while (opcion != 4);
         }
    }
}

    
    
    
