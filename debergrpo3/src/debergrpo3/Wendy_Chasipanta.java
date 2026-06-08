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
         System.out.println("SOLICITAR 10 NUMEROS Y VER CCUAL ES EL MAYOR Y EL MENOR");
         try (Scanner leer = new Scanner(System.in)) {
             int numero;
             int mayor = 0;
             int menor = 0;
             
             for (int i = 1; i <= 10; i++) {
                 
                 System.out.print("Ingrese el numero " + i + ": ");
                 numero = leer.nextInt();
                 
                 if (i == 1) {
                     mayor = numero;
                     menor = numero;
                 }
                 
                 if (numero > mayor) {
                     mayor = numero;
                 }
                 
                 if (numero < menor) {
                     menor = numero;
                 }
             }
             
             System.out.println("\n El numero mayor es: " + mayor);
             System.out.println("\n El numero menor es: " + menor);
         }
    }
}

    
    
    
