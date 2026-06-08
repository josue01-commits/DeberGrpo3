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
         // contar vocales de la palabra
         try (Scanner leer = new Scanner(System.in)) {
             String palabra;
             int contador = 0;
             
             System.out.print("Ingrese una palabra: ");
             palabra = leer.nextLine().toLowerCase();
             
             for (int i = 0; i < palabra.length(); i++) {
                 
                 char letra = palabra.charAt(i);
                 
                 if (letra == 'a' || letra == 'e' || letra == 'i'
                         || letra == 'o' || letra == 'u') {
                     contador++;
                 }
             }
             
             System.out.println("Cantidad de vocales: " + contador);
         }
    }
}

    
    
    
