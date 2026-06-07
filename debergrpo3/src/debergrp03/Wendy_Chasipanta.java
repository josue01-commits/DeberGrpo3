/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package debergrp03;

import java.util.Scanner;

public class Wendy_Chasipanta {

    public static void main(String[] args) {

        try (Scanner leer = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            int numero = leer.nextInt();
            
            System.out.println("Tabla de multiplicar del " + numero);
            
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}
