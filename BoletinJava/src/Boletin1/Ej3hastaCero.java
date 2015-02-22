package Boletin1;

import java.util.Scanner;

/**
 *
 * @author Julian Gawron
 */
public class Ej3hastaCero {
    /*
    Leer números hasta que se introduzca un 0. Para cada uno indicar si es 
        par o impar.
    */
       public static void main(String[] args) {

        int numero;
        String respuesta = "";
        Scanner entrada = new Scanner(System.in);
        
        numero = 1;
        
        while (numero != 0){
        System.out.print("Introduzca el numero:");
        numero = entrada.nextInt(); 
               
         if (numero % 2 == 0){
             respuesta = "Par";
         }else {
             respuesta = "Impar";
         }
         if (numero == 0){
             respuesta = "0";
         }
         
         System.out.println("El numero es " + respuesta);
        }
     }
    
}
