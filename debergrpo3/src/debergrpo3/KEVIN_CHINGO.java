
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
         System.out.print("Seleccione una opción: ");
         opcion = sc.nextInt();
         switch(opcion){
             case 1:
                 ejercicio5();
                 break;
             case 2:
                 ejercicio6();
                 break;
             case 3:
                 ejercicio7();
                 break;
             case 4:
                 ejercicio8();
                 break;
             case 0:
                 System.out.println("programa finalizado");
             default :
                 System.out.println("opcion invalida");
                 

}

     }while(opcion!=0);
}
 public static void ejercicio5(){
     int numero;
     int pares = 0;
     int impares = 0;
     do{
         System.out.print("Ingrese un número (0 para terminar): ");
         numero = sc.nextInt();
     }while(numero!=0);

}

public static void ejercicio6(){

}

public static void ejercicio7(){

}

public static void ejercicio8(){

}
}
