package RecopilatorioExamenes;

import java.util.Scanner;

/**
 *
 * @author Julian Gawron
 * 
 * Un ganadero Cántabro ha decidido mejorar la rentabilidad de su empresa de 
 * venta de leche. Para realizar una estimación de mercado y saber cuál es la 
 * mejor forma de mejorar su rendimiento ha pensado que si los clientes le 
 * pudieran devolver los envoltorios de cristal, así conseguiría rentabilizar 
 * parte del coste. Para que un cliente le entregue los envoltorios ha pensado 
 * que tendría que recompensarle de alguna forma, así que ha pensado en 
 * regalarle una o varias botellas de leche. Ahora la duda está en la 
 * proporción de botellas de leche que le tendrá que regalar por cada envase.
 * 
 * Para saber cuál es la mejor proporción necesita un programa informático 
 * al cual se le aportarán los siguientes datos:
 * ♦ Número de envases que son necesarios para un regalo.
 * ♦ Número de botellas de leche que le regala.
 * ♦ Número de botellas que compra un cliente.
 * 
 * Así si por ejemplo el ganadero piensa que por cada 5	envases	le regalará
 * una botella y llega un cliente y compra 25 botellas, le tendrá que regalar
 * 5 botellas (así que por esas nuevas 5 botellas le tendrá que regalar otra 
 * más, que cuando se la beba, le sobrará dicho envase). El resultado será 
 * que se bebe 31 botellas y le sobra un envase.
 * El sistema informático le indicará el número total de botellas que le 
 * dará al cliente y el número de envases que le sobrará.
 * 
 * Habrá que tener en cuenta que el sistema calculado se podría volver 
 * ineficiente para el ganadero, así si por ejemplo piensa regalar dos 
 * botellas por cada dos envases, nunca dejaría de regalar botellas. Por 
 * los dos envases le regalará dos botellas, así que tendrá dos nuevos envases, 
 * que podrá canjear por dos botellas nuevas, y así sucesivamente. En este caso
 * el sistema tendrá que notificar que es ineficiente para el ganadero.
 * 
 */
public class Ej1Ganadero {
    public static void main(String args[]){
        int cantidadParaRegalar = 5;
        int cantidadARegalar = 1;
        int compraInicial = 60;
        int aux = compraInicial;
        int totalRegalado = 0;
        int totalLeches = 0;
        int vaciosNoDevueltos = 0;
        boolean seguir = true;
        Scanner entrada;
         
        // If que comprueba no entrar en un bucle infinito
        if (cantidadParaRegalar <= cantidadARegalar){
            System.out.println("Los datos ingresado no resultarían eficientes.");
            seguir = false;
        }// fin del if
        
        if(seguir){
        
        int resto = 0;
        while(aux > 0){
            aux = aux / cantidadParaRegalar;
            resto = compraInicial % cantidadParaRegalar;
            aux = aux * cantidadARegalar;
            totalRegalado = totalRegalado + aux;
            
            
        }//bucle contador
        resto = (totalRegalado) % cantidadParaRegalar;
        System.out.printf("Total regalado:%d resto: %d",totalRegalado,resto);
        
        }// fin del seguir

    }// fin de main
}// fin de clase
