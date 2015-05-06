package Boletin2;

/**
 *
 * @author Julian Gawron
 */
public class Ej1separaCifras {
  /*
    1. Realizar un programa que lea un número de 3 cifras y 
    muestre sus cifras por separado.
    Ej:. Leemos 571 y mostramos 5, 7 y 1 por separado
    */

    public static void main( String args[] )
    {
        //Declaracion de variables
        int cifra = 157;
        int centena = 0;
        int decena = 0;
        int unidad = 0;
        
        //Calculo de cada cifra
        centena = (cifra/100);
        decena = (cifra - (centena * 100))/ 10;
        unidad = (cifra - (centena * 100) - (decena * 10));
        
        //Salida
        System.out.printf("La cifra es %d, y tiene %d centenas, %d decenas"
                + " y %d unidades", 
                cifra, centena, decena, unidad);
        
        
     } // fin de main
}  // fin de la clase separaCifras
