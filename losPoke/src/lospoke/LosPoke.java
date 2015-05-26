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
public class LosPoke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Dando vida a los poquemones
        Pokemon MiPika = new Pikachu("MiPika");
        Pokemon MiTynamo = new Tynamo("MiBixo");
        Pokemon MiZy = new Zygarde("OtroBicho");
        MiTynamo.ataca(MiPika);
        System.out.println(MiPika.getEnergiaActual());
        System.out.println(MiTynamo.getEnergiaActual());
        MiZy.ataqueEspecial(MiTynamo);
        System.out.println(MiTynamo.getEnergiaActual());
        System.out.println(MiZy.energia());
    }
    
}
