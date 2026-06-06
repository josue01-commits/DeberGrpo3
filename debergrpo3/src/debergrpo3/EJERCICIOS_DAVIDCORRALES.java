
package debergrpo3;
import java.util.Scanner;

public class EJERCICIOS_DAVIDCORRALES {


    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("""
        =========================
            MENU DE EJERCICIOS
        -------------------------
        1.-EJERCICIO 1(contrasena)
        2.-EJERCICIO 2
        3.-EJERCICIO 3
        4.-EJERCICIO 4
        -------------------------""");
        System.out.print("OPCION: ");
        int opcion =sc.nextInt();
        switch (opcion){
            case 1:System.out.println("\n"); ejercicio1();
            case 2:System.out.println("\n"); ejercicio2();
            case 3:System.out.println("\n"); ejercicio3();
            
        }
        
       
    }
    
public static void ejercicio1(){
        Scanner sc=new Scanner(System.in);
         // Declaración de la clave maestra fija mediante una constante String que no cambiará
        final String clave= "ADminUNO";
         // Variable acumuladora encargada de registrar el número de intentos del usuario
        int intentos =0;
        System.out.println("===============================");
        System.out.println("ADIVINAR CONTRASENA");
        System.out.println("===============================");
        // Bucle infinito estructurado que mantendrá el programa activo hasta acertar la contraseña
        while(true){
        System.out.print("INGRESE LA CONTRASENA: ");
        String contraTemporal=sc.nextLine();
        //almacena los numeros de intentos
            intentos++;
        //evaluacion logica para evaluar la contraseña ingresa con la clave fija
            if ( contraTemporal.equals(clave)) {
                System.out.println("===============================");
                System.out.println("CONTRASENA CORRECTA. "+"\nINTENTOS REALIZADOS: "+intentos);
                System.out.println("===============================");
                break;     
            }
    //mensaje si las contraseñas no son iguales
            System.out.println("--Contrasena incorrecta.Intente de nuevo.\n");
        }
    }

public static void ejercicio2(){
    Scanner sc = new Scanner(System.in);
    int sumT=0;
    int numT=0;
    int promedio=0;
    System.out.println("-------------------------------");
    System.out.println("PROCESADOR DE NUMEROS ENTEROS");
    System.out.println("-------------------------------");
    System.out.println("Nota:Cualquier numero negativo\ningresado terminara el proceso.");
    System.out.println("-------------------------------");
    while (true){
        System.out.print("INGRESE El NUMERO "+(numT+1)+": ");
        int num =sc.nextInt();
        if (num<0) {
    System.out.println("-------------------------------");
            System.out.print("Fin del proceso.\nNegativo detectado: (" + num +")\n");
            break;
        }
        sumT += num; 
        numT++;
        promedio=sumT/numT;
    }
    System.out.println("-------------------------------");
    System.out.println("R E P O R T E");
    System.out.println("-------------------------------");
    System.out.println("SUMA TOTAL:\t"+sumT);
    System.out.println("Cant.NUMEROS:\t"+numT);
    System.out.println("PROMEDIO:\t"+promedio);
    System.out.println("-------------------------------");
}

public static void ejercicio3(){
    Scanner sc=new Scanner(System.in);
    System.out.println("""
    ----------------------------------------------------
         V A L I D A C I O N   D E   N O T A S 
    ----------------------------------------------------
    NOTA: digite las notas dentro del rango. 
    ----------------------------------------------------\n""");  
    while(true){
        
    System.out.print("->DIGITE NOTA (0-10): ");
    double nota=sc.nextDouble();
  
    if (nota>=0.0 && nota <=10.0) {
        System.out.println("\n----------------------------------------------------\n"+
    "NOTA VALIDA : "+nota+" REGISTRADA\n----------------------------------------------------");
    break;     
    }
        System.out.println("!ERROR!.NOTA fuera de rango.Vuelva a ingresar.\n");
   }   
}
}
