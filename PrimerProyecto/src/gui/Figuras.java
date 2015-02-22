package gui;
// demuestra como hacer varias figuras
import java.awt.Graphics;
import javax.swing.JPanel;

public class Figuras extends JPanel
{
    private int opcion; // es la opcion del usuario acerca de la figura
    
    // el constructor establece la opcion del usuario
    public Figuras(int opcionUsuario)
    {
        opcion = opcionUsuario; 
    } // fin del constructor de figuras
    
    // dibuja una cascada de figuras, empezando dede la esquina superior izquierda
    public void paintComponent( Graphics g)
    {
        super.paintComponent(g);
        int centrox =  (getWidth()/2)-25; // se le agrega el -25 por el radio 
        int centroy =  (getHeight()/2)-25;
        for (int i=0; i< 10; i++)
        {
            // elije la figura con base en la opcion del usuario
            switch (opcion)
            {
                case 1: // dibuja rectangulos
                    g.drawRect(10 + i * 10, 10 + i * 10,
                            50 + i * 10, 50 + i * 10);
                break;
                case 2: // dibuja ovalos
                    g.drawOval(10 + i * 10,10 + i * 10,
                             50 + i * 10, 50 + i * 10);
                break;
                case 3: // agregando el caso de los circulos diana
                    g.drawOval(centroy - i * 10,
                               centrox - i * 10,
                             50 + i * 20, 
                             50 + i * 20);
                break;
            }// fin del switch
        }// fin del for
    }// fin del metodo paintComponent
}// fin de la clase Figuras
