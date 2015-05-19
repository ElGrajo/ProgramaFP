package consolaOriginal;

/**
 *
 * Clase consola, padre de PlayStatio y Xbox
 */
public class Consola {
    private boolean ocupado;
    private Juego juegoActual;

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
         return "Estoy jugando al" + juegoActual;
        }else{
         return "Introduce primero un juego";
        }
    }
   
}
