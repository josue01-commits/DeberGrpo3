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
         //sistema de matricula estudiantil
         try (Scanner leer = new Scanner(System.in)) {
             String nombre;
             String carrera;
             int materias;
             double costoMateria;
             double subtotal;
             double descuento;
             double total;
             
             System.out.println("===== SISTEMA DE MATRICULA ESTUDIANTIL =====");
             
             System.out.print("Ingrese el nombre del estudiante: ");
             nombre = leer.nextLine();
             
             System.out.print("Ingrese la carrera: ");
             carrera = leer.nextLine();
             
             System.out.print("Ingrese el numero de materias: ");
             materias = leer.nextInt();
             
             System.out.print("Ingrese el costo por materia: ");
             costoMateria = leer.nextDouble();
             
             subtotal = materias * costoMateria;
             
             if (materias >= 6) {
                 descuento = subtotal * 0.10;
             } else {
                 descuento = 0;
             }
             
             total = subtotal - descuento;
             
             System.out.println("\n===== RESUMEN DE MATRICULA =====");
             System.out.println("Estudiante: " + nombre);
             System.out.println("Carrera: " + carrera);
             System.out.println("Nimero de materias: " + materias);
             System.out.println("Costo por materia: $" + costoMateria);
             System.out.println("Subtotal: $" + subtotal);
             System.out.println("Descuento: $" + descuento);
             System.out.println("Total a pagar: $" + total);
             
             if (total > 500) {
                 System.out.println("Puede solicitar pago diferido.");
             } else {
                 System.out.println("Pago normal.");
             }}
    }
}

    
    
    
