/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cap7Arrays.practicas;

/**
 *
 * @author Julian
 */
public class ReservadorDeAsientos {
    
    int cantidadAsientos = 10;
    private boolean asientos[] = new boolean[cantidadAsientos];
    
    public ReservadorDeAsientos(){
               for(int i = 0; i < cantidadAsientos; i++){
                   asientos[i] = false;
               } // for que pone todo a false
    }// final del constructor
   
    public boolean getEstaOcupado(int asiento){
        boolean respuesta = asientos[asiento];
        return respuesta;
    }// fin de estaLIbre
    
    public boolean reservarAsiento(int asiento){
        if (getEstaOcupado(asiento) == false){
            asientos[asiento] = true;
            return true;
        }
        else
            return false;
    }// fin de reservarAsiento
    /* Esta clase se podrá realizar cuando maneje mejor las colecciones
    public int[] getAsientosLibres(){
        int contadorInterno = 0;
        
        for(int i = 0; i < cantidadAsientos; i++){
            // primera vuelta para definir tamaño
            if(asientos[i]==false){
                contadorInterno++;
            }
        }// fin del for exterior
        // ahora con la cantidad hacemos el array
        
        int ListaAsientos[] = new int[contadorInterno];
        int contadorListaAsientos = 0;
        for(int i = 0; i < asientos.length; i++){
            
                if(asientos[i]==false)
                   ListaAsientos[contadorListaAsientos] = i;
                   contadorListaAsientos++;
        }// fin del for exterior
        return ListaAsientos;
    }// fin de getAsientosLibres
   */ 
}// final clase