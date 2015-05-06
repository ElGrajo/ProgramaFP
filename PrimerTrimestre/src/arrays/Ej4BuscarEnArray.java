package arrays;

import java.util.Scanner;

/**
 *
 * 4. Escribir un programa que lea 10 números por teclado. 
 * Después deberemos introducir en una variable otro número y decidir si el 
 * número introducido se encuentra entre los elementos del array y en qué 
 * psoción se encuentra, mostrándolo por pantalla.
 */
public class Ej4BuscarEnArray {
       public static void main(String args[]){
           int listaNros [];
           int numeroAComparar;
           Scanner entrada;
           
           listaNros = new int [10];
           listaNros[0] = 23;
           listaNros[1] = 34;
           listaNros[2] = 45;
           listaNros[3] = 56;
           listaNros[4] = 67;
           listaNros[5] = 78;
           listaNros[6] = 89;
           listaNros[7] = 100;
           listaNros[8] = 124;
           listaNros[9] = 145;
           
           entrada = new Scanner(System.in);
           
           for (int i = 0; i < 10; i++) {
             System.out.print("introduzca el " + (i+1) + "º numero: ");
             listaNros[i] = entrada.nextInt();
           }
           
          System.out.print("Elija un numero a verificar:");
           numeroAComparar = entrada.nextInt();
           
           for (int i = 0; i < listaNros.length; i++) {
               if(listaNros[i]==numeroAComparar){
                   System.out.printf(
                    "El número %d está en la posicion %dº", listaNros[i], i+1);
               }
           }
       }// fin main
}//fin clase
