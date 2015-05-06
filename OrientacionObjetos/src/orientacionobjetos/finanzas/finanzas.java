package orientacionobjetos.finanzas;

/**
 *
 * @author DAM1
 */
public class finanzas {
    static double cambio = 1.36; //tiene que ser estatica  para ver que 
    static int contadorCambios;
    
    public finanzas() {
    }
    
    public finanzas(double cambioPersonalizado){
        cambio = cambioPersonalizado;
    }
    
    static double eurosToDolares(double euros){
        contadorCambios++;
        return euros * cambio;
    }
    
    static double dolaresToEuros(double dolares){
        contadorCambios++;
        return dolares / cambio;
    }

    public static int getContadorCambios() {
        return contadorCambios;
    }
    
}//clase

