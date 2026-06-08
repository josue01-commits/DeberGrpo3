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
         //sistema de biblioteca
         try (Scanner leer = new Scanner(System.in)) {
             String nombreLibro;
             String autor;
             int diasRetraso;
             double multa = 0;
             
             System.out.println("****** SISTEMA DE BIBLIOTECA ********");
             
             System.out.print("Ingrese el nombre del libro: ");
             nombreLibro = leer.nextLine();
             
             System.out.print("Ingrese el nombre del autor: ");
             autor = leer.nextLine();
             
             System.out.print("Ingrese los dias de retraso en la devolucion: ");
             diasRetraso = leer.nextInt();
             
             if (diasRetraso > 0) {
                 multa = diasRetraso * 0.50;
             } 
             System.out.println("\n****** REPORTE ******");
             System.out.println("Libro: " + nombreLibro);
             System.out.println("Autor: " + autor);
             System.out.println("Dias de retraso: " + diasRetraso);
             System.out.println("Multa: $" + multa);
             
             if (multa > 0) {
                 System.out.println("El usuario debe pagar una multa.");
             } else {
                 System.out.println("El libro fue devuelto a tiempo.");
             }}
    }
}

    
    
    
