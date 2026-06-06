
package debergrpo3;
import java.util.Scanner;

public class EJERCICIO1_CONTRASEÑA {


    public static void main(String[] args) {
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
            System.out.println("--Contrasena incorrecta, intente de nuevo.L\n");
        }
        
    }
    
}
