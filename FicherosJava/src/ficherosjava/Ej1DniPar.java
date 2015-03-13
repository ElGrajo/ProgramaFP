package ficherosjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* 1.	Dado un archivo de texto “datos.txt”, que contiene dni nombre y apellido
de personas escribiremos un archivo nuevo.txt, donde solo aparecerán los nombres
de aquellas personas con dni terminado en número par.
*/
public class Ej1DniPar {
    public static void main(String[] args) throws FileNotFoundException{
        File archivo = new File("src/ficherosjava/datos.txt");
        Scanner leer = new Scanner(archivo);
         while(leer.hasNext()){
             int dni = leer.nextInt();
             String nombre = leer.nextLine();
             if(dni % 2 == 0){
                 System.out.println(nombre);
             }
             
         }
   }
}
