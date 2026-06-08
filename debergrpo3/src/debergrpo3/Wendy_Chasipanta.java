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
         //algoritmo de un cajero basico 
         try (Scanner leer = new Scanner(System.in)) {
             double saldo = 1000;
             int opcion;
             double monto;
             
             System.out.println("===== CAJERO AUTOMATICO =====");
             System.out.println("1. Consultar saldo");
             System.out.println("2. Depositar dinero");
             System.out.println("3. Retirar dinero");
             System.out.print("Seleccione una opcion: ");
             opcion = leer.nextInt();
             
             switch (opcion) {
                 
                 case 1 -> System.out.println("Su saldo actual es: $" + saldo);
                     
                 case 2 -> {
                     System.out.print("Ingrese el monto que quiere depositar: ");
                     monto = leer.nextDouble();
                     saldo += monto;
                     System.out.println("Nuevo saldo: $" + saldo);
                 }
                     
                 case 3 -> {
                     System.out.print("Ingrese el monto a retirar: ");
                     monto = leer.nextDouble();
                     
                     if (monto <= saldo) {
                         saldo -= monto;
                         System.out.println("Retiro realizado.");
                         System.out.println("Saldo restante: $" + saldo);
                     } else {
                         System.out.println("Fondos insuficientes.");
                     }
                 }
                     
                 default -> System.out.println("Opcion no valida.");
             }}
    }}
    
    
