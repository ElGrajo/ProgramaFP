/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lospoke;

import java.util.ArrayList;

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
        Pokemon MiZy = new Zygarde("LaSuperSerpiente");
        ArrayList<Pokemon> misPoke = new ArrayList();
        misPoke.add(MiPika);
        misPoke.add(MiTynamo);
        misPoke.add(MiZy);
        misPoke.add(new Excadrill("Terrero"));
        misPoke.get(0).ataca(misPoke.get(3));
        System.out.println(misPoke.get(3).energia());
        misPoke.get(1).ataqueEspecial(misPoke.get(3));
        System.out.println(misPoke.get(3).energia());
        misPoke.get(2).ataqueEspecial(misPoke.get(3));
/*        System.out.println(MiPika.getEnergiaActual());
        System.out.println(MiTynamo.getEnergiaActual());
        MiZy.ataqueEspecial(MiTynamo);
        System.out.println(MiTynamo.getEnergiaActual());
        System.out.println(MiZy.energia());*/
    }
}
