/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraschorradas;

/**
 *
 * @author DAM1
 */
public class CuentaYSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         ALGORITMO cuenta_y_suma CON WHILE
         VAR
         entero: pares, impares, numero
         INICIO
         pares, impares <- 0
         numero <-1
         mientras (numero <= 100) hacer
         si (numero MOD 2 = 0) entonces
         pares <- pares + numero	
         si_no	//suponemos que es impar
         impares <- impares + numero
         fin_si
         numero <- numero +1
         fin_mientras
         FIN
        
        
         
        int pares;
        int impares;
        int numero;
        numero = 1;
        pares = 0;
        impares = 0;

        while (numero <= 100) {
            if (numero % 2 == 0) {
                pares = pares + numero;
            } else {
                impares = impares + numero;
            }// fin del if else
            numero = numero + 1;
        }// fin del while

        System.out.printf(
                "El total de pares es %d y el de impares %d", pares, impares);
                */
        
        /*
        ALGORITMO cuenta_y_suma CON FOR

        VAR
	 entero: pares, impares, numero
        INICIO
	 pares, impares <- 0
	 desde numero<-1 hasta 100 incremento 1 hacer
		si (numero MOD 2 = 0) entonces
			pares <- pares + numero	
		si_no	//suponemos que es impar
			impares <- impares + numero
		fin_si
	 fin_desde
        FIN*/
        
        int pares;
        int impares;
        int numero;
        numero = 1;
        pares = 0;
        impares = 0;

        for(numero = 1; numero <= 100; numero++) {
            if (numero % 2 == 0) {
                pares = pares + numero;
            } else {
                impares = impares + numero;
            }// fin del if else
          }// fin del while

        System.out.printf(
                "El total de pares es %d y el de impares %d", pares, impares);
        

    }

}
