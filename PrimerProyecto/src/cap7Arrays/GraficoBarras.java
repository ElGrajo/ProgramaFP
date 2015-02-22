/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cap7Arrays;

/**
 *
 * @author Julian
 * para probar el array y hacer algunos asteriscos
 */
public class GraficoBarras {
    public static void main (String args[]){
        int arreglo[] = {0,0,0,0,0,0,1,2,4,2,1};
        
        System.out.println("Distribucion de calificaciones:");
        
        // para cada elemento del arreglo, imprime una barra
        for(int contador = 0; contador < arreglo.length; contador++)
        {
            // imprime la etiqueta del costado
            if(contador==10){
                System.out.printf("%5d: ", 100);
            } 
            else {
                System.out.printf("%02d-%02d: ",
                        contador * 10, contador * 10 + 9);
            }
            //imprime barra de asteriscos
            // toma los int del arreglo para dar las vueltas del for !
            for (int estrellas = 0; estrellas<arreglo[contador]; estrellas++)
                System.out.print("*");
            
            System.out.println(); // inicia una nueva linea de salida
        }// fin del for
        
    }// fin del main
}// fin del graficoBarras
