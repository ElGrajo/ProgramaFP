/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lospoke;

/**
 *
 * @author Julian
 */
public class Agua extends Pokemon{

    public Agua(int energiaTotal, int ataque, int defensa, int velocidad) {
        super(energiaTotal, ataque, defensa, velocidad);
    }
    @Override
    public void ataca(Pokemon enemigo){
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
    }    
}

class Wartortle extends Agua{
    /**
     * El Wartortle por defecto se crea con estas caracteristicas
     */
    String nombre;
    public Wartortle(String nombre) {
        super(59, 63, 80, 58);
        this.nombre = nombre;
    }

    @Override
    public void ataqueEspecial(Pokemon enemigo) {
        System.out.println("Le da con su AquaCola !");
        enemigo.recibirGolpe(90);
        super.ataqueEspecial(enemigo);
    }

   

}//fin de clase Wartortle

class Psyduck extends Agua{
   String nombre;
    public Psyduck(String nombre) {
        super(50, 52, 48, 55);
        this.nombre = nombre;
    }

    @Override
    public void ataqueEspecial(Pokemon enemigo) {
        System.out.println("Lo deja frito con su poder!");
        enemigo.recibirGolpe(90);
        super.ataqueEspecial(enemigo);
    }
}//fin de clase Psyduck
