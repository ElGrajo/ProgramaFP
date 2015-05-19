package consolaENUM;

/**
 *
 * Clase consola, pero sin Herencia y utilizando ENUM
 */
public class Consola {
    private boolean ocupado;
    private Juego juegoActual;
    private Juego[] misJuegos;
    private Consolas tipoConsola;

    public Consola(){}
    public Consola(Juego[] misJuegos, Consolas tipoConsola) {
        this.misJuegos = misJuegos;
        this.tipoConsola = tipoConsola;
    }

    public Consolas getTipoConsola() {
        return tipoConsola;
    }

    public void setTipoConsola(Consolas tipoConsola) {
        this.tipoConsola = tipoConsola;
    }
    

    public String getJuegoActual() {
        return juegoActual.getTitulo();
    }

    public boolean isOcupado() {
        return ocupado;
    }

    /**
     * Pone ocupado a True y enlaza juegoActual al juego introducido
     * @param miJuego 
     */
    public void introducirJuego(Juego miJuego){
        this.ocupado = true;
        juegoActual = miJuego;
    }
    
    /**
     * Ocupado a false y juegoActual a Null
     */
    public void sacarJuego(){
      juegoActual = null;
      this.ocupado = false;
    }
    
    public String jugar(){
        if(ocupado){
         return "Estoy jugando al " + juegoActual + " en mi " + tipoConsola;
        }else{
         return "Introduce primero un juego";
        }
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
}