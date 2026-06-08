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
             String cliente;
             int opcion;
             int cantidad;
             double total = 0;
             double descuento = 0;
             
             System.out.println("****** RESTAURANTE ******");
             
             System.out.print("Ingrese el nombre del cliente: ");
             cliente = leer.nextLine();
             
             do {
                 System.out.println("\n****** MENU ******");
                 System.out.println("1. Hamburguesa ($5)");
                 System.out.println("2. Pizza ($8)");
                 System.out.println("3. Gaseosa ($2)");
                 System.out.println("4. Ver factura");
                 System.out.println("5. Salir");
                 System.out.print("Seleccione una opción: ");
                 opcion = leer.nextInt();
                 
                 switch (opcion) {
                     
                     case 1 -> {
                         System.out.print("Cantidad de hamburguesas: ");
                         cantidad = leer.nextInt();
                         total += cantidad * 5;
                     }
                         
                     case 2 -> {
                         System.out.print("Cantidad de pizzas: ");
                         cantidad = leer.nextInt();
                         total += cantidad * 8;
                     }
                         
                     case 3 -> {
                         System.out.print("Cantidad de gaseosas: ");
                         cantidad = leer.nextInt();
                         total += cantidad * 2;
                     }
                         
                     case 4 -> {
                         if (total > 20) {
                             descuento = total * 0.10;
                         } else {
                             descuento = 0;
                         }
                         
                         System.out.println("\n===== FACTURA =====");
                         System.out.println("Cliente: " + cliente);
                         System.out.println("Subtotal: $" + total);
                         System.out.println("Descuento: $" + descuento);
                         System.out.println("Total a pagar: $" + (total - descuento));
                     }
                         
                     case 5 -> System.out.println("Gracias por su compra.");
                         
                     default -> System.out.println("Opción no válida.");
                 }
                 
             } while (opcion != 5);
         }
    }
}

    
    
    
