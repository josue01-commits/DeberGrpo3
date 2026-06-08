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
            //INGRESO DE NUMEROS POSITIVOS 
             int numero;
             int suma = 0;
             int cantidad = 0;
             double promedio;
             
             System.out.println("INGRESO DE NUMEROS POSITIVOS");
             System.out.println("El proceso termina al ingresar un numero negativo.");
             
             System.out.print("Ingrese un numero: ");
             numero = leer.nextInt();
             
             while (numero >= 0) {
                 
                 suma = suma + numero;
                 cantidad++;
                 
                 System.out.print("Ingrese otro numero: ");
                 numero = leer.nextInt();
             }
             
             if (cantidad > 0) {
                 promedio = (double) suma / cantidad;
                 
                 System.out.println("\nRESULTADOS");
                 System.out.println("Cantidad de numeros ingresados: " + cantidad);
                 System.out.println("Suma total: " + suma);
                 System.out.println("Promedio: " + promedio);
             } else {
                 System.out.println("No se ingresaron numeros positivos.");
             }}
        }
    }
    
    
