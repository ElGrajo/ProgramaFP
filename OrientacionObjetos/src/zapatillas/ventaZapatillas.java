package zapatillas;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class ventaZapatillas {
    private int totalInicial = 30; //Cantidad de zapatillas
    private int ventaTarjeta = 10;
    private String[] Marcas;
    private int descuentos[][];
    
    public ventaZapatillas() {
    }
    
    public int tieneMarca(String marca){
               //comprueba que la marca existe y da su posicion
       int miMarca = -1;
       int i;
        for (i = 0; i < Marcas.length; i++) {
            if(Marcas[i].equals(marca)){
                miMarca = i;
                break;
            }    
        }
       if (miMarca==-1)
           return -1;
       else
           return miMarca;
    }
    
    public ventaZapatillas(int totalInicial, int ventaTarjeta){
        this.totalInicial = totalInicial;
        this.ventaTarjeta = ventaTarjeta;
    }
    public boolean cargarDatos(String ruta){
        int lineas = 0;
        try {
           File archivo = new File(ruta);
           Scanner leer = new Scanner(archivo);
           while(leer.hasNext()){
               leer.nextLine();
               lineas++;
           }
           Marcas = new String[lineas];
           descuentos = new int[lineas][3];
           archivo = null;
           leer.close();
           
           File archivo2 = new File(ruta);
           Scanner leer2 = new Scanner(archivo2);
           for (int i = 0; i < Marcas.length ; i++) {
               String actual = leer2.nextLine();
               String[] lineaActual = actual.split(",");
               Marcas[i] = lineaActual[0];
               descuentos[i][0] = Integer.parseInt(lineaActual[1]);
               descuentos[i][1] = Integer.parseInt(lineaActual[2]);
               descuentos[i][2] = Integer.parseInt(lineaActual[3]);
           } 
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
    private int descuento(String Marca, int unidades){
    
       //comprueba que la marca existe y da su posicion
       
       int miMarca = tieneMarca(Marca);
       if (miMarca==-1)
           return 0;
       
       //Busca el valor del descuento por la posicion obtenida antes
       if(unidades==1)
        return descuentos[miMarca][0];
       else if (unidades==2)
        return descuentos[miMarca][1];
       else if (unidades>2)
        return descuentos[miMarca][2];
       else
        return 0;//llegaría aqui si es menor que 1.
    }
    
    //
    double venta(String Marca, int unidades, int precio, boolean efectivo){
        //Esto chequea que queden zapatillas
        if(mostrarInventario()<1 || (totalInicial - unidades)<1 || tieneMarca(Marca)==-1)
            return 0;
        
        double precioFinal = precio * unidades;
        
        precioFinal = precioFinal - precioFinal*(double)(descuento(Marca, unidades))/100;
        if(!efectivo)
            ventaTarjeta--;
        totalInicial -= unidades;
    return precioFinal;
    }
    
    public int mostrarInventario(){
        return totalInicial;
    }
    public int mostrarVentasTarjRestantes(){
        return ventaTarjeta;
    }
}

           