/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerdatos;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class LeerDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Esta linea nos permite leer datos del usuario
        Scanner entradaDatos = new Scanner(System.in);
        int numero_1, numero_2, numero_3, media;
        System.out.print("Introduzca tres numeros:");
        numero_1 = entradaDatos.nextInt();
        numero_2 = entradaDatos.nextInt();
        numero_3 = entradaDatos.nextInt();
        
        media = (numero_1 + numero_2 + numero_3) / 3;
        
        System.out.printf(
                "\nLos numeros introducidos son: %d, %d, %d\n", 
                numero_1, numero_2, numero_3);
        System.out.println("La media es:" + media);
        
        double resultado;
        double pi = 3.14159;
        resultado = 2 * pi * media;
        System.out.println("la longitud es:" + resultado);
        
    }
    
}
