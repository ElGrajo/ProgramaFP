package strings;
import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class SpliteandoString {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String entrada = new String();
         String[] parseo;
         System.out.println("Introduce una serie de dias: ");
         entrada = sc.nextLine();
         //Hola@como@estas@amigo!
         parseo = entrada.split("@");
         
         for(String texto : parseo){
             System.out.println(texto);
         }               
     }
}
