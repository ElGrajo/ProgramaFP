/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cap7Arrays;

/**
 *
 * @author Julian
 */
public class PruebaPaqueteDeCartas {
    //ejecuta la aplicacion
    public static void main(String args[]){
        PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
        miPaqueteDeCartas.barajar();// coloca las cartas en orden aleatorio
        
        // imprime las 52 cartas en el orden que fueron repartidas
        for (int i = 0; i < 13; i++){
            System.out.printf("%-20s%-20s%-20s%-20s\n",
                miPaqueteDeCartas.repartirCarta(), miPaqueteDeCartas.repartirCarta(),
                miPaqueteDeCartas.repartirCarta(), miPaqueteDeCartas.repartirCarta());
        }// fin del for        
    }// fin del main
}// fin de la clase
