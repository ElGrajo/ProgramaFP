/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolaENUM;


/**
 *
 * @author dam2
 */
public class Test {
    public static void main (String args[]){
    
        Consola miPlay = new Consola();
        
        Juego nuevoJuego = new Juego(45,"FIFA", new java.util.Date());
        Juego nuevoJuego2 = new Juego(45,"MineCraft", new java.util.Date());
        Juego nuevoJuego3 = new Juego(45,"Grand Theaf", new java.util.Date());
        Juego nuevoJuego4 = new Juego(45,"Destiny", new java.util.Date());
        
        Juego [] misJuegosCompatibles = {
        nuevoJuego, nuevoJuego2, nuevoJuego3, nuevoJuego4
        };
        
        //Otra Consola
        Consola miXbox = new Consola(misJuegosCompatibles, Consolas.XBOX);
        
        miPlay.setTipoConsola(Consolas.PLAYSTATION);
        miPlay.definirJuegosCompatibles(misJuegosCompatibles);
        miPlay.introducirJuego(nuevoJuego);
        System.out.println(miPlay.isOcupado());
        System.out.println(miPlay.esCompatible("Destiny")); // 1
        System.out.println(miPlay.jugar()); // Jugando a ...
        miPlay.sacarJuego();
        System.out.println(miPlay.isOcupado()); // false
    }
}
