package metodos;

/**
 *
 * @author 
 * Segundo ejemplo de paso de parámetros por valor
 */
public class Ej2Parametros {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        System.out.println("Antes de invocar al método de intercambio, "
                + "num1 vale" + num1 + " y num2 vale : " + num2);
        intercambia (num1, num2);
       // Invoke the swap method to attempt to swap two variables
        System.out.println("Después de invocar el método de intercambio, "
                + "num1 vale:" + num1 + " y num2 vale: " + num2);
    }
    
    public static void intercambia(int numerol, int numero2) {
        System.out.println("\tEstamos dento del método de intercambio");
        System.out.println("\t\tAntes del intercambio: numerol vale: " 
                + numerol + " y numero2 vale: " + numero2);
    //Intercambiamos el valor de numerol con el de
    //numero2 —>(rotación de variables)
        int temp = numerol;
        numerol = numero2;
        numero2 = temp;
        
        System.out.println("\t\tDespués del intercambio, numerol vale: " 
                + numerol + " n y numero2 vale: " + numero2);
    }
}
