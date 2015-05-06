package hotel;

/**
 *
 * @author DAM1
 */
public class habitacion {
    static int disponibles = 15;
    double precioReserva;
    static double precioGlobal;
    int numeroHabitacion;
    boolean ocupada;
    String huesped;//es null por defecto
    int noches;

    public habitacion() {}
    public habitacion(double precio, int numeroHabitacion) {
        this.precioReserva = precio;
        this.numeroHabitacion = numeroHabitacion;
    }
    
    public int realizarReserva(String cliente, int numeroNoches){
     if(disponibles>0){  
        this.huesped = cliente;
        this.noches = numeroNoches;
        ocupada = true;
        disponibles--;
        return 1;
     }else{
        return 0;
     }
    }
    
    double pagarEstancia(double dinero){
     double vuelta = -1;
     if(ocupada){
      vuelta = dinero - (noches * precioReserva);
     }
     return vuelta;
    }

    public void setPrecio(double precio) {
        habitacion.precioGlobal = precio;
    }
    
}
