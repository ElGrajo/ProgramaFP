package errores;

/**
 *
 * Otro ejemplo de try catch
 */
public class Division {
    public static void main(String args[]){
        if(args.length == 2){
            int resultado = 0;
            try {
                resultado = Integer.parseInt(args[0])/
                        Integer.parseInt(args[1]);
                System.out.println(args[0]+ " divido por "+
                        args[1] + " es igual a "+ resultado);
            } catch (NumberFormatException e) {
                System.out.println("Ambos argumentos deben ser numeros");
            } catch (ArithmeticException e){
                System.out.println("Error: "+ e.getMessage());
            }
        }// fin del if == 2
    }//Fin del main
}//Fin de class division
