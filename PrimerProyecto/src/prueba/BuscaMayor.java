/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba;

/**
 *
 * @author Julian
 */
import java.util.Scanner;
public class BuscaMayor {


    
    public static void main ( String args[]){
        
           int total = 0;
           int mayor = 0;
           int ingreso = 0;
   
        
        //obtiene la opcion del usuario
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba el total de numeros a ingresar: ");
        total = entrada.nextInt();
        
         for ( int i = 0; i < total; i++){
                System.out.print("Ingrese el número: ");
                ingreso = entrada.nextInt();
                if (ingreso > mayor) {
                    mayor = ingreso;
                }// fin del if
            }// fin del for
        
        
        if (total <= 0){
            System.out.println("No hay datos que mostrar");
        }
        else { 
           System.out.printf("El número mayor es: %d\n", mayor);
        } // fin del else
    }// fin del main
}// fin de buscaMayor
   

