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
         //algoritmo que solicite un numero entero y determine si es primo
         try (Scanner leer = new Scanner(System.in)) {
             int numero;
             int contador = 0;
             
             System.out.println("Ingrese un numero entero: ");
             numero = leer.nextInt();
             
            for (int i = 1; i <= numero; i++) {

            if (numero % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println("El numero ingresado es primo.");
        } else {
            System.out.println("El numero ingresado no es primo.");
        }
        leer.close();
         }
    }
}

    
    
    
