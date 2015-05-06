package Boletin1;

import java.util.Scanner;

/**
 *
 * @author Julian Gawron
 */
public class Ej2hastaNegativo {
    /*
    Pedir números hasta que se teclee uno negativo, y mostrar cuántos 
        números se han introducido.
    */
     public static void main(String[] args) {
        
        int numero;
        int total = 0;
        Scanner entrada = new Scanner(System.in);
        
        numero = 1;
        
        while (numero > 0){
        System.out.print("Introduzca numero:");
        numero = entrada.nextInt(); 
               
        total = total + 1;
         }
         
         System.out.println("El total de numero es " + total);
        }
}
