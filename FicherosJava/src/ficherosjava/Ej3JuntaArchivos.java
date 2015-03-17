/*
 * 3.	Dados dos archivos de números enteros previamente ordenados, cree un 
nuevo archivo con los datos de los dos archivos mezclados de manera que queden 
igualmente ordenados.
 */
package ficherosjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class Ej3JuntaArchivos {
    public static void main(String[] args) throws FileNotFoundException{
        File archivo = new File("src/ficherosjava/numeros1.txt");
        File archivo2 = new File("src/ficherosjava/numeros2.txt");
        Scanner leer1 = new Scanner(archivo);
        Scanner leer2 = new Scanner(archivo2);
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        while(leer1.hasNext()){
            listaNumeros.add(leer1.nextInt());
        }
        while(leer2.hasNext()){
            listaNumeros.add(leer2.nextInt());
        }
        Collections.sort(listaNumeros);
        PrintWriter salida = new PrintWriter("src/ficherosjava/numeros3.txt");
        for(Integer numero : listaNumeros){
            salida.print(numero+ " ");
        }
        salida.close();
    }
}
