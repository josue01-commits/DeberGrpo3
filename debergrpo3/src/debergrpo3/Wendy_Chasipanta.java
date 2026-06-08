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
         //conversion de temperatura
         
         try (Scanner leer = new Scanner(System.in)) {
             double celsius;
             double fahrenheit;
             double kelvin;
             
             System.out.println("===== CONVERSOR DE TEMPERATURAS =====");
             
             System.out.print("Ingrese la temperatura en grados Celsius: ");
             celsius = leer.nextDouble();
             
             fahrenheit = (celsius * 9 / 5) + 32;
             kelvin = celsius + 273.15;
             
             System.out.println("\nRESULTADOS");
             System.out.println("Celsius: " + celsius + " °C");
             System.out.println("Fahrenheit: " + fahrenheit + " °F");
             System.out.println("Kelvin: " + kelvin + " K");
             
             if (celsius < 0) {
                 System.out.println("La temperatura está bajo cero.");
             } else if (celsius > 30) {
                 System.out.println("La temperatura es alta.");
             } else {
                 System.out.println("La temperatura es moderada.");
           }}
    }
}

    
    
    
