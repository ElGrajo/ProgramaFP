/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba;

/**
 *
 * @author Julian
 */
public class CalculandoPi {
    public static void main(String args[]){
        double pi = 4;
        double fraccion = 0;
        boolean suma = false;
        for (int i = 3; i <=11; i= i + 2){
            if (suma == false){
                pi = pi -( 4 / i);
                fraccion = 4 / i;
                suma = true;
                System.out.printf("%.8f   %f %d\n",pi, fraccion, i);
            } else {
                pi = pi + (4 / i);
                fraccion = 4 / i;
                System.out.printf("%.8f %f %d\n ",pi, fraccion, i);
                suma= false;
            } // 
            
        }// fin del for
    }
}
