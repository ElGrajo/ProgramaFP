package Boletin1;

import java.util.Scanner;

/**
 *
 * @author Julian Gawron
 */
public class Ej5adivinarNumero {
    /*
    Realizar un juego para adivinar un número. Para ello pedir un número N, 
        y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor 
        o menor con respecto a N. El proceso termina cuando el usuario acierta.
    */
        public static void main(String[] args) {
        
        // declaracion de variables
        int numero;
        int adivina;
        int intento;
        boolean sigue = true;
        Scanner entrada = new Scanner(System.in);
        
        //pide el numero clave
        System.out.print("Introduzca numero clave:");
        adivina = entrada.nextInt(); 
        intento = 0;
               
        while (sigue){
        System.out.print("Introduzca numero:");
        numero = entrada.nextInt(); 
        
        intento++;
        if(numero == adivina){
            sigue = false;
            System.out.print("Felicitaciones! es ese Numero!!\n"
                    + " Lo haz resuelto en " + intento + " intentos.");
        } else {            
            System.out.print("No es ese numero.");
                if(numero < adivina){
                    System.out.println("El numero a adivinar es mayor");
                   }// fin del if
                if(numero > adivina){
                    System.out.println("El numero a adivinar es menor");
                    }
            }// fin del else
         
        }// fin del while
        
       }// fin del main 
}// fin de clase
