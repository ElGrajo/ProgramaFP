package gestionAlumnos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Julian
 */
public class Curso {
    private String asignaturas[];
    private int plazasTotales;
    private Alumno[] alumnosMatric;
    private int precio;
    private String codigo;
    private String nombre;
    private boolean abierto = true;

    public Curso(){}
    public Curso(String[] asignaturas, int plazasTotales, int precio, 
            String codigo, String nombre) {
        this.asignaturas = asignaturas;
        this.plazasTotales = plazasTotales;
        this.precio = precio;
        this.codigo = codigo;
        this.nombre = nombre;
    }
/**
 * Calcula las plazas disponibles, verificando la cantidad de inscriptos
 * @return 
 */
    public int plazasDisponibles(){
        if(alumnosMatric == null){
            return plazasTotales;
        }       
        int contador = 0;
        
        for (Alumno alumnosMatric1 : alumnosMatric) {
            if (alumnosMatric1 == null) {
                contador++;
            }
        }
        return contador;
    }
    
    public String[] getAsignaturas() {
        return asignaturas;
    }
/**
 * Cambia todas las asignaturas, por las ingresadas en la cadena 
 * separadas por comas.
 * @param asignaturas 
     * @return  
 */
    public String setAsignaturas(String asignaturas){
        //Verifica que no haya nadie inscripto
        if(plazasTotales==plazasDisponibles()){
            String[] misAsignaturas = asignaturas.split(",");
            setAsignaturas(misAsignaturas);
            return "Se han ingresado: " + misAsignaturas.length + " asignaturas.";
        }else{
           return "No se pueden agregar asignaturas si hay alumnos matriculados";
        }
    }
    
    public void setAsignaturas(String[] asignaturas) {
        if(plazasTotales==plazasDisponibles()){
            this.asignaturas = asignaturas;
        }
    }

    public int getPlazasTotales() {
        return plazasTotales;
    }
/**
 * Cambia el valor de las plazas totales
 * @param plazasTotales 
 */
    public void setPlazasTotales(int plazasTotales){
        if(plazasTotales>0){
         this.plazasTotales = plazasTotales;
         if(alumnosMatric==null)
            alumnosMatric = new Alumno[plazasTotales];
        }
    }
/**
 * 
 * @return todos los alumnos encadenados, separados por ;
 */
    public String getAlumnosMatric() {
        if(alumnosMatric != null){
            String respuesta = "";//Ineficiente, ver stringbuilder
            for (Alumno alumnosMatric1 : alumnosMatric) {
                if (alumnosMatric1 != null) {
                    respuesta += alumnosMatric1+ ";"; 
                }
            }
            return respuesta;
        }//fin del if != null
        else
            return "No hay alumnos matriculados";
    }
   /**
    * 
    * @param numero de inscripcion
    * @return devuelve un alumno
    */
    public Alumno getAlumno(int numero){
        if(alumnosMatric[numero-1]== null)
            return null;
        else
            return alumnosMatric[numero-1];
    }
/**
 * 
 * @return Imprime los alumnos, con las materias y las notas
 */
    public String reporteTotal(){
        int ultimo = plazasTotales - this.plazasDisponibles();
        StringBuilder cadena = new StringBuilder();
        for (int i = 0; i < ultimo; i++) {
            if(cadena.length()!=0) cadena.append("\n");
            cadena.append(getAlumno(i+1).getNotas());
        }
        return cadena.toString();
    }
    
public void imprimrReporte() throws FileNotFoundException{
        File archivo = new File("src/gestionAlumnos/reporte.txt");
        //comprobamos si existe
        if(archivo.exists()){
            System.out.println("El archivo ya existe");
            System.exit(0);//Si esta línea no está, el archivo escribe.
        }
        
        try (PrintWriter salida = new PrintWriter("src/gestionAlumnos/reporte.txt")) {
            salida.print(this.reporteTotal());
        }

}

/**
 * Imprime las notas de cada alumno y cada asignatura de la 
 * evaluacion indicada
 * @param evaluacion 
 */
public void imprimirPorEvaluacion() throws FileNotFoundException{
  File archivo = new File("src/gestionAlumnos/reporte.txt");
  //comprobamos si existe
  if(archivo.exists()){
      System.out.println("El archivo ya existe");
      System.exit(0);//Si esta línea no está, el archivo escribe.
    }
    
  PrintWriter salida = new PrintWriter("src/gestionAlumnos/reporte.txt");
  //Asignaturas
  salida.printf("%45s", asignaturas[0]);
    for (int i = 1; i < asignaturas.length; i++) {
        salida.printf("%15s", asignaturas[i]);
    }
  salida.print("\n");
  //cada alumno, notas
    for (int i = 0; i < alumnosMatric.length; i++) {
        salida.printf("%30s", getAlumno(i+1));
        for (int j = 0; j < asignaturas.length; j++) {
            salida.printf("%15s",alumnosMatric[i].getNota(asignaturas[j]));
        }
        salida.printf("\n");
    }
  salida.close();
  
}

    /**
     * Ordena alfabéticamente los alumnos inscriptos
     */
    public void ordenarAlumnos(){
    int ultimo = plazasTotales - this.plazasDisponibles();
    Alumno aux;
        for (int i = 0; i < ultimo-1; i++) {
            for (int j = i+1; j < ultimo; j++) {
             if(alumnosMatric[j].toString().compareTo(alumnosMatric[i].toString())<0)
             {
                 aux= alumnosMatric[j];
                 alumnosMatric[j]= alumnosMatric[i]; 
                 alumnosMatric[i]=aux;
             }
            }
           
        }
        
    }
    /**
     * Matricula un nuevo alumno
     * @param nuevoAlumno
     * @return false si no se pudo matricular
     */
    public boolean matricularAlumno(Alumno nuevoAlumno) {
        if(abierto){
        if(alumnosMatric == null){
            alumnosMatric = new Alumno[plazasTotales];
            alumnosMatric[0] = nuevoAlumno;
            return true;
        }
        else{
            for (int i = 0; i < alumnosMatric.length; i++) {
                if(alumnosMatric[i]==null){
                    alumnosMatric[i]= nuevoAlumno;
                    return true;
                }
            }
           return false; 
        }
       }else
            return false;
        
    }

    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        if(precio>0 && abierto)
            this.precio = precio;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
       if(abierto)
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if((nombre.length()>0) && (abierto))
            this.nombre = nombre;        
    }
    
}
