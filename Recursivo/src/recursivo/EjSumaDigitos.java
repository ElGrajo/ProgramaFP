/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivo;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class EjSumaDigitos {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        while(numero != 0){
        String respuesta = numeritos(numero)+ SumaDigitos(numero);
        System.out.println(respuesta);
        numero = sc.nextInt();
        }
    }
    
    public static int SumaDigitos(int numero){
        if(numero<0)
            return -1;
        if(numero<10){
            return numero;
        }else{
            return(SumaDigitos(numero/10) + numero%10);
        }
    }
    
    public static String numeritos(int numero){

        String miNumero = Integer.toString(numero);
        String respuesta = miNumero.charAt(0) + " + ";         
        for (int i = 1; i < miNumero.length()-1; i++) {
            respuesta = respuesta + miNumero.charAt(i) + " + ";
        }
        respuesta = respuesta + miNumero.charAt(miNumero.length()-1) + " = ";
        return respuesta;
    }
}
