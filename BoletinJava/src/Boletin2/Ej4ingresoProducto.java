package Boletin2;

import java.util.Scanner;

/**
 *
 * @author Julian Gawron
 */
public class Ej4ingresoProducto {
    /*
    4.	Realizar un algoritmo que calcule el importe de una venta de un artículo
    en un supermercado. El usuario debe indicar el nombre del producto, el 
    precio por unidad y el número de unidades vendidas, y el algoritmo mostrará 
    por pantalla el nombre del producto, el número de unidades vendidas y el 
    precio total. Debe prestarse especial atención al tipo de datos que resulta 
    más adecuado para representar cada cantidad y leerla por teclado.
    */
    public static void main( String args[] ){
    String nombreProducto;
    float precioUnidad;
    short cantidadVendida;
    float precioFinal;
    
    Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del producto:");
    nombreProducto= entrada.nextLine();
    System.out.print("Precio del producto:");
    precioUnidad = entrada.nextFloat();
        System.out.print("Cantidad Vendida:");
    cantidadVendida = entrada.nextShort();
    precioFinal = precioUnidad * cantidadVendida;
    
        System.out.printf("Se vendieron %d %s y se obtuvieron %.2f euros.",
                cantidadVendida, nombreProducto,  precioFinal);
    
    }// fin del main   
}// fin de la clase
