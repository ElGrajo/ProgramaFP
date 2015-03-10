/*
 * Probando la clase Math algunos detalles 
 */
package comoprogramarenjava;

/**
 *
 * @author Julian
 */
public class Cap6ProbandoMath {
    public static void main(String args[]){
        double resultado = Math.sqrt(900.0);
        System.out.println(resultado);
        System.out.println(Math.sqrt(900.0));
        //ceil redondea x al entero más pequeño que no sea menor que x
        System.out.println(Math.ceil(30.9)); // da 31.0
        System.out.println(Math.ceil(-30.9));// da -30.0
        //floor redondea x al entero más grande que no sea mayor de x
        System.out.println(Math.floor(30.9));//da 30.0
        System.out.println(Math.floor(-30.9));//da -31.0
        //Se puede obtener el valor máximo entre dos
        System.out.println(Math.max(12,12.1));
        
    }
}
