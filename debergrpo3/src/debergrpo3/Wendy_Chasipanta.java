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
         // calculadora de salario
         try (Scanner leer = new Scanner(System.in)) {
             double horas, pago, salario;
             System.out.print("Ingrese las horas trabajadas: ");
             horas = leer.nextDouble();
             System.out.print("Ingrese el pago por hora: ");
             pago = leer.nextDouble();
             salario = horas * pago;
             System.out.println("Salario total: $" + salario);
         }
    }
}

    
    
    
