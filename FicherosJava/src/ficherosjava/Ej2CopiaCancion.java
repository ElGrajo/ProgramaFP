/*
2. Dado el archivo “canción.txt”, leer carácter a carácter el archivo y a la vez 
crear un nuevo archivo llamado “salida.txt” con el contenido del archivo leído.

 */
package ficherosjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class Ej2CopiaCancion {
           public static void main(String[] args) throws FileNotFoundException{
        File archivo = new File("src/ficherosjava/cancion.txt");
        PrintWriter salida = new PrintWriter("src/ficherosjava/salida.txt");
        Scanner leer = new Scanner(archivo);
        while(leer.hasNext()){
            String renglon = leer.nextLine();
            String[] lasPalabras = renglon.split(" ");
           for (int j = 0; j < lasPalabras.length; j++) {
            
            StringBuilder creandoPalabra = new StringBuilder();
            String PalabraActual = lasPalabras[j];
            for (int i = 0; i < PalabraActual.length() ; i++) {
                creandoPalabra.append(PalabraActual.charAt(i));
            }
            String laPalabra = creandoPalabra.toString();
            salida.print(laPalabra+ " ");
           }
            salida.println("");
        }
        salida.close();
    }//Fin clase
}
