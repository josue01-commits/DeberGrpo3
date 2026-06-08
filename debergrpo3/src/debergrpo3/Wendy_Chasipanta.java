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
         //factura 
         try (Scanner leer = new Scanner(System.in)) {
             String producto;
             int cantidad;
             double precio, subtotal, iva, total;
             System.out.println("===== FACTURA SIMPLE =====");
             System.out.print("Ingrese el nombre del producto: ");
             producto = leer.nextLine();
             System.out.print("Ingrese la cantidad: ");
             cantidad = leer.nextInt();
             System.out.print("Ingrese el precio unitario: ");
             precio = leer.nextDouble();
             subtotal = cantidad * precio;
             iva = subtotal * 0.15;
             total = subtotal + iva;
             System.out.println("\n===== DETALLE DE FACTURA =====");
             System.out.println("Producto: " + producto);
             System.out.println("Cantidad: " + cantidad);
             System.out.println("Precio Unitario: $" + precio);
             System.out.println("Subtotal: $" + subtotal);
             System.out.println("IVA (15%): $" + iva);
             System.out.println("Total a pagar: $" + total);
             if (total > 100) {
                 System.out.println("Cliente aplica para promoción.");
             } else {
                 System.out.println("Cliente no aplica para promoción.");
             }}
    }}
    
    
