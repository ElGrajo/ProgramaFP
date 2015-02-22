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
import javax.swing.JOptionPane;
public class ventana {
    public static void main (String args[]){
    // Muestra un cuadro de dialogo con un mensaje
    
    String nombre = JOptionPane.showInputDialog("¿Cuál es su nombre?");
    JOptionPane.showMessageDialog(null, "Hola " + nombre +"\n"
            + "Te felicito por tu entrevista");
    }   
}
