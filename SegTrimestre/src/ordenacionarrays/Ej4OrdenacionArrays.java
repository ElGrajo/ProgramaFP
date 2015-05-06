/*
4. Escribir un programa de consulta de teléfonos. Leer un conjunto de datos de 
mil nombres y números de teléfono de un archivo que contiene los números en 
orden aleatorio. Las consultas han de poder realizarse por nombre y por número 
de teléfono.
 */
package ordenacionarrays;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ej4OrdenacionArrays {
    public static void main(String args[]) throws IOException{
        String archivo = "src\\ordenacionarrays\\Ej4OrdenacionArrays.txt" ;
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
        
        //Usando el "Sort" desde la clase anterior.
        Ej3OrdenacionArrays prueba = new Ej3OrdenacionArrays();
        
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Ingrese el elemento a buscar:");
        String paraBuscar = entradaDatos.nextLine();
 
         //Despues de tomar el dato, intenta transformarlo en numero.
        int miNumero = 0;
         try
         {
           miNumero = Integer.parseInt(paraBuscar);
         }
         catch(NumberFormatException exception)
         {
           //No es un numero, entonces intenta buscar el nombre
            prueba.ordenaQuick(arrayNombres, arrayNumeros);
           //busqueda de nombre
            int lugar = buscar(paraBuscar, arrayNombres);
            if(lugar > -1)
                 System.out.printf("%s %d", arrayNombres[lugar], arrayNumeros[lugar]);
            else
                 System.out.println("No hay numero para " + paraBuscar);       
            return;
         }
                
        //Ordena por telefono, porque es un numero! si no hubiera salido en el catch
        prueba.ordenar(arrayNumeros,arrayNombres);
            int lugar = buscar(miNumero, arrayNumeros);
            if(lugar > -1)
                 System.out.printf("%s %d", arrayNombres[lugar], arrayNumeros[lugar]);
            else
                 System.out.println("No hay nombre para " + miNumero);
    }
    
    //Devuelve la posición del array que coincide ó -1 si no está
    public static int buscar(String dato, String coleccion[]){
        int menor = 0;
	int mayor = coleccion.length - 1;
	while(mayor >= menor){
	    int medio = (menor + mayor) / 2;
            int comparacion = dato.compareTo(coleccion[medio]);
            if(comparacion < 0){ 
                mayor = medio - 1;
            } else if(comparacion == 0){
		return medio;
            } else {
                menor = medio + 1;
            }
	}
        return (-menor - 1);
    } // fin buscaPalabra

    public static int buscar(int dato, int coleccion[]){
    	int menor = 0;
	int mayor = coleccion.length - 1;
	while(mayor >= menor){
		int medio = (menor + mayor) / 2;
		if(dato < coleccion[medio]){
			mayor = medio - 1;
		} else if(dato == coleccion[medio]){
			return medio;
		} else {
		   menor = medio + 1;
		}
	}
        return (-menor - 1);
 
        
    }
}
