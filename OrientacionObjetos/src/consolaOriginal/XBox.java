package consolaOriginal;

/**
 *
 * @author dam2
 */
public class XBox extends Consola{
    private Juego juegoActual;
    private Juego[] misJuegos;
    
    public XBox(){
    }
    public XBox(Juego juegoActual){
     super.introducirJuego(juegoActual);
    }

    /**
     * Define los juegos compatibles solo una vez.
     * @param losJuegos 
     */
    public void definirJuegosCompatibles(Juego[] losJuegos){
        if(misJuegos == null){
          misJuegos = losJuegos;
        } 
    }
    /**
     * 
     * @param Juego
     * @return 1 si es compatible, -1 si no lo es, y -2 si no tiene 
     * juegos definidos
     */
    public int esCompatible(String Juego){
     if(misJuegos != null){
         for (int i = 0; i < misJuegos.length; i++) {
             if(misJuegos[i].getTitulo().equals(Juego))
                 return 1;
         }
         return -1;}
     else
         return -2;
    }
    
    /**
     * Se sobreescribe jugar() para que tenga el tipo de consola.
     * @return 
     */

    @Override
    public String jugar() {
        if(super.isOcupado())
            return "Estoy jugado " + juegoActual.getTitulo()
                    + " en la Xbox";
        else
            return "Introduce primer un juego";
    }
    
    /**
     * Verifica que es compatible con los datos ingresado
     * @param miJuego 
     */
    @Override
    public void introducirJuego(Juego miJuego) {
        if(esCompatible(miJuego.getTitulo())==1)
            super.introducirJuego(miJuego);
    }
    
}
