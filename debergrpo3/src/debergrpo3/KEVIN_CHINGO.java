
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
 // ejercicio 5
 public static void ejercicio5(){
     int numero;
     int pares = 0;
     int impares = 0;
     do{
         System.out.print("Ingrese un número (0 para terminar): ");
         numero = sc.nextInt();
         
         if (numero !=0) {
             if (numero %2 == 0)
                 pares++;
             else
                 impares++;
             
         }
     }while(numero!=0);
     System.out.println("Cantidad de números pares: "+pares);
     System.out.println("Cantidad de números impares: "+impares);

}
// ejercicio 6
public static void ejercicio6(){
    double venta;
    double total = 0;
    int contador = 0;
    do{
        System.out.print("Ingrese una venta (0 para terminar): ");
        venta = sc.nextDouble();
        if(venta!=0){

        total += venta;
        contador++;

}
        
        
    }while(venta!=0);
    System.out.println("Total vendido: $" + total);
    System.out.println("Cantidad de ventas registradas: " + contador);

}
// ejrcicio 7
public static void ejercicio7(){
    int numero;
    int contador = 0;
    

}
// ejercicio 8
public static void ejercicio8(){

}
}
