
package cap7Arrays;

public class LibroCalificaciones {
    
    private String nombreDelCurso; // nombre del curso para este libro
    private int calificaciones[][]; // arreglo bimensional de calificaciones
        
    //el constructor inicializa a nombreDelCurso
    public LibroCalificaciones( String nombre, int arregloCalif[][])
    {
        nombreDelCurso = nombre; // inicializa a nombreDelCurso
        calificaciones = arregloCalif; //almacena las calificaciones
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
    
    
    // realiza varias operaciones sobre los datos
    public void procesaCalificaciones(){
        //imprime el arreglo de las calificaciones
        imprimirCalificaciones();
        
        //llama a los metodos obtenerMinima y obtenerMaxima
        System.out.printf("\n%s %d\n%s %d\n\n",
                "la calificacion mas baja es", obtenerMinima(),
                "la calificacion mas alta es", obtenerMaxima());
        imprimirGraficoBarras();
    }// procesa calificaciones
    
    //Busca la calificacion mas baja
    public int obtenerMinima(){
        //asume que el primer elemento del arreglo calificaciones es el mas bajo
        int califBaja = calificaciones [0][0];
        
        //itera a traves de las filas del arreglo calificaciones
        for (int califEstudiantes[] : calificaciones){
            
            //itera por la columna actua
            for(int calificacion : califEstudiantes)
            {
                // si la calificacion es menor que Califbaja la asigna
                if (calificacion < califBaja)
                    califBaja = calificacion;
            }// fin del for interior
        }// fin del for
        return califBaja;
    }// fin de obtenerMinima
    
    // Busca la calificacion mas alta
    public int obtenerMaxima(){
        int califAlta = calificaciones[0][0];
        for(int califEstudiantes[] : calificaciones){
            //itera en el interior
            for(int calificacion : califEstudiantes){
                if ( calificacion > califAlta)
                    califAlta = calificacion;
            }//fin del for interior
        }//for exterior
        
        return califAlta;
    }// fin de obtenerMaxima
    
    // determina la calificacion promedio para un estudiante especifico
    public double obtenerPromedio(int conjuntoDeCalif[]){
      int total = 0;
        // suma las calificaciones para un estudiante
        for( int calificacion : conjuntoDeCalif)
        {
         total += calificacion;   
         
        }// fin del for
      return (double) total/conjuntoDeCalif.length;
    }// fin de obtenerPromedio
    
    //imprime grafico de barras
    public void imprimirGraficoBarras()
    {
        System.out.println("Distribucion de calificaciones en general:");
        //almacena la frecuencia de las calificaciones en cada rango de 10
        
        int frecuencia[] = new int[11];
        
        // para cada calificacion en LibroCalif, incrementa la frecuencia
        for(int califEstudiantes[] : calificaciones)
        {
            for (int calificacion : califEstudiantes)
                ++frecuencia[calificacion / 10];
        }// fin del for exterior
        
        //para cada frecuencia de calificaciones, imprime una barra en el grafico
        for (int cuenta = 0; cuenta < frecuencia.length; cuenta++)
        {
            // imprime las etiquetas de las barras
            if (cuenta == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ",
                        cuenta * 10,cuenta * 10 + 9);
            
            // imprime la lista de asteriscos
            for (int estrellas = 0; estrellas <frecuencia[cuenta]; estrellas++)
                System.out.print("*");
            
            System.out.println();// inicia una nueva linea de salida
        }// fin del for exterior
    }//fin imprimir barras
    
    // imprime el contenido del arreglo calificaciones
    public void imprimirCalificaciones(){
          System.out.println("Las calificaciones son: \n");
          System.out.print("               ");// linea de encabezado de columnas
          
          // crea un encabezado de columna para cada pruveta
          for(int prueba = 0; prueba < calificaciones[0].length; prueba++)
              System.out.printf("Prueba %d  ", prueba + 1);
          
          System.out.println("Promedio"); // encabezado de columna de promedios
          
          // crea filas/columnas de texto que representan el arreglo calificaciones
          for (int estudiante = 0; estudiante < calificaciones.length; estudiante++)
          {
              System.out.printf("Estudiante %2d", estudiante +1);
              
              for( int prueba : calificaciones[estudiante]) // imprime calificaciones
                  System.out.printf("%8d", prueba);
              
              // llama al obtenerpromedio para calcular el prom de cada estudiante
              //pasa fila de calificaciones como argumento para obtener promedio
              double promedio = obtenerPromedio(calificaciones[estudiante]);
              System.out.printf("%9.2f\n", promedio);
          }// fin del for exterio
    }// final de imprimir calificaciones
} // fin de la clase LibroCalificaciones