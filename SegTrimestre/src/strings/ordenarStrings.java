package strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class ordenarStrings {
    public static void main(String[] args) throws FileNotFoundException{
     String archivo = "C:\\proyects\\Strings\\src\\strings\\lorem";
     Scanner sc = new Scanner(new File(archivo));
     String linea = sc.nextLine();
     String Array[] = linea.split(" ");
     //Limpia caracteres raros, acentos, y mayúsculas
     for (int i = 0; i < Array.length; i++) {
             Array[i] = limpiaPalabra(Array[i]);
     }
     ordenarStrings miOrdena = new ordenarStrings();
     miOrdena.ordenaQuick(Array);
    for (int i = 0; i < Array.length; i++) {
             System.out.println(Array[i]);
         }
 }
 
  public static String limpiaPalabra(String palabra){
      palabra = palabra.toLowerCase();
      StringBuilder linea = new StringBuilder();
     //For que acumule las letras
        for (int i = 0; i < palabra.length() ; i++) {
           int LetraCaracter = (int)palabra.charAt(i);
          if(LetraCaracter > 96){
           if((LetraCaracter > 96) && (LetraCaracter < 123 )){
               linea.append(palabra.charAt(i));
           }else if (LetraCaracter == 225) {
               linea.append('a');
           }else if (LetraCaracter == 237){
               linea.append('i');
           }else if (LetraCaracter == 243){
               linea.append('o');
           }else if (LetraCaracter == 250){
               linea.append('u');
           }else if (LetraCaracter == 241){
               linea.append('ñ');
           }else if (LetraCaracter == 233){
               linea.append('e');
           }else if(LetraCaracter == 252){
               linea.append('u');
           }  
           }

        }
                  palabra = linea.toString();
          return palabra;
  }    
    
  public static void ordenarBurbuja(String [] lista){
    //burbuja, con su clásico doble bucle
    String  aux; 
     for(int i=0; i<lista.length; i++)
     {
         for (int j=i+1 ; j<lista.length; j++)
         {

             //compara el string de  j con el de i, 
             //si el resultado es positivo cambia la ubicacion
             if(lista[j].compareTo(lista[i])<0)
             {
                 aux= lista[j];
                 lista[j]= lista[i]; 
                 lista[i]=aux;
             }
         }
     }
    }

  public static void ordenarInsercion(String [] lista){
      /*
      * Este método va ordenando en forma progresiva, de izquierda a derecha
      * acomodando la nueva cifra en lugar que le corresponde
      */
        String aux;
        for (int i = 1; i < lista.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(lista[j-1].compareTo(lista[j])> 0)
                {
                    aux = lista[j];
                    lista[j] = lista[j-1];
                    lista[j-1] = aux;
                }
            }
        }
  }

  public static void ordenarSeleccion(String [] lista){
      /*
      Busca el mínimo elemento entre una posición i y el final de la lista
      Intercambia el mínimo con el elemento de la posición i
      */
        for (int i = 0; i < lista.length - 1; i++)
        {
            int indice = i;
            for (int j = i + 1; j < lista.length; j++)
                if (lista[indice].compareTo(lista[j])> 0)
                    indice = j;
            String palabraAAcomodar = lista[indice]; 
            lista[indice] = lista[i];
            lista[i] = palabraAAcomodar;
        }
    } 
  
  //QuickSort
     //Inicializa un array para hacer este QuickSort y toma su length
    private String array[];
    private int length;
 
    public void ordenaQuick(String[] inputArr) {
         
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
        String pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * En cada iteracion identificaremos un numero de la izquierda que es
             * más grande que el valor pivote, y también identificaremos un numero
             * de la derecha que es menor que el valor pivote. Una vez realizado esto
             * cambiamos ambos números.
             */
            //array[i] < pivot //array[j] > pivot
            while (array[i].compareTo(pivot)< 0) {
                i++;
            }
            while (pivot.compareTo(array[j])< 0) {
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
        String aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
    
    
}


