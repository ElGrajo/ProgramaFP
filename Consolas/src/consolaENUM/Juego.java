package consolaENUM;
import java.util.Date;

public class Juego {
    
    private double precio;
    private String titulo;
    private java.util.Date fecha;

    public Juego(){}
    public Juego(double precio, String titulo, Date fecha) {
        this.precio = precio;
        this.titulo = titulo;
        this.fecha = fecha;
    }

    public java.util.Date getFecha() {
        return fecha;
    }

    public void setFecha(java.util.Date fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }

}
