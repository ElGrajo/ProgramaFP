/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cap3;

/**
 *
 * @author Julian
 */
import java.util.Scanner; // El programa lo necesitara
public class PruebaLibroCalificaciones {
    //El metodo main empieza la ejecucion del programa
    public static void main (String args[])
    {
        //Crea un objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        
        //crea un objeto LibroCalificaciones y lo asigna a miLibroCalificaiones
        LibroCalificaciones1 miLibroCalificaciones = new LibroCalificaciones1("Curso"
                + " de programacion");
        
        /*
        //pide y recibe el nombre del curso de entrada
        System.out.println("Escriba el nombre del curso: ");
        String nombreDelCurso = entrada.nextLine(); // lee una linea de texto
        System.out.println("");// imprime una linea en blanco
                */
        
        // LLama al método mostrarMensaje de miLibroCalificaciones
        miLibroCalificaciones.mostrarMensaje();
        
        // Llama al método determinarPromedioClase
        miLibroCalificaciones.introducirCalif();
        
    }// fin de main
} // fin de la clase PruebaLibroCalificaciones
