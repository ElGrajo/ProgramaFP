/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cap3;

/**
 *
 * @author Julian
 */
import java.util.Scanner;
public class LibroCalificaciones {
    
    private String nombreDelCurso; // nombre del curso para este libro
    
    //el constructor inicializa a nombreDelCurso
    public LibroCalificaciones( String nombre)
    {
        nombreDelCurso = nombre; // inicializa a nombreDelCurso
    } // fin del Constructor
    
    
    //metodo para establecer el nombre del curso
    public void establecerNombreDelCurso( String nombre)
    {
        nombreDelCurso = nombre;
    }// fin del metodo establecernombredelCurso
    
    // metodo para obtener el nombre del curso
    public String obtenerNombreDelCurso(){
      return nombreDelCurso;    
    }
    // muestra un mensaje de bievenida al usuario de Libro de Calificaciones
    public void mostrarMensaje(){
        // obtenerNombreDelCurso obtiene el nombre del curso
        System.out.printf("Bienvenido al libro de Calificaciones para \n%s\n",
                obtenerNombreDelCurso());
    }// fin del metodo mostrarMensaje
    
    //determina el promedio de la clase con la base en las 10 calificaciones
    // introducidas por el usuario.
    public void determinarPromedioClase()
    {
        // crea un objeto Scanner para obtener la entrada de la ventana
        Scanner entrada = new Scanner(System.in);
        
        int total; // suma de las calificaciones escritas por el usuario
        int contadorCalif; // numero de la siguiente calificaciones
        int calificacion; // valor de la calificacion 
        double promedio; // el promedio de las calificaciones
        
        // fase de inicializacion
        total = 0;
        contadorCalif = 1;
        
        /* // Ejemplo con un WHILE SIMPLE 
        //fase de procesamiento
        while (contadorCalif <= 10)
        {
            System.out.print("Escriba la calificacion: ");// indicador
            calificacion = entrada.nextInt();
            total = total + calificacion; // Suma calificacion total
            contadorCalif = contadorCalif + 1; // incrementa 
        } // fin del while
        // fase de terminacion
        promedio = total /10; // La division entera produce un resultado ENTERO
        
        //muestra el total y el promedio de las calificaciones
        System.out.printf("\nEl total de las calificaciones es %d\n", total);
        System.out.printf("El promediode la clase es %d\n", promedio);
         */ // fin del ejemplo con un While Simple
        
        // WHILE Con Salida
        // fase de procesamiento
        // pide entrada y lee calificaciones de los usuarios
        System.out.print("Escriba calificacion o -1 para terminar: ");
        calificacion = entrada.nextInt();
        
        // itera hasta que la entrada sea -1
        while (calificacion != -1){
            total = total + calificacion; // suma la calificacion al total
            contadorCalif = contadorCalif + 1;
            
            // pide entrada y lee siguiente calificacion del usuario
            System.out.print("Escriba calificacion o -1 para terminar: ");
            calificacion = entrada.nextInt();
        } // fin del while
        
        // fase de terminacion
        // Si el usuario introdujo por lo menos una calificacion
        if (calificacion != 0) 
        {
            // calcula el promedio de todas las calificaciones introducidas
            promedio = (double) total / contadorCalif;
            
            // muestra el total y el promedio ( con dos digitos de presicion)
            System.out.printf("\nEl total de las %d calificaciones introducidas"
                    + "es de %d\n", contadorCalif, total);
            System.out.printf("El promedio de la clase es: %.2f\n", promedio);
            } // fin del if
        else // no se introdujeron calificaciones, por lo que se imprime este mensaje
            System.out.println("No se introdujeron calificaciones");
    }// fin del metodo determinarPromedioClase
    
} // fin de la clase LibroCalificaciones