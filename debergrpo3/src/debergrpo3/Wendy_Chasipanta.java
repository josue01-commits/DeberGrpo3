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
        //calculadora del IMC
         try (Scanner leer = new Scanner(System.in)) {
             String nombre;
             double peso, estatura, imc;
             System.out.println("===== CALCULADORA DE IMC =====");
             System.out.print("Ingrese su nombre: ");
             nombre = leer.nextLine();
             System.out.print("Ingrese su peso (kg): ");
             peso = leer.nextDouble();
             System.out.print("Ingrese su estatura (m): ");
             estatura = leer.nextDouble();
             imc = peso / (estatura * estatura);
             System.out.println("\nNombre: " + nombre);
             System.out.println("IMC: " + imc);
             if (imc < 18.5) {
                 System.out.println("Bajo peso");
             } else if (imc < 25) {
                 System.out.println("Peso normal");
             } else if (imc < 30) {
                 System.out.println("Sobrepeso");
             } else {
                 System.out.println("Obesidad");
             }}
    }
}

    
    
    
