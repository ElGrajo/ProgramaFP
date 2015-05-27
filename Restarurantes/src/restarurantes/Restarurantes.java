package restarurantes;

import java.util.ArrayList;

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
        Chino Bruce_Lee = new Chino("Bruce Lee", "Chung Lee", "Rio 13");
        Restarurante Napoles = new Pizzeria();
        Restarurante Rialto = new Pizzeria();
        Restarurante Milano = new Pizzeria();
        Restarurante OhSoleMio = new Pizzeria();
        System.out.println("Total pizzerias: " + Pizzeria.getTotalPizzerias());
        
        ArrayList<Restarurante> Restaurantes = new ArrayList();
        Restaurantes.add(MammaLucia);
        Restaurantes.add(Luiggi);
        Restaurantes.add(Bruce_Lee);
        //Recorremos el arrayList Restaurantes probando Polimorfismo
        for(Restarurante miRestaurant : Restaurantes){
            System.out.println(miRestaurant.mostrarInformacion());
        }
        
 
        MammaLucia.darAltaTrabajador(MammaLucia.getTrabajadoresPizzeria());
        MammaLucia.darAltaTrabajador(MammaLucia.getTrabajadoresPizzeria());
        MammaLucia.darAltaTrabajador(MammaLucia.getTrabajadoresPizzeria());
        MammaLucia.darAltaTrabajador(MammaLucia.getTrabajadoresPizzeria());
        MammaLucia.darAltaTrabajador(MammaLucia.getTrabajadoresPizzeria());
        
        //Probando el downcasting
        if(Luiggi instanceof Pizzeria){
         Luiggi.darAltaTrabajador(((Pizzeria)Luiggi).getTrabajadoresPizzeria());
        }
       
        //Recorremos los trabajadores de la pizzeria
        for (Trabajador trabajador : MammaLucia.getTrabajadoresPizzeria()) {
            System.out.println(trabajador.getNombre() + " " + trabajador.getEdad());
        }
        

    }    
}
