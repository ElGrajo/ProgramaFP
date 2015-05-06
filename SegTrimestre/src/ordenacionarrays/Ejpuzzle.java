package ordenacionarrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Entrada
La entrada estar´a compuesta de numerosos casos de prueba. Cada uno de ellos contiene la informaci´on
de un puzzle en dos l´ıneas. La primera l´ınea contiene el n´umero de piezas totales del puzzle (al menos dos
y como mucho 10.000), y la segunda contiene los n´umeros de todas las piezas que hab´ıa en la bolsa (no
necesariamente en orden). La numeraci´on de las piezas comienza por el n´umero 1.
La entrada terminar´a con un puzzle de cero piezas, que no generar´a salida.
Salida
Para cada caso de prueba se debe escribir una l´ınea con el n´umero de la pieza que faltaba en la bolsa.

Entrada de ejemplo
10
1 2 3 5 6 7 8 9 10
8
6 4 3 2 1 8 7
0

Salida de ejemplo
4
5

*/

public class Ejpuzzle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int totalPiezas = 1;
        while(totalPiezas !=0){
            totalPiezas = sc.nextInt();
            sc.nextLine();
            String piezas = sc.nextLine();
            System.out.println(piezaFaltante(totalPiezas, piezas));
        }
        /*
        ArrayList<Integer> respuestas = new ArrayList();

        do{
            totalPiezas = sc.nextInt();
            if(totalPiezas == 0) break;
            sc.nextLine();
            String piezas = sc.nextLine();
            respuestas.add(piezaFaltante(totalPiezas, piezas));
        }while(totalPiezas != 0);
        
        for(Integer rta : respuestas){
            System.out.println(rta);
        }
        */
    }
    
    public static int piezaFaltante(int totPiez, String piezas){
        String lasPiezas[] = piezas.split(" ");
        int piezasInt[] = new int [lasPiezas.length];
        for (int i = 0; i < piezasInt.length; i++) {
            piezasInt[i] = Integer.parseInt(lasPiezas[i]);
        }
        Arrays.sort(piezasInt);
        
        for (int i = 0; i < totPiez-1; i++) {
            if (piezasInt[i] != i+1 ) {
               return i+1;
            }
        }
        return totPiez;
    }
}
