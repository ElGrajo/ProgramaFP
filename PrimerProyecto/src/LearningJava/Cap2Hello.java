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

import javax.swing.*;

    public class Cap2Hello {
      public static void main( String[] args ) {
        JFrame frame = new JFrame( "Hello, Java!" );
       /* JLabel label = new JLabel("Hello, Java!", JLabel.CENTER );
        frame.add(label);
        frame.setSize( 300, 300 );
        frame.setVisible( true );
        */
        frame.add( new HelloComponent() );
        frame.setSize( 300, 300 );
        frame.setVisible( true );
      }
    }
