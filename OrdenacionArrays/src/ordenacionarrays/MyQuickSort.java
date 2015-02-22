package ordenacionarrays;

/**
 *
 * @author Usuario
 */
 
public class MyQuickSort {
     
    //Inicializa un array para hacer este QuickSort y toma su length
    private int array[];
    private int length;
 
    public void sort(int[] inputArr) {
         
        //Si no tiene nada, sale
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;//Le pone el valor a length
        quickSort(0, length - 1);//Le el tamaño del array completo
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // para calcular el valor pivote, toma los elementos del medio.
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * En cada iteracion identificaremos un numero de la izquierda que es
             * más grande que el valor pivote, y también identificaremos un numero
             * de la derecha que es menor que el valor pivote. Una vez realizado esto
             * cambiamos ambos números.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    //Para hacer el swap en el array principal
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    //Prueba del método de ordenación
    public static void main(String a[]){
         
        MyQuickSort sorter = new MyQuickSort();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}