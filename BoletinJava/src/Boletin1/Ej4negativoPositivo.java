package Boletin1;

import java.util.Scanner;

/**
 *
 * @author Julian Gawron
 */
public class Ej4negativoPositivo {
    /*  Leer un número e indicar si es positivo o negativo. El proceso se 
        repetirá hasta que se introduzca un 0. */
    
     public static void main(String[] args) {

        int numero;
        String respuesta = "";
        Scanner entrada = new Scanner(System.in);
        
        numero = 1;
        
        while (numero != 0){
        System.out.print("Introduzca el numero:");
        numero = entrada.nextInt(); 
               
         if (numero > 0){
             respuesta = "Positivo";
         }else {
             respuesta = "Negativo";
         }
         if (numero == 0){
             respuesta = "0";
         }
         
         System.out.println("El numero es " + respuesta);
        }
     }
}
