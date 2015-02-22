/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

/**
 *
 * @author Julian
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PruebaFiguras {
    public static void main ( String args[]){
        //obtiene la opcion del usuario
        String entrada = JOptionPane.showInputDialog(
                "Escriba 1 para dibujar Rectángulos\n"
               + " Escriba 2 para dibujar ovalos\n"
               + " Escriba 3 para una Diana");
        int opcion = Integer.parseInt(entrada); // convierte entra a Int
        
        // crea el panes con la entrada del usuario
        Figuras panel = new Figuras( opcion );
        
        JFrame aplicacion = new JFrame(); // crea un nuevo objeto JFrame
        
        aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel); // agrega el panel al marco
        aplicacion.setSize(300,300); // establece el tamaño deseado
        aplicacion.setVisible(true);// muestra el marco
    }// fin del main
}// fin de PruebaFiguras
