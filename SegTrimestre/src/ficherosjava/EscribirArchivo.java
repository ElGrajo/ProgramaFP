package ficherosjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author DAM1
 */
public class EscribirArchivo {
    public static void main(String[] args) throws FileNotFoundException{
        File archivo = new File("src/ficherosjava/puntuacion.txt");
        //comprobamos si existe
        if(archivo.exists()){
            System.out.println("El archivo ya existe");
            System.exit(0);//Si esta línea no está, el archivo escribe.
        }
        
        PrintWriter salida = new PrintWriter("src/ficherosjava/puntuacion.txt");
        salida.print("Fidel Castro");
        salida.println("80");
        salida.print("Ernesto Guevara");
        salida.println("60");
        salida.close();
    }
}
