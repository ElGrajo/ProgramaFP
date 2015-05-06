/*
Números polidivisibles
Tiempo máximo: 1,000-3,000 s  Memoria máxima: 4096 KiB
El número 381.654.729 tiene una propiedad muy curiosa que no cumple ningún otro 
número. Si lo miras con cuidado es probable que te des cuenta de que tiene los 
nueve dígitos entre el 1 y el 9 y que no repite ninguno de ellos. Sin embargo, 
eso no es lo único especial que tiene (hay muchos otros números así).

Lo que realmente lo hace singular es que, además de lo anterior, es divisible 
por 9; si se le quita el último dígito, queda un número divisible por 8; si 
se le vuelve a quitar el último dígito, queda un número divisible por 7; y así 
contínuamente hasta llegar a un número de un único dígito que, naturalmente, es 
divisible por 1:

381.654.729 = 9 × 42.406.081
 38.165.472 = 8 × 4.770.684
  3.816.547 = 7 × 545.221
   381.654  = 6 × 63.609
    38.165  = 5 × 7.633
     3.816  = 4 × 954
       381  = 3 × 127
        38  = 2 × 19
         3  = 1 × 3
Esta última peculiaridad es lo que en matemáticas se conoce como un número 
polidivisible, que puede definirse de la siguiente forma: un número es 
polidivisible si es divisible por su longitud y, además, si se le quita el 
último dígito queda un número que es a su vez polidivisible.

Existen otros números polidivisibles como el 102 o el 9.876. Pero su cantidad 
es limitada: hay un total de 20.456 números polidivisibles distintos, el mayor 
de los cuales tiene 25 dígitos.

Entrada
La entrada estará compuesta por distintos números positivos, cada uno de ellos 
en una línea. Los números serán siempre mayores que cero y nunca mayores que 1018.

Salida
Por cada número, se escribirá una línea en donde aparecerá "POLIDIVISIBLE" 
si el número es polidivisible según la definición anterior o "NO POLIDIVISIBLE"
si no lo es.

Entrada de ejemplo
381654729
102
9876
67
Salida de ejemplo
POLIDIVISIBLE
POLIDIVISIBLE
POLIDIVISIBLE
NO POLIDIVISIBLE

 */
package programame;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class polidivisibles {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
         System.out.println(esPolidivisible(sc.nextLong()));
        }
        
    }
    
    public static String esPolidivisible(long numero){
        long largo = String.valueOf(numero).length();
        if((numero % largo)!=0){
            return "NO POLIDIVISIBLE";
        }
        else if(largo == 1){
            return "POLIDIVISIBLE";
            }
        else{
            return esPolidivisible(numero / 10);
        }
    }
}
