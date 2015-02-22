/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LearningJava;

/**
 *
 * @author Julian
 */
import java.awt.*;
import javax.swing.*;

class HelloComponent extends JComponent {
      public void paintComponent( Graphics g ) {
        g.drawString( "Hello, Java!", 125, 95 );
      }
    }
