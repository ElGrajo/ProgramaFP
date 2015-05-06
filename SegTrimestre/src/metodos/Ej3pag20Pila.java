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
public class Ej3pag20Pila {
    public static void main(String[] args) {
    // Initialize times
        int times = 3;
        System.out.println("Before the call,"
        + " variable times is " + times);
    // Invoke nPrintln and display times
        nPrintln("Welcome to Java!", times);
        System.out.println("After the call,"
        + " variable times is " + times);
    }//fin del main
     // Print the message n times
    public static void nPrintln(String message, int n) {
        while (n > 0) {
            System.out.println("n = " + n);
            System.out.println(message);
            n--;
        }
    }
}

