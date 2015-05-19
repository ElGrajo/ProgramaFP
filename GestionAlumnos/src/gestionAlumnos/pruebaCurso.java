package gestionAlumnos;

import java.io.FileNotFoundException;

/**
 *
 * @author Julian
 */
public class pruebaCurso {
    static public void main(String args[]) throws FileNotFoundException{
        Curso MiCurso = new Curso();
        String respuesta = MiCurso.setAsignaturas("Matemática,lengua,filosofia");
        System.out.println(respuesta);
        MiCurso.setPlazasTotales(3); //ponemos las plazas a 3 para probar
        Alumno nuevo = new Alumno(MiCurso.getAsignaturas(), 
                "Buenaventura","Durruti","X54845455T");
       MiCurso.matricularAlumno(nuevo);
       int notitas[][] = {
           {2,3,4,5,6},
           {3,4,5,6,7},
           {8,8,8,8,8}
       };

       int notitas2[][] = {
           {1,1,1,1,6},
           {3,4,5,6,7},
           {4,5,6,6,7}
       };
       
        Alumno nuevo2 = new Alumno(MiCurso.getAsignaturas(), 
                "Ernesto","Guevara de la Serna","X2156455T");
       MiCurso.matricularAlumno(nuevo2);
        Alumno nuevo3 = new Alumno(MiCurso.getAsignaturas(), 
           "Miguel","Bakunin","X24156455T");
       MiCurso.matricularAlumno(nuevo3);
       Alumno nuevo4 = new Alumno(MiCurso.getAsignaturas(), 
          "Carlos","Marx" ,"X24156455T");
       System.out.println(MiCurso.matricularAlumno(nuevo4)? 
               "Inscripto" : "No inscripto");
       
       System.out.println(MiCurso.plazasDisponibles());
       MiCurso.ordenarAlumnos();
       MiCurso.getAlumno(1).setNotas(notitas);
       MiCurso.getAlumno(2).setNotas(notitas);
       MiCurso.getAlumno(3).setNotas(notitas);
        System.out.println(MiCurso.getAlumnosMatric());
        System.out.println(MiCurso.reporteTotal());
        System.out.println(MiCurso.getAlumno(1).getNota("filosofia") );
       MiCurso.imprimirPorEvaluacion();
    }
}
