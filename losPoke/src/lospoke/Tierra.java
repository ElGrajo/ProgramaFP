package lospoke;

/**
 * @author Julian
 */
public class Tierra extends Pokemon{

    public Tierra(int energiaTotal, int ataque, int defensa, int velocidad) {
        super(energiaTotal, ataque, defensa, velocidad);
    }
    @Override
    public void ataca(Pokemon enemigo){
        int diferencia = this.getAtaque() - enemigo.getDefensa();
        if(enemigo instanceof Electrico){
            
        }else if(enemigo instanceof Agua){
        
        }else{
        
        }
        if(diferencia<5)
            diferencia = 5;
        int dano = (int)(Math.random() * diferencia);
        enemigo.recibirGolpe(dano);
    }    
}

class Excadrill extends Tierra{
    /**
     * El Excadrill por defecto se crea con estas caracteristicas
     */
    String nombre;
    public Excadrill(String nombre) {
        super(110, 135, 60, 88);
        this.nombre = nombre;
    }

    @Override
    public void ataqueEspecial(Pokemon enemigo) {
        System.out.println(nombre + " se pone a taladrar!");
        enemigo.recibirGolpe(90);
        super.ataqueEspecial(enemigo);
    }
        
}//fin de clase Excadrill

class Zygarde extends Tierra{
   String nombre;
    public Zygarde(String nombre) {
        super(108, 100, 121, 95);
        this.nombre = nombre;
    }
    
    public String energia(){
     return nombre + " todavia tiene " + getEnergiaActual() + " puntos.";
    }
    
    @Override
    public void ataqueEspecial(Pokemon enemigo) {
        System.out.println(nombre + " mueve la tierra");
        enemigo.recibirGolpe(70);
        super.ataqueEspecial(enemigo);
    }
}//fin de clase Zygarde
