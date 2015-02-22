package arrays;

/**
 *
 * @author Julian Gawron
 * Ejercicios de arrays
 * 8.	 Escribir un programa que lea una matriz de 4 filas y 3, 4,6 y 7 
 * columnas, la visualice por pantalla y a continuación encuentre el mayor y 
 * el menor elemento de la matriz y sus posiciones.
 */
public class Ej8MayorMenor {
    public static void main(String[] args) {
       
        int numeros[][] = {
                    {1,2,3},
                    {84,89,65,21},
                    {54,48,878,54,4,8},
                    {48,98,98,15,7,89,0}
                    };
        int numMax = 0;
        int numMin = 2000000000;
        String posicionMin = "";
        String posicionMax = "";
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if(numeros[i][j] > numMax){
                    numMax = numeros[i][j];
                    posicionMax = "Eje x:" + Integer.toString(j) + 
                            "Eje Y:" + Integer.toString(i);
                }//fin if max
                
                if(numeros[i][j] < numMin){
                    numMin = numeros[i][j];
                    posicionMin = "Eje x:" + Integer.toString(j) + 
                            " Eje Y:" + Integer.toString(i);
                }//fin if max
                
            }
        }
        System.out.printf("El numero menor es: %d y esta en %s\n",
                numMin, posicionMin);
        System.out.printf("El numero mayor es: %d y esta en %s\n",
                numMax, posicionMax);
    }//fin del main
      
}
