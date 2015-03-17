/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagui;

import static java.lang.Math.*;

/**
 *
 * @author Julian
 */
public class NewClass {
    public static void main(String[]args){
        String a = "ahora es ";
        String b = "el momento";
        String c = "para";
        
        System.out.println(a.length());
        System.out.println(a.charAt(4));
        System.out.println(a.substring(2,5));
        System.out.println(b.startsWith("el"));
        System.out.println(a.indexOf("es"));
        System.out.println(a.concat(c));
        System.out.println(b.replace('m','M'));
        System.out.println(a.split(" ")[0]);
        System.out.println(a.split(" ")[1]);
        System.out.println(b.equals(c));
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));

        double [] numeros = {2.3, 2.5, 6, 8 , 9 };
        /*Matematicas*/
        /* import static java.lang.Math.*;*/
        double numero = abs(48.5); //Valor absoluto
        numero = max(23, 34); // El mayor de dos valores
        numero = min(23, 34); // El minimo de dos valores
        numero = exp(48.5);
        numero = log(10);//Logaritmo en base natural
        numero = pow(3,3);//El primer numero elevado al segundo
        numero = round(2.444444); //
        numero = sqrt(25);
        
    }
}
