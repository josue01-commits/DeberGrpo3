/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package debergrpo3;

import java.util.Scanner;

/**
 *
 * @author Nikholov
 */
public class Debergrpo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        System.out.println("hola grupo3");
        Scanner sc = new Scanner(System.in);
        int op;
        //invocar los archivos
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. CORRALES");
            System.out.println("2. CHINGO");
            System.out.println("3. CHUQUITARCO");
            System.out.println("4. CHASIPANTA");
            System.out.println("5. SALIR");
            System.out.print("ingresa la opcion: ");
            op = sc.nextInt();

            switch(op) {
                case 1:
                    EJERCICIOS_DAVIDCORRALES.main(null);
                    break;

                case 2:
                    KEVIN_CHINGO.main(null);
                    
                    break;

                case 3:
                    EJERCICIOS_CHUQUITARCO_NICOLAY.main(null);
                    break;

                case 4:
                    Wendy_Chasipanta.main(null);
                    break;
                case 5:
                    System.out.println("Fin del programa");
                default:
                    System.out.println("Opcion invalida");
            }

        } while(op != 5);
    }
    
    
}
