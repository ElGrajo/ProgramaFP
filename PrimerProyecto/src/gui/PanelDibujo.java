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
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel
{
    /*     //Dibuja una x desde las esquinas del panel
    public void paintComponent(Graphics g)
    {
        //llama a paincComponent para asegurar que el panel se muestra correctamente
        super.paintComponent( g );
        
        int anchura = getWidth();
        int altura = getHeight();
        
        //dibuja una linea de la esq sup izq  a la esq inf der
        g.drawLine(0, 0, anchura, altura);
        
        // dibuja una linea de la esq inf izq a la sup derecha
        g.drawLine(0,altura,anchura,0);
        
    } // fin del metodo drawComponent */
    
    
        //Dibujar lineas desde la esquina superior izquierda
    public void paintComponent(Graphics g)
    {
        //llama a paincComponent para asegurar que el panel se muestra correctamente
        super.paintComponent( g );
        
        int contador = 15;
        int ancho = getWidth();
        int alto = getHeight();
        int distanciaAncho = ancho / 15;
        int distanciaAlto = alto / 15;
        
        int x = ancho;
        int y = 0;
        int x1 = 0;
        
        while (contador > 0){
        
        //dibuja las lineas desde la esquina superior izquierda
        g.drawLine(0, 0, x, y);
        //System.out.println("0, 0, " + x + ", " + y );
        
        // dibuja las líneas desde la esquina inferior derecha
        g.drawLine(ancho, alto, x, y);
        
        x = x - distanciaAncho;
        y = y + distanciaAlto;
        
        x1 = x1 + distanciaAncho;
        
        //dibuja las lineas desde la esquina inferior izquierda
        g.drawLine(0, alto, x1, y);
        
        // dibuja las líneas desde la esquina superior derecha
        g.drawLine(ancho, 0, x1, y);
        
  
        contador = contador - 1;
        }
        
     
 
        
    } // fin del metodo drawComponent
    
    
    
} // fin de la clase panelDibujo
