/*
1. Un método de ordenación muy simple, pero no muy eficiente, de elementos x1, 
x2, x3, ...xn en orden ascendente es el siguiente:
 Paso 1: Localizar el elemento más pequeño de la lista x 1 a xn; intercambiarlo 
con x1.
 Paso 2: Localizar el elemento más pequeño de la lista x2 a xn, intercambiarlo 
con x2.
 Paso 3: Localizar el elemento más pequeño de la lista x3 a xn, intercambiarlo 
con xn.

En el último paso, los dos últimos elementos se comparan e intercambian, si es 
necesario, y la ordenación se termina. Escribir un programa para ordenar una 
lista de elementos, siguiendo este método.


*/
package ordenacionarrays;

/**
 *
 * @author DAM1
 */
public class Ej1OrdenacionArraysSelection {
     public static void main(String[] args) {
         int [] paraOrdenar = {28,4,56,754,4,65,7,32,78,8};
         ordenador(paraOrdenar);
         for (int i = 0; i < paraOrdenar.length; i++) {
             System.out.println(paraOrdenar[i]);
         }
     }
     
     /* Ordena el array entregado*/
     static public void ordenador(int numeros[]){
         //buscar el numero menor
        for (int i = 0; i < numeros.length - 1; i++)
        {
            int menor = i;
            for (int j = i + 1; j < numeros.length; j++)
                //Comprueba si el valor de 
                if (numeros[j] < numeros[menor]){
                    menor = j;
                }
            //Rota los valores.
            int smallerNumber = numeros[menor]; 
            numeros[menor] = numeros[i];
            numeros[i] = smallerNumber;
        }
     }
}
