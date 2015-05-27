package restarurantes;

/**
 *
 * @author Usuario
 */
public class Restarurantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Restarurante Luiggi = new Pizzeria("Luiggi", "Pepe", "Santa EnGracia 12");
        Pizzeria MammaLucia = new Pizzeria("MammaLucia", "Cacho", "Rio 13");
        Restarurante Napoles = new Pizzeria();
        Restarurante Rialto = new Pizzeria();
        Restarurante Milano = new Pizzeria();
        Restarurante OhSoleMio = new Pizzeria();
        System.out.println("Total pizzerias: " + Pizzeria.getTotalPizzerias());
        
        Trabajador Marcelo = new Trabajador("Marcelo", 30, "SiempreViva 15");
        MammaLucia.darAltaTrabajador(MammaLucia.getTrabajadoresPizzeria());
        
        //Probando el downcasting
        if(Luiggi instanceof Pizzeria){
         Luiggi.darAltaTrabajador(((Pizzeria)Luiggi).getTrabajadoresPizzeria());
        }
       
        
    }    
}
