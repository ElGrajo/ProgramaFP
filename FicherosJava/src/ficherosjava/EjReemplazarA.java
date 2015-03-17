package ficherosjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * Ejercicio de reemplazar A por @
 */
public class EjReemplazarA {
        public static void main(String[] args) throws FileNotFoundException{
        File archivo = new File("src/ficherosjava/puntuacion.txt");
        Scanner leer = new Scanner(archivo);
        while(leer.hasNext()){
            String renglon = leer.nextLine();
            String[] lasPalabras = renglon.split(" ");
           for (int j = 0; j < lasPalabras.length; j++) {
                
            
            StringBuilder creandoPalabra = new StringBuilder();
            String PalabraActual = lasPalabras[j];
            for (int i = 0; i < PalabraActual.length() ; i++) {
                if(PalabraActual.charAt(i)==97)
                    creandoPalabra.append('@');
                else
                    creandoPalabra.append(PalabraActual.charAt(i));
            }
            String laPalabra = creandoPalabra.toString();
            System.out.print(laPalabra+ " ");
           }
            System.out.println("");
        }
    }//Fin clase
}
