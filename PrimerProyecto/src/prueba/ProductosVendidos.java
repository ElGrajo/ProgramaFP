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
public class ProductosVendidos {
    public static void main(String args[]){
        int producto;
        double total = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Elija el número de producto o -1 para salir: ");
        producto = entrada.nextInt();
        
        while (producto != -1) {

            switch (producto){
                case 1:
                    total += 2.98;
                    break;
                case 2:
                    total += 4.50;
                    break;
                case 3:
                    total += 9.98;
                    break;
                case 4:
                    total += 4.49;
                    break;
                case 5:
                    total += 6.87;
                    break;
                default:
                    break;
          }// fin del switch
            
       System.out.print("Elija el número de producto o -1 para salir: ");
        producto = entrada.nextInt();
            
        } // fin del while
        System.out.printf("El total a pagar es: %.2f\n", total);
            
    }// fin del main
}
