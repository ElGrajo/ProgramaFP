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
public class Pokemon {
   private int energiaTotal;
   private int energiaActual;
   private int ataque;
   private int defensa;
   private int velocidad;
   private int experiencia;
   private int nivel;
   private boolean estaConciente;
   
   Pokemon(){}

    public Pokemon(int energiaTotal, int ataque, int defensa, int velocidad) {
        this.energiaTotal = energiaTotal;
        this.energiaActual = energiaTotal;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
    }
   
   
   public void ataca(Pokemon enemigo){
   }
   public void ataqueEspecial(Pokemon enemigo){
       this.recibirGolpe(15);//cada vez que se usa el poder se resta
   }
   
   public String energia(){
       return "";
   }
    public int getEnergiaTotal() {
        return energiaTotal;
    }

    public int getEnergiaActual() {
        return energiaActual;
    }
    
    public void recibirGolpe(int golpe) {
        this.energiaActual -= golpe;
        if(energiaActual<= 0){
            energiaActual = 0;
            estaConciente = false;
            System.out.println("Ha quedado inconciente");
        }
    }
    
    public String curarse(){
        energiaActual += 10;
        if(energiaActual>=energiaTotal){
            energiaActual = energiaTotal;
            return "Se ha curado por completo";
        }else{
            return "Ha recuperado 10 puntos";
        }
            
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getExperiencia() {
        return experiencia;
    }

    /**
     * Aumenta la experiencia 
     * @param experiencia 
     */
    public void sumaExperiencia(int experiencia) {
        this.experiencia = this.experiencia + experiencia;
        
    }

    public int getNivel() {
        return nivel;
    }
}
