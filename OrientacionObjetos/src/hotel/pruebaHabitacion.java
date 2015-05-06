package hotel;

import java.util.Scanner;

public class pruebaHabitacion {
    /*
        1. establecer el numero de habitaciones a crear
        2. reservar todas
        3. pagar algunas
        4. cambiar precio de habitaciones
        5. reservar las habitaciones restantes
        6. pagar las restantes del paso 1
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalHabitaciones;
        habitacion [] MisHabitaciones;
        System.out.print("¿Cuantas habitaciones tiene el hotel?");
        totalHabitaciones = sc.nextInt();
        habitacion.disponibles = totalHabitaciones;
        MisHabitaciones = new habitacion[totalHabitaciones];
        
        //reservar la mitad de las habitaciones
        for (int i = 0; i < totalHabitaciones/2; i++) {
            MisHabitaciones[i] = new habitacion(50,i+1);
            MisHabitaciones[i].realizarReserva(sc.next(), sc.nextInt());
        }

        //pagar algunas
        System.out.println(MisHabitaciones[0].pagarEstancia(850));
        System.out.println(habitacion.disponibles);
        
    }
}
