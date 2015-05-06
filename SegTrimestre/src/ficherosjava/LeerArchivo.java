package ficherosjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivo {
    public static void main(String[] args) throws FileNotFoundException{
        File archivo = new File("src/ficherosjava/puntuacion.txt");
        Scanner leer = new Scanner(archivo);
        while(leer.hasNext()){
            String nombre = leer.next();
            String apellido = leer.next();
            int puntos = leer.nextInt();
            System.out.println(nombre + " " + apellido + " " + puntos + " puntos.");
        
        }
    }
}
