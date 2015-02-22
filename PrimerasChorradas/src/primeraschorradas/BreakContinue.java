package primeraschorradas;

/**
 * Practica de BreakContinue
 * Break sale del bucle
 * Continue salta la iteración
 * @author Julian Gawron
 */
public class BreakContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            if(i % 2 == 0){
                continue;
            }            
            System.out.println("El valor de i es " + i);
            System.out.println("Después se ejecuta esto");
            // break; // Aqui se realiza una sola iteración.
        }
        System.out.println("Al salir del for");
    }
}
