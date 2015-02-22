/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cap07Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Ej0719Prueba {
   
   
   
   public static void main(String args[]){
        Ej0719 miReservador = new Ej0719();
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0; i < 6; i++){
        System.out.print("Si quiere un asiento en primera pulse 1, sino 2:");
        int categoria = entrada.nextInt();
        
        boolean Reservado = miReservador.buscarReserva(categoria);
        if (Reservado == false && categoria== 2){
            System.out.print("Si esea reservar un lugar en primera, "
                    + "ingrese 1.");
            categoria = entrada.nextInt();
            if(categoria == 1){
                miReservador.buscarReserva(1);}
            else{ System.out.print("Lo sentimos el proximo avion,"
                    + " sale en tres horas\n");}
        }// fin del if
       }// fin del for
    }// fin del main
}
