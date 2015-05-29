package lospoke;

/**
 * @author Julian
 */
public abstract class Tierra extends Pokemon{

    public Tierra(int energiaTotal, int ataque, int defensa, int velocidad, String nombre) {
        super(energiaTotal, ataque, defensa, velocidad, nombre);
    }
    @Override
    public void ataca(Pokemon enemigo){
        super.ataca(enemigo);
        int diferencia = this.getAtaque() - enemigo.getDefensa();
     
        double dano = (Math.random() * diferencia);
        
        if(enemigo instanceof Electrico){
            dano = dano * 0.5;
        }else if(enemigo instanceof Agua){
            dano = dano * 1.3;
        }else{ }
        enemigo.recibirGolpe((int)dano);
         
        if(!enemigo.isConciente())
            this.sumaExperiencia(enemigo.getEnergiaTotal());
    }    
}

class Excadrill extends Tierra{
    /**
     * El Excadrill por defecto se crea con estas caracteristicas
     */
    public Excadrill(String nombre) {
        super(110, 135, 60, 88, nombre);
        this.setNombre(nombre);
    }

    @Override
    public void ataqueEspecial(Pokemon enemigo) {
        System.out.println(this.getNombre() + " se pone a taladrar!");
        this.recibirGolpe(15);//penalizacion por usar el poder
        enemigo.recibirGolpe(90);
    }
         
}//fin de clase Excadrill

class Zygarde extends Tierra{
   String nombre;
    public Zygarde(String nombre) {
        super(108, 100, 121, 95, nombre);
    }
    
    @Override
    public void ataqueEspecial(Pokemon enemigo) {
        System.out.println(this.getNombre() + " mueve la tierra");
        enemigo.recibirGolpe(70);
        
        if(!enemigo.isConciente())
            this.sumaExperiencia(enemigo.getEnergiaTotal());
    }
}//fin de clase Zygarde
