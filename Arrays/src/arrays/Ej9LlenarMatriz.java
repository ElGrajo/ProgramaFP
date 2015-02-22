package arrays;

import java.util.Scanner;

/**
 *
 * 
 * 9.	Realizar un programa que declare una matriz de dimensiones nxm 
 * (introducidos por teclado) e introduzca datos de tipo entero hasta completar
 * la matriz. Una vez declarada pediremos por teclado un número de fila y 
 * mostrarenmos el máximo valor de esa fila.
 */
public class Ej9LlenarMatriz {
      public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         int valorX = 0;
         int valorY = 0;
         int fila = 0;
         int valorMayorFila = 0;
         
         System.out.println("Va crear un Array bidimensional:");
         System.out.println("Inserte primer dimension: ");
         valorX = entrada.nextInt();
         System.out.println("Inserte la segunda: ");
         valorY = entrada.nextInt();
         
         //Darle formato
         int numeros[][];
         numeros = new int [valorY][];
         for (int i = 0; i < numeros.length; i++) {
              numeros[i] = new int [valorX];
          }
         
         //Llenar la matriz
         for (int i = 0; i < numeros.length; i++) {
              for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("Inserte otro numero: ");
                numeros[i][j] = entrada.nextInt(); 
              }
         
          }//fin de for de llegar matriz
         
        //mostrar la matriz     
        for (int i = 0; i < numeros.length; i++) {
              for (int j = 0; j < numeros[i].length; j++) {
                  System.out.print(numeros[i][j]);
              }
              System.out.println("");
        }
         
        System.out.printf("Elija una fila entre 1 y %d:", (numeros.length));  
        fila = entrada.nextInt();
        
        //Para que la fila no se pase de rango
         while (fila > numeros.length) {
            System.out.printf("La fila tiene que estar entre 1 y %d:", (numeros.length));  
            fila = entrada.nextInt();
          }
        fila = fila - 1;
        for (int i = 0; i < numeros[fila].length; i++) {
            if(valorMayorFila < numeros[fila][i]){
                valorMayorFila= numeros[fila][i];
            }
        }
        
        System.out.printf("El mayor valor de esa fila es: %d", valorMayorFila);
         
      }
}
