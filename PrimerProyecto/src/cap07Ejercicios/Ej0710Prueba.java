/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cap07Ejercicios;

/**
 *
 * @author Julian
 */
import java.util.Scanner;

public class Ej0710Prueba {
    public static void main(String args[]){
        //Inicia los objetos y las variables
        Ej0710 miContador = new Ej0710();
        Scanner entrada = new Scanner(System.in);
        int ganancia = 0;
        
        // comienza el bucle buscando datos.
        do{
            System.out.print("Ingrese la ganancia del empleado: ");
            ganancia = entrada.nextInt();
            miContador.agregarTrabajador(ganancia);
            miContador.mostrarResultados();
        }while(ganancia != -1);
        
        
    }// fin del main
}
