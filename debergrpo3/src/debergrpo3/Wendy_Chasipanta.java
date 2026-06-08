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
             int suma = 0;
             
             for (int i = 1; i <= 5; i++) {
                 System.out.print("Ingrese un numero " + i + ": ");
                 int numero = leer.nextInt();
                 suma += numero;
             }
             
             System.out.println("La suma total es: " + suma);
         }
    
    }
}
