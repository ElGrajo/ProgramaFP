package cap11GUI;

/**
 *
 * @author Julian
 */
// Fig. 11.10: PruebaCampoTexto.java
// Prueba de CampoTextoMarco.
import javax.swing.JFrame;
public class CampoTextoPrueba
{
    public static void main( String args[] )
{
    CampoTextoMarco campoTextoMarco = new CampoTextoMarco();
    campoTextoMarco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    campoTextoMarco.setSize( 350, 100 ); // establece el tamaño del marco
    campoTextoMarco.setVisible( true ); // muestra el marco
 } // fin de main
} // fin de la clase PruebaCampoTexto
