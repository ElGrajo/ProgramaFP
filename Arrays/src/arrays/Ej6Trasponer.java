package arrays;

/**
 *
* 6.	Realizar  un programa que nos permita introducir los valores de una matriz bidimensional y luego la trasponga, es decir, dados los valores
*  1	1	3	45
*  23	43	44	87
*
*  Nos quedaría:
*  1	23
*  1	43
*  3	44
*  45	87
*/
public class Ej6Trasponer {
      public static void main(String[] args) {
          //Declarando el array y sus arrays
        int [][] numeros;
        numeros = new int[2][];
        numeros[0] = new int[4];
        numeros[1] = new int[4];
        
        numeros[0][0] = 1;
        numeros[0][1] = 1;
        numeros[0][2] = 3;
        numeros[0][3] = 45;
        
        numeros[1][0] = 23;
        numeros[1][1] = 43;
        numeros[1][2] = 44;
        numeros[1][3] = 87;
  
        for (int i = 0; i < numeros.length; i++) {
              for (int j = 0; j < numeros[i].length; j++) {
                  System.out.printf("  %d", numeros[i][j]);
              }
              System.out.println(" ");
          }
         
          System.out.println("*************************");
         // La dimension de fuera está puesta a la fuerza, porque no se puede
          // obtener
          for (int j = 0; j < 4; j++) {
              for (int i = 0; i < numeros.length; i++) {
              System.out.printf("%d  ", numeros[i][j]);
             } 
              System.out.println("");
          }
 

         
         
          
      }//fin de main
}//fin de clase
