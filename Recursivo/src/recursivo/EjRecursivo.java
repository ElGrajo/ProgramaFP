/*
Ej1: define un método recursivo que calcule 2n siendo n un número natural entre 
0 y 100.
Ej2: define un método recursivo que calcule 0+1+2+3+…n siendo n un número natural
menor que 1000. ¿Cómo se conoce a esta suma?
Ej3: redefine el método creado para el factorial de forma que ofrezca el mismo 
resultado pero no de forma recursiva.
*/
package recursivo;

/**
 *
 * @author DAM1
 */
public class EjRecursivo {
    public static void main(String args[]){
        System.out.println(potenciaDe2ala(1));
        System.out.println(sumatoriaDe(5));
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
    }
    
    //Ej1
    public static int potenciaDe2ala(int potencia){
        if(potencia == 0)
            return 1;
        else
            return 2 * potenciaDe2ala(potencia - 1);
    }
    
    //Ej2 sumatoria
    public static int sumatoriaDe(int numeroFinal){
       if(numeroFinal == 0)
           return 0;
       else
           return numeroFinal + sumatoriaDe(numeroFinal - 1);
    }
    
    //Ej3 Factorial iterativo
    public static int factorial(int numeroFinal){
        int resultado = 1;
        int iterador = 0;
        while(iterador < numeroFinal){
            iterador++;
            resultado = resultado * iterador;
        }
        return resultado;
    }
}
