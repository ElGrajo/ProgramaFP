/*
 * 4.	Dada una lista con carnet, nombre, apellido y 3 notas parciales para un 
grupo de 7 alumnos (incluídos en “notas.txt”), procesar estos datos y construir 
una nueva lista que contenga solamente los carnets y el promedio de notas de 
aquellos alumnos cuyo promedio está por  encima de 14 ptos.
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
public class Ej4NombrePromedio {
    public static void main(String[] args) throws FileNotFoundException{
        File archivo = new File("src/ficherosjava/notas.txt");
        Scanner sc = new Scanner(archivo);
         PrintWriter salida = new PrintWriter("src/ficherosjava/promedios.txt");
        
        while(sc.hasNext()){
            String DNI = sc.next();
            String nombre = sc.next();
            String apellido = sc.next();
            int nota1 = sc.nextInt();
            int nota2 = sc.nextInt();
            int nota3 = sc.nextInt();
            double promedio = ((nota1 + nota2 +nota3)/ 3);
            if(promedio >= 14 ){
                salida.println(DNI + " " + promedio );
            }
        }
        salida.close();
    }
}
