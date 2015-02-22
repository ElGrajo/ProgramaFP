/*
Escriba una aplicación que calcule el producto de una serie de enteros que se 
pasan al método producto, usando una lista de argumentos de longitud variable. 
Pruebe su método con varias llamadas, cada una con un número distinto de 
argumentos.
 */

package cap07Ejercicios;

/**
 *
 * @author Julian
 */
public class Ej0714 {
    public static void main(String args[]){
        Ej0714 miPrueba = new Ej0714();
        System.out.println(miPrueba.producto(2,3));
        System.out.println(miPrueba.producto(2,3,4));
        System.out.println(miPrueba.producto(2,3,10));
    }// fin del main
    
    public int producto(int ... numeros){
        int resultado = 1;
        
        for(int i = 0; i < numeros.length; i++){
            resultado = resultado * numeros[i];
        }// fin del for
        
        return resultado;
    }
}
