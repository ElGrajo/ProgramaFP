/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cap07Ejercicios;

/**
 *
 * @author Julian
 */
public class Ej0712Prueba {
    public static void main(String args[]){
        Ej0712 misNumeritos = new Ej0712();
        
        misNumeritos.Mensaje1();
        for(int i = 0; i < 5; i++){
             misNumeritos.Siguiente();
             misNumeritos.imprimeResultados();
        }
       
    }
}
