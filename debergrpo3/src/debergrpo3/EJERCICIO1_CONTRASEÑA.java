
package debergrpo3;
import java.util.Scanner;

public class EJERCICIO1_CONTRASEÑA {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        final String clave= "ADminUNO";
        int intentos =0;
        System.out.println("===============================");
        System.out.println("ADIVINAR CONTRASENA");
        System.out.println("===============================");
        
        while(true){
        System.out.print("INGRESE LA CONTRASENA: ");
        String contraTemporal=sc.nextLine();
            intentos++;
            if ( contraTemporal.equals(clave)) {
                System.out.println("===============================");
                System.out.println("CONTRASENA CORRECTA. "+"\nINTENTOS REALIZADOS: "+intentos);
                System.out.println("===============================");
                break;
                
            }
            System.out.println("--Contrasena incorrecta, intente de nuevo.\n");
        }
        
    }
    
}
