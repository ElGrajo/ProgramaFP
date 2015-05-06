package ordenacionarrays;

import java.util.Arrays;

/**
 *
 * @author DAM1
 * 
 */
public class BusquedaBinaria {
      public static void main(String args[]){
          int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
          System.out.println(busquedaBinaria(list, 2));
          System.out.println(busquedaBinaria(list, 11));
          System.out.println(busquedaBinaria(list, 12));
          System.out.println(busquedaBinaria(list, 1)) ;
          System.out.println(busquedaBinaria(list, 3)) ;
          
          Arrays.sort(list);
          
}
    public static int busquedaBinaria(int[] list, int elemento){
        int menor = 0;
        int mayor = list.length - 1; //-1 por los indices
        while (mayor >= menor) { 
         int medio = (menor + mayor) / 2;
          if(elemento < list[medio]) {
                 mayor = medio - 1;
            }else if (elemento == list[medio]) {
                return medio;
            } else {
                menor = medio +1;
            }
        }
          return (-menor - 1);
        }
}
