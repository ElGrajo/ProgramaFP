/*
7.17 (Tiro de dados) 
Escriba una aplicación para simular el tiro de dos dados. 
La aplicación debe utilizar un objeto de la clase Random una vez para tirar el 
primer dado, y de nuevo para tirar el segundo dado. Después debe calcularse la
suma de los dos valores. Cada dado puede mostrar un valor entero del 1 al 6, 
por lo que la suma de los valores variará del 2 al 12, siendo 7 la suma más 
frecuente, mientras que 2 y 12 serán las sumas menos frecuentes. En la figura 7.30
se muestran las 36 posibles combinaciones de los dos dados. Su aplicación debe 
tirar los dados 36,000 veces. Utilice un arreglo unidimensional para registrar 
el número de veces que aparezca cada una de las posibles sumas. Muestre los
resultados en formato tabular. Determine si los totales son razonables
 */

package cap07Ejercicios;

/**
 *
 * @author Julian
 */
import java.util.Random;

public class Ej0717 {
    public static void main(String args[]){
     
    Random NroAzar = new Random();
    int CuentaResultados[] = new int[11];
    
    for(int i = 0; i < 36000; i++){
        int PrimerDado = 1+ NroAzar.nextInt(6);
        int SegundoDado = 1+ NroAzar.nextInt(6);
        int resultado = PrimerDado + SegundoDado;
        ++CuentaResultados[resultado-2];
    }// fin del for que tira
        
    //Mostrar Resultados
    for(int i = 0; i < CuentaResultados.length; i++){
        System.out.printf("Que dieran %d, hubo: %d\n", i + 2, CuentaResultados[i]);
    }// fin del mostrador
   } // fin del main
    
}// fin de la clase
