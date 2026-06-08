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
         try (Scanner sc = new Scanner(System.in)) {
             //registrando un vehiculo
             String propietario;
             String placa;
             String marca;
             String color;
             String fecha_de_matricula;
             int año;
             
             System.out.println(" REGISTRO DE VEHICULOS ");
             
             System.out.print("Ingrese el nombre del propietario: ");
             propietario = sc.nextLine();
             
             System.out.print("Ingrese la placa del vehiculo: ");
             placa = sc.nextLine();
             
             System.out.print("Ingrese la marca del vehiculo: ");
             marca = sc.nextLine();
             
             System.out.println("Ingrese el color del vehiculo: ");
             color = sc.nextLine();
             
             System.out.println("Igrese la fecha de matricula: ");
             fecha_de_matricula = sc.nextLine();
             
             System.out.print("Ingrese el año del vehiculo: ");
             año = sc.nextInt();
             
             System.out.println("\n DATOS DEL VEHICULO ");
             System.out.println("Propietario: " + propietario);
             System.out.println("Placa: " + placa);
             System.out.println("Marca: " + marca);
             System.out.println("Colr: "+ color);
             System.out.println("Fecha de matricula: "+ fecha_de_matricula );
             System.out.println("Año: " + año);
             
             if (año >= 2020) {
                 System.out.println("Vehiculo reciente.");
             } else {
                 System.out.println("Vehiculo antiguo.");
             }}
    }
}

    
    
    
