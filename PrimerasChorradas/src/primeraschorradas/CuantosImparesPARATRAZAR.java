/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraschorradas;

/**
 *
 * @author Usuario
 */
public class CuantosImparesPARATRAZAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 100;
        int contador = 0;

        while (numero >= 0) {
            if (numero % 2 == 1) {//el número es impar
                System.out.println("El número " + numero + " es impar");
                contador++;     
            }// fin del if
            numero--;
        }// fin del while
        System.out.println("El número de cifras impares es: " + contador);
    }// fin del main

} // fin de clase
