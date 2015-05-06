package hotel;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class hotel {
    public static void main(String[] args) {
        /*
        1. establecer el numero de habitaciones a crear
        2. reservar todas
        3. pagar algunas
        4. cambiar precio de habitaciones
        5. reservar las habitaciones restantes
        6. pagar las reservar del paso 1
        */
        
    habitacion[] misHabitaciones = new habitacion[15];
    Scanner sc = new Scanner(System.in);
        System.out.print("Reservar habitaciones:");
        int cuantas = sc.nextInt();
    
    //Reservando habitaciones
        for (int i = 0; i < cuantas-1; i++) {
            misHabitaciones[i] = new habitacion();
            sc.next();
            misHabitaciones[i].realizarReserva(sc.nextLine(), sc.nextInt());
        }
    //Pagar
        misHabitaciones[0].pagarEstancia(500); 
    }
}
