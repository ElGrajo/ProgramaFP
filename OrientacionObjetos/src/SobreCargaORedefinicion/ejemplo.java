/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SobreCargaORedefinicion;

/**
 *
 * @author dam2
 */
public class ejemplo {
    public static void main(String[] args){
        A a = new A();
        a.p(10);
        a.p(10.0);
    }
}

//Clase internas
class B{
    public void p(double i){
    System.out.println(i*2);
    }
}

class A extends B{
   
    public void p(int i){
        System.out.println(i);
    }
}