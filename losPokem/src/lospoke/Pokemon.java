package lospoke;

/**
 *
 * @author Julian
 */
public abstract class Pokemon {
   private int energiaTotal;
   private int energiaActual;
   private int ataque;
   private int defensa;
   private int velocidad;
   private int experiencia;
   private int nivel = 1;
   private boolean conciente = true;
   private String nombre;


   
   Pokemon(){}
/**
 * Y además aparece la clase nieta y el nombre 
 * @param energiaTotal
 * @param ataque
 * @param defensa
 * @param velocidad
 * @param nombre 
 */
    public Pokemon(int energiaTotal, int ataque, int defensa, int velocidad, String nombre) {
        this.energiaTotal = energiaTotal;
        this.energiaActual = energiaTotal;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.nombre = nombre;
       System.out.println(nombre + " es un "+ this.getClass().getSimpleName()+" y ha sido invocado.");
    }
   
   
    //Mensajito por consola
   public void ataca(Pokemon enemigo){
       System.out.println(nombre + " ataca a " + enemigo.getNombre());
   }
   /**
    * Metodo abstracto que se desarrolla en las clases nietas.
    * @param enemigo 
    */
   public abstract void ataqueEspecial(Pokemon enemigo);
   
   public String energia(){
       return nombre + " tiene " + energiaActual + " puntos";
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
            conciente = false;
            System.out.println(this.getNombre() + " ha quedado inconciente");
        }
    }
    
    public String curarse(){
        energiaActual += 10;
        if(energiaActual>=energiaTotal){
            energiaActual = energiaTotal;
            return this.nombre + " se ha curado por completo";
        }else{
            return this.nombre + " a recuperado 10 puntos";
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

        public boolean isConciente() {
        return conciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Aumenta la experiencia 
     * @param experiencia 
     */
    public void sumaExperiencia(int experiencia) {
        this.experiencia = this.experiencia + experiencia;
        if(this.experiencia / 100 > this.nivel)
            this.setNivel(this.experiencia / 100);
        
        System.out.println("La experiencia de " + nombre + " es " + this.experiencia);
        
    }

    public int getNivel() {
        return nivel;
    }
    
    private void setNivel(int actual){
        int aumento = (actual - this.nivel) * 10; 
        this.nivel = actual;
        this.energiaTotal += aumento;
        this.ataque += aumento;
        this.defensa += aumento;
        this.velocidad += aumento;
    }
}
