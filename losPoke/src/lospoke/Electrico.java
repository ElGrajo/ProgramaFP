package lospoke;

/**
 *
 * @author Julian
 */
public class Electrico extends Pokemon{

    public Electrico(int energiaTotal, int ataque, int defensa, int velocidad) {
        super(energiaTotal, ataque, defensa, velocidad);
    }
    @Override
    public void ataca(Pokemon enemigo){
        int diferencia = this.getAtaque() - enemigo.getDefensa();
        if(enemigo instanceof Tierra){
            
        }else if(enemigo instanceof Agua){
        
        }else{
        
        }
        if(diferencia<5)
            diferencia = 5;
        int dano = (int)(Math.random() * diferencia);
        enemigo.recibirGolpe(dano);
    }    
}

class Pikachu extends Electrico{
    /**
     * El picachu por defecto se crea con estas caracteristicas
     */
    String nombre;
    public Pikachu(String nombre) {
        super(35, 55, 40, 90);
        this.nombre = nombre;
    }

    @Override
    public void ataqueEspecial(Pokemon enemigo) {
        System.out.println("Le lanza un rayo!");
        enemigo.recibirGolpe(90);
        super.ataqueEspecial(enemigo);
    }

   

}//fin de clase pikachu

class Tynamo extends Electrico{
   String nombre;
    public Tynamo(String nombre) {
        super(35, 55, 40, 60);
        this.nombre = nombre;
    }

    @Override
    public void ataqueEspecial(Pokemon enemigo) {
        System.out.println("Le lanza una Onda Trueno!");
        enemigo.recibirGolpe(90);
        super.ataqueEspecial(enemigo);
    }
}//fin de clase Tynamo