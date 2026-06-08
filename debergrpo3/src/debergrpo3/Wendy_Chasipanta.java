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
         //suma de numeros pares etre el 1 y 200
         try (Scanner leer = new Scanner(System.in)) {
             System.out.println("SUMA DE TODOS LOS NUMEROS PARES ENTRE EL 1 Y 200");
             int numero;
             int suma = 0;
             
             for (int i = 1; i <= 200; i++) {
                 
                 System.out.print("Ingrese un numero: ");
                 numero = leer.nextInt();
                 
                 if (numero % 2 == 0) {
                     suma = suma + numero;
                 }
             }
             
             System.out.println("La suma de los numeros pares de entre 1 y 200 es: " + suma);
         }
    }
}

    
    
    
