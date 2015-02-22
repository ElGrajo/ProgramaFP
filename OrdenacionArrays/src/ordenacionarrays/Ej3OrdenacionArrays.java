/*
3. Se dispone de dos vectores, Maestro y Esclavo, del mismo tipo y número de 
elementos. Se deben imprimir en dos columnas adyacentes. Se ordena el vector 
Maestro, pero siempre que un elemento de Maestro se mueva, el elemento 
correspondiente de Esclavo debe moverse también; es decir, cualquier cosa que 
se haga en Maestro[i] debe hacerse en Esclavo[i]. Después de realizar la 
ordenación se imprimen de nuevo los vectores. Escribir un programa que realice 
esta tarea.

Nota: Utilizar como algoritmo de ordenación el método quicksort.
 */
package ordenacionarrays;

/**
 *
 * @author DAM1
 */
public class Ej3OrdenacionArrays {
         public static void main(String[] args) {
         int [] sueldos = {823, 345, 654, 678, 854, 987, 875, 896};
         String [] nombres = {"Juan", "Mario", "Ignacio", "Ernesto",
         "Mariana", "Fernanda", "Jacinta", "Aurora"};
      
         OrdenadorQuick(sueldos, nombres);
         for (int i = 0; i < sueldos.length; i++) {
            System.out.printf("%s gana %d\n", nombres[i], sueldos[i]);
         }
         
         
         
     }
     
     public static void OrdenadorQuick( int numeros[], String palabras[]){
       
     
     }    
}
