
package lospoke;

/**
 *
 * @author Julian
 */
public abstract class Agua extends Pokemon{

    public Agua(int energiaTotal, int ataque, int defensa, int velocidad, String nombre) {
        super(energiaTotal, ataque, defensa, velocidad, nombre);
    }
    @Override
    public void ataca(Pokemon enemigo){
        super.ataca(enemigo);
        int diferencia = this.getAtaque() - enemigo.getDefensa();
         if(diferencia<5)
            diferencia = 5;
        double dano = (Math.random() * diferencia);
        
        if(enemigo instanceof Electrico){
            dano = dano * 0.5;
        }else if(enemigo instanceof Tierra){
            dano = dano * 1.3;
        }else{ }
        enemigo.recibirGolpe((int)dano);
                if(!enemigo.isConciente())
            this.sumaExperiencia(enemigo.getEnergiaTotal());
    }    
}

class Wartortle extends Agua{
    /**
     * El Wartortle por defecto se crea con estas caracteristicas
     */
    String nombre;
    public Wartortle(String nombre) {
        super(59, 63, 80, 58, nombre);
        this.nombre = nombre;
    }

    @Override
    public void ataqueEspecial(Pokemon enemigo) {
        System.out.println("Le da con su AquaCola !");
        enemigo.recibirGolpe(90);
    }

   

}//fin de clase Wartortle

class Psyduck extends Agua{
   String nombre;
    public Psyduck(String nombre) {
        super(50, 52, 48, 55, nombre);
    }

    @Override
    public void ataqueEspecial(Pokemon enemigo) {
        System.out.println("Lo deja frito con su poder!");
        enemigo.recibirGolpe(90);
    }
}//fin de clase Psyduck
