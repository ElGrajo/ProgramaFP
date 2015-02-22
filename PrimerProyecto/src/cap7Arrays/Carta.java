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
public class Carta {
    private String cara; // cara de la carta
    private String palo; // palo de la carta
    
    // el constructor de dos argumentos inicializa la carta
    public Carta(String caraCarta, String paloCarta){
        cara = caraCarta;
        palo = paloCarta;
    }// fin constructor
    
    // devuelve representacion String de la carta
    public String toString(){
        return cara + " de " + palo;
    }// fin del metodo toString
}
