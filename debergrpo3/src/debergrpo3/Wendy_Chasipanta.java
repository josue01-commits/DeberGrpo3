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
         //numero primo
         try (Scanner leer = new Scanner(System.in)) {
             int numero;
             boolean primo = true;
             
             System.out.print("Ingrese un numero: ");
             numero = leer.nextInt();
             
             if (numero <= 1) {
                 primo = false;
             } else {
                 for (int i = 2; i < numero; i++) {
                     if (numero % i == 0) {
                         primo = false;
                         break;
                     }
                 }
             }
             
             if (primo) {
                 System.out.println("El numero es primo.");
             } else {
                 System.out.println("El numero no es primo.");
             }}
    }
}

    
    
    
