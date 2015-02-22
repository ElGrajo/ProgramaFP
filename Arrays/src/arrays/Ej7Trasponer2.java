package arrays;
import java.util.Scanner;

/**
 * 7. Escribir un programa que lea una matriz de enteros de 4 filas y 4 
 * columnas y a continuación intercambie la fila i con la fila j, siendo i y j 
 * dos valores introducidos por teclado.
 */
public class Ej7Trasponer2 {
     public static void main(String[] args) {
       
        int numeros[][] = {
                    {1,2,3,4},
                    {84,89,65,21},
                    {145,587,122,887},
                    {48,98,98,15}
                    };
        Scanner entrada = new Scanner(System.in);
        int valorI = 0;
        int valorJ = 0;
        int numerosAux [];
        numerosAux = new int[4];
        
        //mostrar toda la matriz actual
         System.out.println("Este el matriz actual");
         for (int i = 0; i < numeros.length; i++) {
             for (int j = 0; j < numeros[i].length; j++) {
                 System.out.print(numeros[i][j]);
             }
             System.out.println("");
         }
         
         
         //Ingresa valores para 
         System.out.println("Puede cambiar dos líneas:");
         System.out.println("Inserte la primera: ");
         valorI = entrada.nextInt();
         System.out.println("Inserte la segunda: ");
         valorJ = entrada.nextInt();
         valorI = valorI - 1;
         valorJ = valorJ - 1;
         

             for (int j = 0; j < numeros[valorI].length; j++) {
                 //Copia la filaI en aux
                 numerosAux[j] = numeros[valorI][j];
                 
                 //copia la filaJ en I
                 numeros[valorI][j] = numeros[valorJ][j];
                 
                 //copia la fila aux a J
                 numeros[valorJ][j]  = numerosAux[j];
             }
      
         //Muestra el resultado
         System.out.println("Este el matriz actual");
         for (int i = 0; i < numeros.length; i++) {
             for (int j = 0; j < numeros[i].length; j++) {
                 System.out.print(numeros[i][j]);
             }
             System.out.println("");
         }
   }
         
}

 

