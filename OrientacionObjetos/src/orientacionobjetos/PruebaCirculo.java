package orientacionobjetos;

/**
 *
 * @author DAM1
 */
public class PruebaCirculo {
    public static void main(String[] args){
    circulo MiCirculo = new circulo();
        System.out.println("el area del circulo de radio "
        + MiCirculo.radio + " es " + MiCirculo.getArea());
    circulo MiCirculo2 = new circulo(25);
    System.out.println("el area del circulo de radio "
        + MiCirculo2.radio + " es " + MiCirculo2.getArea());
        System.out.println(circulo.getNumeroObjetos());
    }
    
}
