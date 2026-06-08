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
         //sistema de restaurante
         try (Scanner leer = new Scanner(System.in)) {
             int opcion;
             int cantidad;
             double total = 0;
             
             do {
                 System.out.println("\n===== RESTAURANTE =====");
                 System.out.println("1. Hamburguesa ($5)");
                 System.out.println("2. Pizza ($8)");
                 System.out.println("3. Gaseosa ($2)");
                 System.out.println("4. Ver total");
                 System.out.println("5. Salir");
                 System.out.print("Seleccione una opcion: ");
                 opcion = leer.nextInt();
                 
                 switch (opcion) {
                     
                     case 1 -> {
                         System.out.print("Cantidad: ");
                         cantidad = leer.nextInt();
                         total += cantidad * 5;
                     }
                     
                     case 2 -> {
                         System.out.print("Cantidad: ");
                         cantidad = leer.nextInt();
                         total += cantidad * 8;
                     }
                     
                     case 3 -> {
                         System.out.print("Cantidad: ");
                         cantidad = leer.nextInt();
                         total += cantidad * 2;
                     }
                     
                     case 4 -> System.out.println("Total a pagar: $" + total);
                     
                     case 5 -> System.out.println("Gracias por su compra.");
                     
                     default -> System.out.println("Opción invalida.");
                 }
                 
             } while (opcion != 5);
         }
    }
}

    
    
    
