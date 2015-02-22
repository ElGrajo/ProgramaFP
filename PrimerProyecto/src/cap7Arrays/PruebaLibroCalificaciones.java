/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cap7Arrays;

/**
 *
 * @author Julian
 */
public class PruebaLibroCalificaciones {
    public static void main(String args[]){
        // arreglo bidimencional de calificaciones
        int arregloCalif[][] = {
            {87,96,70},
            {87,96,71},
            {87,96,72},
            {87,96,73},
            {87,96,74},
            {87,96,75},
            {87,96,76},
            {87,96,77},
            {87,96,78},
            {87,96,79}        }; // fin de arreglo
        
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones(
        "CS101 introduccciona a la programacion en java", arregloCalif);
        miLibroCalificaciones.mostrarMensaje();
        miLibroCalificaciones.procesaCalificaciones();
    }// fin de main
}// fin de la clase
