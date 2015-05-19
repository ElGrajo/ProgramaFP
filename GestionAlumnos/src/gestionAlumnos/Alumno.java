package gestionAlumnos;

/**
 *
 * @author Julian
 */
public class Alumno {
  private String asignaturas[];
  private int notas[][];
  private String nombres;
  private String apellidos;
  private String DNI;
  private boolean becado;
  private boolean pagado;

 public Alumno(String[] asignaturas, String nombres, String apellidos, 
            String DNI) {
        this.asignaturas = asignaturas;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.DNI = DNI;
        notas = new int[asignaturas.length][5];
    }
  
 
 
    public String[] getAsignaturas() {
        return asignaturas;
    }
    public int getAsignatura(String asignatura){
        for(int i = 0; i < asignaturas.length; i++){
            if(asignaturas[i].equals(asignatura)){
                return i;
            }  
        }
        return -1;
    }
 /**
 * Enumera todas las notas del alumno
 * @return 
 */
    public String getNotas() {
        StringBuilder respuesta = new StringBuilder();
        respuesta.append(apellidos).append(", ").append(nombres).append("\n");
        for (int i = 0; i < asignaturas.length; i++) {
            respuesta.append(asignaturas[i]).append(": ");
            for(int j = 0; j < notas[i].length; j++){
                respuesta.append(notas[i][j]).append(", ");
            }
            respuesta.delete(respuesta.length()-2, respuesta.length());
            respuesta.append("\n");
            }
        return respuesta.toString();
    }
    /**
     * Devuelve todas las notas de la asignatura
     * @param asignatura
     * @return 
     */
    public String getNotas(String asignatura){
        StringBuilder respuesta = new StringBuilder();
        respuesta.append(apellidos).append(", ").append(nombres).append("\n");
        int position = this.getAsignatura(asignatura);
        
        respuesta.append(asignaturas[position]).append(": ");
        for(int j = 0; j < notas[position].length; j++)
          respuesta.append(notas[position][j]).append(", ");
        
        return respuesta.substring(0, respuesta.length()-3);
    }
    public int getNotas(String asignatura, int examen){
        int position = this.getAsignatura(asignatura);
        return notas[position][examen-1];
    }
    /**
     * 
     * @param asignatura
     * @return nota final, o 0 si no tiene aún una asignada
     */
    public double getNota(String asignatura){
        int position = this.getAsignatura(asignatura);
        if(notas[position][0] != 0 && notas[position][1] != 0 
                && notas[position][2] != 0){
            double nota = (notas[position][0] + notas[position][1] + 
                notas[position][2]) / 3.0;
            if(nota>=5)
                return nota;
            else
                return notas[position][3] > notas[position][4] ? 
                        notas[position][3] : notas[position][4];
        }
    return 0;
    }
    public void setNotas(int[][] notas) {
        this.notas = notas;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public boolean isBecado() {
        return becado;
    }

    public void setBecado(boolean becado) {
        this.becado = becado;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return apellidos + ", "+ nombres;
    }
    
}