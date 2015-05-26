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
        Restarurante MammaLucia = new Pizzeria("MammaLucia", "Cacho", "Rio 13");
        System.out.println(Pizzeria.getTotalPizzerias());
       // MammaLucia.meterTrabajador(getTrabajadoresPizzeria());
    }    
}
