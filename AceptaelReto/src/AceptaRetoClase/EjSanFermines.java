package AceptaRetoClase;
import java.util.Scanner;

/**
 *
 * @author Julián
 */
public class EjSanFermines {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         while(sc.hasNext()){
             
        // String datos = sc.nextLine();
         int cantidadToros = sc.nextInt();
        // int datosInt[] = new int [cantidadToros];
         int max = 0;
         int nro;
           for (int i = 0; i < cantidadToros; i++) {
             nro = sc.nextInt();
             //datosInt[i] = nro;
             if(nro > max){
               max = nro;
             }
           }
         System.out.println(max);
         //System.out.println(queToro(datosInt));
        // System.out.println(queToro(datos));
         }
     }
    public static int queToro(int [] VelocInt){
         int velocMaxima = 0;
         for (int i = 0; i < VelocInt.length; i++) {
             if(VelocInt[i]> velocMaxima){
                 velocMaxima= VelocInt[i];
             }
         }       
         return velocMaxima;
     }
     
     
     public static int queToro(String VelocToros){
         String[] VelocTexto = VelocToros.split(" ");
         int[] VelocInt = new int [VelocTexto.length - 1];
         int velocMaxima = 0;
         for (int i = 0; i < VelocInt.length; i++) {
             VelocInt[i] = Integer.parseInt(VelocTexto[i + 1]);
             if(VelocInt[i]> velocMaxima){
                 velocMaxima= VelocInt[i];
             }
         }       
         return velocMaxima;
     }
}
