package arrays;

/**
 *
 * @author DAM1
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaracion  (Los corchetes son la clave)
        int [] arrayEnteros;
        double arrayDoubles[];
        boolean [] arrayDeLaVerdad;
        char[] arrayLetras;
        
        int [] arrayPersonal = {2,3,5,1,232,25,654,8};
        
        //Inicializacion
        arrayEnteros = new int[4];
        arrayDoubles = new double[12];
        arrayDeLaVerdad = new boolean[3];
        arrayLetras = new char[20];
        
        
        for (int i = 0; i < (arrayPersonal.length - 1); i++) {
            System.out.printf("La posicion %d del array tiene %d\n", 
                    i, arrayPersonal[i]);
        }
        
        for(int posicion : arrayEnteros){
            System.out.printf("La posicion contiene %d\n", posicion);
        }
        
        
    }
    
}
