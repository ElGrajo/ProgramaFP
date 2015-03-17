package errores;

/**
 *
 * @author Julian
 */
public class nuevoSumador {
    public static void main(String[] args){
        float sum = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                sum = sum + Float.parseFloat(args[i]);
            } catch (NumberFormatException e) {
                System.out.println(args[i] + " no es un numero ");
            }
        }
        System.out.println("La suma es: " + sum);
    }
}
