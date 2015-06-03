package restarurantes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Restarurante {

    private String nombre;
    private String propietario;
    private String domicilio;
    protected int maxPorRestaurant = 2;
    protected static int numTrabajadoresTotales;

    public Restarurante() {
    }

    public Restarurante(String nombre, String propietario, String domicilio) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public static int getNumTrabajadoresTotales() {
        return numTrabajadoresTotales;
    }

    public static void setNumTrabajadoresTotales(int numTrabajadoresTotales) {
        Restarurante.numTrabajadoresTotales = numTrabajadoresTotales;
    }

    public String mostrarInformacion() {
        return "Restaurante: " 
                + "nombre: " + nombre 
                + ", propietario: " + propietario 
                + ", domicilio: " + domicilio ;
    }
    
    /**
     * Pide los datos para meter un trabajador 
     * @param lista ArrayList de trabajadores de pizzeria o chino
     */
    public void meterTrabajador(ArrayList<Trabajador> lista) {
        try {
            Scanner entrada = new Scanner(System.in);
            String nombre, direccion;
            int edad;
            boolean DatosIngresados = false;
            do{
            System.out.print("Introduzca el nombre del trabajador: ");
            nombre = entrada.next();
        //BUFFER?
            System.out.print("Introduzca la edad del trabajador: ");
            edad = entrada.nextInt();
            System.out.print("Introduzca la dirección del trabajador: ");
        //BUFFER?
            direccion = entrada.next();
            DatosIngresados = true;
            }while(!DatosIngresados);
            
        
            Trabajador trabajadorAux = new Trabajador(nombre, edad, direccion);
            lista.add(trabajadorAux);        
        //incrementamos el numero de trabajadores de los restaurantes
        numTrabajadoresTotales++; 
        } catch (Exception e) {
            System.out.println("El dato insertado no es correcto.");
        }

    }

    /**
     * 
     * @param trabajadores
     * @return 
     * 30 trabajadores totales -2
     * mas de 5 en el lugar -1
     * ingresado trabajadores 1 
     */
    public int darAltaTrabajador(ArrayList<Trabajador> trabajadores) throws Exception {
        int resultado = 1;
        if (numTrabajadoresTotales == 30) {
            resultado = -2;
            throw new Exception("Se ha alcanzado el límite total de trabajadores");
        } else {
            if (trabajadores.size() < maxPorRestaurant) {
                meterTrabajador(trabajadores);
            } else {
                resultado = -1;
                throw new Exception("Se ha alcanzado el límite de trabajadores"
                        + " del local");
            }
        }
        return resultado;
    }
}
