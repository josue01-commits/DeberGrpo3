
package debergrpo3;

import java.util.Scanner;
public class KEVIN_CHINGO {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menuPrincipal();
}
 public static void menuPrincipal(){
     int opcion;
     do{
         
         System.out.println("""
        =========================================
         MENU PRINCIPAL
        =========================================
        1. Contar números pares e impares
        2. Registrar ventas diarias de una tienda
        3. Contar números hasta ingresar uno negativo
        4. Generar tabla de multiplicar del 1 al 20
        0. Salir
        =========================================
        """);

     }while(opcion!=0);
}  
}
