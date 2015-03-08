/*
 * Problema 205 Numeros de Lychel
 * Cuando se aburren, los aficionados a las matemáticas se dedican a jugar con 
 * los números. Eso les lleva, por ejemplo, a coger cualquier número, darle la 
 * vuelta y sumarlo a sí mismo, repitiendo el proceso una y otra vez hasta dar 
 * con un número capicúa. Por ejemplo, para el 91 llegamos a un capicúa en sólo 
 * dos pasos:
 *       91 + 19 = 110
 *      110 + 011 = 121
 * Algunos números se resisten a alcanzar un capicúa. El 196 es el número más 
 * pequeño para el que no se ha llegado a ninguno, por más que se ha intentado. 
 * Los matemáticos no han podido demostrar que, efectivamente, no vaya a 
 * llegarse a uno. Mientras continúan buscando una demostración, los aficionados 
 * siguen sumando y sumando con la esperanza de llegar a él. Los números con los
 * que, se sospecha, no puede alcanzarse un capicúa se conocen como números de 
 * Lychrel. Curiosamente, algunos números capicúa parecen ser también números de 
 * Lychrel.
 *
 ** Entrada
 * La entrada comienza con un número indicando la cantidad de casos de prueba 
 * que vendrán a continuación. Cada caso de prueba estará compuesto de un número
 * 1 ≤ n ≤ 100.000.
 *  
 ** Salida
 * Para cada caso de prueba n, el programa deberá indicar el número de 
 * iteraciones que hay que dar hasta llegar a un número capicúa, seguido del 
 * número capicúa alcanzado. Si durante el proceso se llega a un número mayor 
 * que 1.000.000.000, se deberá asumir que el capicúa no es alcanzable y 
 * escribir "Lycrhel?".
 * 
 * Entrada de ejemplo
 * 4 
 * 91
 * 196
 * 4994
 * 5445
 *
 * Salida de ejemplo
 * 2 121
 * Lychrel?
 * Lychrel?
 * 4 79497
 */
package programejos;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class LychelNros {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int vueltas = sc.nextInt();
    while(vueltas>0){
        int siguiente = sc.nextInt();
        boolean capicua = false;
        int contador = 0;
        while (!(capicua)){
        siguiente = sumaInversoSinString(siguiente);
        capicua = esCapicuaSinString(siguiente);
        contador++;
        if(siguiente>1000000000)
            break;
        }
        if(capicua)
            System.out.printf("%d %d\n", contador, siguiente);
        else
            System.out.println("Lychrel?");
    vueltas--;
    }
        
    
    }//fin del main
    
   public static int sumaInverso(int numero){
       String numeroInverso = Integer.toString(numero);
       String nuevoNumero = "";
       
       for (int i =  numeroInverso.length()-1; i >= 0; i--) {
           //rotar
           nuevoNumero += numeroInverso.charAt(i);
       }
       int respuesta = Integer.valueOf(nuevoNumero);
       return respuesta + numero;
   }
   public static int sumaInversoSinString(int numero){
   int respuesta = 0;
   int temporal = numero;
   int cifras = (int)Math.log10(numero);
   while(temporal > 0){
       respuesta += (temporal % 10)* Math.pow(10, cifras);
       temporal = temporal / 10;
       cifras--;
   }
       
   return respuesta + numero;
   }
   
   public static boolean esCapicua(int numero){
       String MiNumero = Integer.toString(numero);
       int largo = MiNumero.length();
       for (int i = 0; i < largo; i++) {
           if(MiNumero.charAt(i)!= MiNumero.charAt(largo-1-i))
               return false;
       }
   return true;
   }
   
   public static boolean esCapicuaSinString(int numero){
       int cifras = (int)Math.log10(numero)+1;
       for (int i = 0; i < cifras/2; i++) {
           int derecha = (int)(numero / (int)Math.pow(10, cifras-1-i));
           int izquierda = (numero/(numero % (int)Math.pow(10, i)));
           if(derecha != izquierda)
                   return false;
       }
   return true;
   }
}
