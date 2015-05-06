/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author DAM1
 */
public class pruebaVoid {
    
    public static void main (String[] args) {
        System.out.print("La nota es: ");
         imprimirNota (82.3) ;
         System.out.print("La nota es: ");
         imprimirNota (42.8) ;
    }
    
    
    public static void imprimirNota(double nota) {
        if (nota >= 90.0) {
            System.out.println("Sobresaliente");
        }else if (nota >= 80.0) {
            System.out.println("Notable");
        } else if (nota>= 70.0) {
            System.out.println("Bien");
        } else if (nota>= 60.0) {
            System.out.println("Suficiente");
        } else {
            System.out .println ("Suspense ") ;
        }
    }// final de imprmirNota
    
    public static String imprimirNota2(double nota) {
        if (nota >= 90.0) {
            return "Sobresaliente";
        }else if (nota >= 80.0) {
            return "Notable";
        } else if (nota>= 70.0) {
            return "Bien";
        } else if (nota>= 60.0) {
            return "Suficiente";
        } else {
            return "Suspense ";
        }
    }// final de imprmirNota2

}
