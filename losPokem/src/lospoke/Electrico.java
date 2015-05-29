package lospoke;

/**
 *
 * @author Julian
 */
public abstract class Electrico extends Pokemon{

    public Electrico(int energiaTotal, int ataque, int defensa, int velocidad, String nombre) {
        super(energiaTotal, ataque, defensa, velocidad, nombre);
    }
    @Override
    public void ataca(Pokemon enemigo){
        super.ataca(enemigo);
        int diferencia = this.getAtaque() - enemigo.getDefensa();
        if(diferencia<5)
            diferencia = 5;
        double dano = (Math.random() * diferencia);
        
        if(enemigo instanceof Tierra){
            dano = dano * 0.6;
        }else if(enemigo instanceof Agua){
            dano = dano * 1.3;
        }else{
        
        }

        enemigo.recibirGolpe((int)dano);
        if(!enemigo.isConciente())
            this.sumaExperiencia(enemigo.getEnergiaTotal());
    }    
}

class Pikachu extends Electrico{
    /**
     * El picachu por defecto se crea con estas caracteristicas
     */
    String nombre;
    public Pikachu(String nombre) {
        super(35, 55, 40, 90, nombre);
    }

    @Override
    public void ataqueEspecial(Pokemon enemigo) {
         System.out.println(this.getNombre() + " le lanza un rayo a " +
                enemigo.getNombre());
        enemigo.recibirGolpe(90);
    }

   

}//fin de clase pikachu

class Tynamo extends Electrico{
   String nombre;
    public Tynamo(String nombre) {
        super(35, 55, 40, 60, nombre);
    }

    @Override
    public void ataqueEspecial(Pokemon enemigo) {
        System.out.println(this.getNombre() + " le lanza una Onda Trueno a " +
                enemigo.getNombre());
        enemigo.recibirGolpe(90);
    }
}//fin de clase Tynamo