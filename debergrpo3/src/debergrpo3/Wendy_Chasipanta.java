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
        //control unitario
         try (Scanner leer = new Scanner(System.in)) {
             int cantidad;
             double precio;
             double valorTotal = 0;
             
             System.out.print("Cuantos productos desea registrar?: ");
             int n = leer.nextInt();
             leer.nextLine();
             
             for (int i = 1; i <= n; i++) {
                 
                 System.out.println("\nProducto #" + i);
                 
                 System.out.print("Nombre: ");
                 leer.nextLine();
                 
                 System.out.print("Cantidad: ");
                 cantidad = leer.nextInt();
                 
                 System.out.print("Precio unitario: ");
                 precio = leer.nextDouble();
                 leer.nextLine();
                 
                 valorTotal += cantidad * precio;
             }
             System.out.println("\nValor total del inventario: $" + valorTotal);
         }
    }
}

    
    
    
