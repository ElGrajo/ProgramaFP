/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programejos;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class laSumaDeLasCifras {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int dato = sc.nextInt();
        while( dato > 0 ){
            
           int resto = dato % 9;
           dato = dato - resto;
           int cuantos9 = dato/9;
           String respuesta = "";

    	if(dato > 0){
    		int i;
    		for (i = 0; i < cuantos9; ++i) {
    			respuesta += "9";
                }
    	}
        
        if(resto>0){
            respuesta = resto + respuesta;
        }
        
        System.out.println(respuesta);
            
          /*  int total = 0;
            int unidad = 1;
            while(dato > 0){
                
                if((dato) <= 9 ){
                    total = total + (dato * unidad);
                }
                else{
                    total = total + ( unidad * 9);
                }
                dato -= 9;
                unidad *= 10;
            }
            System.out.println(total);*/
        dato = sc.nextInt();
        }//sale del programa sin hacer nada.        
    }
}
