import java.util.Scanner;
public class LibroCalificaciones1 {
    
    private String nombreDelCurso; // nombre del curso para este libro
    private int contadorCalif;
    private int total;
    private int aCuenta;
    private int bCuenta;
    private int cCuenta;
    private int dCuenta;
    private int fCuenta;
    
    
    //el constructor inicializa a nombreDelCurso
    public LibroCalificaciones1( String nombre)
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
    
    // introduce un numero arbitrario de calificaciones de usuario
    public void introducirCalif()
    {
        Scanner entrada = new Scanner(System.in);
        int calificacion; // calificacion introducida por el usuario
        
        System.out.printf("%s\n%s\n   %s\n  %s\n",
                "Escriba las calificacion enteras en rango 0 a 100.",
                "Escriba el indicador de fin de archivo para terminar la entrada.",
                "En unix escriba <ctrl>D y después oprima intro",
                "En Windows escriba <ctrl>Z y después intro");
        //itera hasta que el usuario introduzca el fin del archivo
        while(entrada.hasNext())
        {
            calificacion = entrada.nextInt(); // lee calificacion
            total += calificacion; // suma la calificacion al total
            ++contadorCalif; // incrementa el numero de calificaciones
            
            //llama al metodo para incrementar el contador apropiado
            incrementarContadorCalifLetra(calificacion);
        }// fin del while
    }// fin del metodo introducirCalif
   
    // suma 1 al contador apropiado para la calificacion especificada
    public void incrementarContadorCalifLetra(int calificacion)
    {
        // determina cual calificacion hay que aumentar
        switch (calificacion / 10)
        {
            case 9: // calificacion entre 90
            case 10: // y 100
                ++aCuenta; // incrementa aCuenta
                break;
            case 8: 
                ++bCuenta;
                break;
            case 7:
                ++cCuenta;
                break;
            case 6:
                ++dCuenta;
                break;
            default:
                ++fCuenta;
                break;
        }// fin de switch
    }// fin de metodo incrementarContadorCalifLetra
   
    //Muestra reporte con base en las calificaciones introducidas
    public void mostrarReporteCalif()
    {
        System.out.println("\nReporte de Calificaciones: ");
        //si el usuario introdujo alguna calificacion
        if (contadorCalif != 0)
        {
            // calcula el promedio de todas las calificaiones 
            double promedio = (double) total / contadorCalif;
            
            // imprime resumen de resultados
            System.out.printf("El total de las %d calificaciones introducidas es %d\n",
                    contadorCalif, total);
            System.out.printf("El promedio de las calificaciones es: %.2f\n", promedio);
            System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
                    "Numero de estudiantes que recibieron mas calificacion:",
                    "A: ", aCuenta,
                    "B: ", bCuenta,
                    "C: ", cCuenta,
                    "D: ", dCuenta,
                    "F: ", fCuenta);
        }// fin del if
        else // no se introdujeron datos
            System.out.println("No se introdujeron calificaciones");
    }// fin de mostrarReporteCalif
    
} // fin de la clase LibroCalificaciones
