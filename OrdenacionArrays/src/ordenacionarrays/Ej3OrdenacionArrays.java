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
      
         //Usar el método de la otra clase, pero que ordena una sola dimensión.
         Ej3OrdenacionArrays prueba = new Ej3OrdenacionArrays();
          prueba.ordenar(sueldos, nombres);
         
         for (int i = 0; i < sueldos.length; i++) {
            System.out.printf("%s gana %d\n", nombres[i], sueldos[i]);
         }         
     }
     
    //Código tomado del MyQuickSort y adaptado 
    //Inicializa un array para hacer este QuickSort y toma su length
    private int arrayPrincipal[];
    private String arraySecundario[];
    private int length;
 
    //Verifica que la variable tenga algo dentro.
    public void ordenar(int[] arrayDeEntrada, String [] arraySecunEntrada) {
         
    //Si no tiene nada, sale
        if (arrayDeEntrada == null || arrayDeEntrada.length == 0) {
            return;
        }
        this.arrayPrincipal = arrayDeEntrada;
        this.arraySecundario = arraySecunEntrada;
        length = arrayDeEntrada.length;//Le pone el valor a length
        quickSort(0, length - 1);//y le pasa al quickSort para hacer el trabajo
    }
 
    private void quickSort(int indiceMenor, int indiceMayor) {
         
        int i = indiceMenor;
        int j = indiceMayor;
        
        // para calcular el valor pivote, toma los elementos del medio.
        // lo que divide en la practica el array en dos.
        int pivot = arrayPrincipal[indiceMenor+(indiceMayor-indiceMenor)/2];
        
        while (i <= j) {
            /**
             * En cada iteracion identificaremos un numero de la izquierda que es
             * más grande que el valor pivote, y también identificaremos un numero
             * de la derecha que es menor que el valor pivote. Una vez realizado esto
             * cambiamos ambos números.
             */
            while (arrayPrincipal[i] < pivot) {
                i++;
            }
            while (arrayPrincipal[j] > pivot) {
                j--;
            }
            if (i <= j) {
                intercambiaLugares(i, j);
                //Mueve el index a la siguiente posicion en los dos lados.
                i++;
                j--;
            }
        }//Final del while
        
        // llama a quickSort recursivamente
        if (indiceMenor < j)
            quickSort(indiceMenor, j);
        if (i < indiceMayor)
            quickSort(i, indiceMayor);
    }

//Para hacer el swap en el array principal
    private void intercambiaLugares(int i, int j) {
        int aux = arrayPrincipal[i];
        arrayPrincipal[i] = arrayPrincipal[j];
        arrayPrincipal[j] = aux;
        
        String auxiliar = arraySecundario[i];
        arraySecundario[i] = arraySecundario[j];
        arraySecundario[j] = auxiliar;
    }
}
