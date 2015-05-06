package ordenacionarrays;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Julián Gawron
 * 
 * El método Arrays.sort() funciona con cualquier tipo de datos.
 * En cambio para ordenar descendentemente necesitamos que los elementos del 
 * array sean objetos.
 * Por tanto, para ordenar tipos primitivos en orden descendente, necesitaremos
 * utilizar sus correspondientes Wrappers para ello: Integer en vez de int, 
 * Boolean en vez de boolean, Character en vez de char,etc.
 */
public class OrdenacionArray {
     public static void main(String args[]){
         String[] nombres = {"Juan", "Pedro", "Ana", "María", "Luis", 
             "Felipe", "Eduardo"};
         Arrays.sort(nombres);
         for(String nombre : nombres){
             System.out.println(nombre);
         }
         
         Arrays.sort(nombres, Collections.reverseOrder() );
         System.out.println("Descendente:");
         for(String nombre : nombres){
             System.out.println(nombre);
         }
     }
}
