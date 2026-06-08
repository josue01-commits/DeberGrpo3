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
         // numero par o impar
         try (Scanner leer = new Scanner(System.in)) {
             int numero;
             
             System.out.print("Ingrese un numero: ");
             numero = leer.nextInt();
             
             if (numero % 2 == 0) {
                 System.out.println("El numero es par.");
             } else {
                 System.out.println("El nmero es impar.");
             }}
    }
}

    
    
    
