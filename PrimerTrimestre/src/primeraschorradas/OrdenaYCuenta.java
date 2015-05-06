/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraschorradas;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class OrdenaYCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entradaDatos = new Scanner(System.in);
       
       int numeroMayor = 0;
       int numeroMenor = 0;
       int auxiliar = 0;
       int totalPares = 0;
       int totalImpares = 0;
       
       // Pide dos numeros
       System.out.println("Introduzca un numero:");
        numeroMayor = entradaDatos.nextInt();
        
       System.out.println("Introduzca otro numero:");
        numeroMenor = entradaDatos.nextInt();
              
       
       // Los ordena de mayor a menor
       if(numeroMayor < numeroMenor){
           auxiliar = numeroMayor;
           numeroMayor = numeroMenor;
           numeroMenor = auxiliar;
       }// fin del if
       
       //Cuenta los pares y los impares
        for (int i = numeroMenor; i <= numeroMayor; i++) {
            if(i % 2 == 0){
                totalPares = totalPares + 1;
            } else {
                totalImpares = totalImpares + 1;
            }// end if else
        }// end for
        
       //Muestra el resultado
        System.out.printf(
                "El numero mayor es %d y el menor %d:\n", numeroMayor, numeroMenor);
        System.out.println("El total de pares es:" + totalPares);
        System.out.println("El total de impares es:" + totalImpares);       
    }
    
}
