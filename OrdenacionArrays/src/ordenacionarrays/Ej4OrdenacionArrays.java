/*
4. Escribir un programa de consulta de teléfonos. Leer un conjunto de datos de 
mil nombres y números de teléfono de un archivo que contiene los números en 
orden aleatorio. Las consultas han de poder realizarse por nombre y por número 
de teléfono.
 */
package ordenacionarrays;

import java.io.File;
import java.io.IOException;
import static java.lang.System.nanoTime;
import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class Ej4OrdenacionArrays {
    public static void main(String args[]) throws IOException{
        String archivo = "C:\\0proyects\\OrdenacionArrays\\src\\"
                + "ordenacionarrays\\Ej4OrdenacionArrays.txt" ;
        Scanner entrada = new Scanner(new File(archivo));
        int superContador = 0;
        //Hay dos while porque no sé como dimensionar el array inicial
        while(entrada.hasNext()){
            String linea = entrada.nextLine();
            System.out.println(linea);
            superContador++;
        }     
        
        //Crea el array de nombre y el de numeros
        String arrayNombres[] = new String [superContador];
        int arrayNumeros[] = new int [superContador];
        entrada.close();
        
        //le mete todos los datos
        Scanner entrada1 = new Scanner(new File(archivo));
        int contadorDatos= 0;
        while(entrada1.hasNext()){
            String linea = entrada1.nextLine();
            String Datos[] = linea.split("\\t");
            arrayNombres[contadorDatos] = Datos[0];
            //Sacando el numero
            String limpio = Datos[1].replaceAll("\\s","");
            arrayNumeros[contadorDatos] = Integer.parseInt(limpio);
            contadorDatos++;
        }
        
        //Usando el ordenador desde la clase anterior.
        Ej3OrdenacionArrays prueba = new Ej3OrdenacionArrays();
          prueba.ordenar(arrayNumeros,arrayNombres);
          
        
        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.printf("%d %s\n", arrayNumeros[i], arrayNombres[i]);
        }
        
        System.out.println("---------------------------");
        
        prueba.ordenaQuick(arrayNombres, arrayNumeros);
        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.printf("%s %d\n", arrayNombres[i], arrayNumeros[i]);
        }
        
        
    }
}
