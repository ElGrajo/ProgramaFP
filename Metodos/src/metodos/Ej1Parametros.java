package metodos;

/**
 *
 * @author Julian Gawron
 * Paso de parámetros por VALOR
 * El valor de x no se modifica, porque lo que se pasa al método es una copia.
 */
public class Ej1Parametros {
    public static void main (String[] args) {
        int x = 1;
        System.out.println("El valor de la variable antes de invocar es:" + x);
        incrementa(x);
        System.out.println("El valor luego de la invocacion es:" + x);
    }//fin main
    
    public static void incrementa(int n){
        n++;
        System.out.println("El valor de la variable dentro del mtd incrementa es:" + n);
    }// fin incrementa
}// fin clase Ej2Parametros
