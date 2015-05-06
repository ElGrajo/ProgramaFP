package Boletin1;

import java.util.Scanner;

/**
 *
 * @author Julian Gawron
 */
public class Ej1mostrarCuadrado {

    public static void main(String[] args) {
        /*
         1. Leer un número y mostrar su cuadrado, 
         repetir el proceso hasta que se introduzca un número negativo.
         */

        int numero;
        int resultado;
        Scanner entrada = new Scanner(System.in);

        numero = 1;
        while (numero > 0) {
            System.out.print("Introduzca el numero:");
            numero = entrada.nextInt();
            resultado = numero * numero;
            System.out.println("El cuadrado de " + numero + " es " + resultado);
        }

    }
}
