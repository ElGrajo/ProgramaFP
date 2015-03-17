/*
4
Anastasio Ignacio Felipe Borja Daniel Cesar F 2 3
Javier Ramiro Luis Rosa Carmen Paola Josefa F 0 3
Petra Santiago Pepi F 2 20
Merche Juanjo Miriam Pilar Marina Ovidio Rafael Eustaquio F 4 7

Salida de ejemplo
Anastasio Daniel
NADIE TIENE CAMA
Petra Pepi
Merche Miriam Pilar Marina

*/

package programejos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class QuitarNombresReto127 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int casos = 1;
        casos = sc.nextInt();
        sc.nextLine();
        while(casos>0){
            ArrayList<String> nombres = new ArrayList();
            int palabras = 0;
            int camas = 0;
            while(sc.hasNext()){
            String nuevoNombre = sc.next();
            if(nuevoNombre.equals("F")){
                   camas = sc.nextInt();
                   palabras = sc.nextInt();
                   sc.nextLine();
                   break;
            }//Datos fuera
            else {
            nombres.add(nuevoNombre);  
            }
            }//Cierra el while
            if(camas<1){
                System.out.println("NO HAY CAMAS");
                break;
            }//Si no hay camas
            else if(camas>=nombres.size()){
                System.out.println("TODOS TIENEN CAMAS");
                break;
            }
            int posicion = 0;
            int pierden = nombres.size()- camas;
            while(pierden>0){
                //Calcular los movimientos
                for (int i = 0; i < 3-1; i++) {
                    
                    if(posicion>=nombres.size()){
                        posicion = 0;
                    }
                    posicion++;
                }
               //Borra la posición actual 
                System.out.println(nombres.remove(posicion));
               //Despues de quitar un nombre, se regresa una posicion
            pierden--;
            }
            //
            for (String nombre : nombres) {
                System.out.println(nombre + " ");
            }
            
        casos--;
        }//final del while casos
    
    }
}
