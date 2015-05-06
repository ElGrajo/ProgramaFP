package arrays;

/**
 *
 * 3. Escribir un programa que lea un array de 10 elementos. 
 * Deberá declarar además otro array donde se almacenará en la primera posición
 * el contenido de la última posición del primero, en la segunda posición el 
 * contenido de la penúltima del primero, etc.
 * 
 * Finalmente mostraremos ambos arrays por pantalla, comprobando que el primero
 * es igual al segundo pero invertido.
 */
public class Ej3ArraysInvertidos {
       public static void main(String args[]){
           int primer [], remirp [];
           primer = new int [10];
           remirp = new int [10];
           int contadorInv = 10;
           
           primer[0] = 23;
           primer[1] = 34;
           primer[2] = 45;
           primer[3] = 56;
           primer[4] = 67;
           primer[5] = 78;
           primer[6] = 89;
           primer[7] = 100;
           primer[8] = 124;
           primer[9] = 145;
           
           for (int i = 0 ; i < primer.length; i++) {
               //contadorInv irá recorriendo el array a la inversa.
               contadorInv--;
               remirp[contadorInv] = primer[i];
           }
           
           //Imprime los dos arrays
           for (int i = 0; i < 10; i++) {
               System.out.printf("%d,    %d\n", primer[i], remirp[i]);
           }
           
           
       }// fin del main
}// fin de arraysInvertidos
