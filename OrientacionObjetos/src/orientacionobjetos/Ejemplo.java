/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacionobjetos;

/**
 *
 * @author DAM1
 */
public class Ejemplo {
    int i =5;
    static int k = 2;
    
    public static void main(String[] args) {
        //int j = i;//
        //m1();//desde un metodo estatico solo se puede acceder a un estatico
    }
    
    public void ml() {
        i = i + k + m2 (i, k) ;
    }
    
    public static int m2(int i, int j) {
        return (int) (Math.pow(i, j));
    }
}
