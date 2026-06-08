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
         //anombre del dueño
         try (Scanner leer = new Scanner(System.in)) {
             String nombreMascota;
             String especie;
             String nombreDueno;
             int edad;
             
             System.out.println(" REGISTRO DE MASCOTAS ");
             
             System.out.print("Ingrese el nombre de la mascota: ");
             nombreMascota = leer.nextLine();
             
             System.out.print("Ingrese la especie: ");
             especie = leer.nextLine();
             
             System.out.print("Ingrese el nombre del dueño: ");
             nombreDueno = leer.nextLine();
             
             System.out.print("Ingrese la edad de la mascota: ");
             edad = leer.nextInt();
             
             System.out.println("\n===== DATOS DE LA MASCOTA =====");
             System.out.println("Nombre de la mascota: " + nombreMascota);
             System.out.println("Especie: " + especie);
             System.out.println("Dueño: " + nombreDueno);
             System.out.println("Edad: " + edad + " años");
         }
    }
}

    
    
    
