package orientacionobjetos;

/**
 *
 * @author DAM1
 */
public class circulo {
    /*Atributo: radio del circulo*/
    double radio = 1;
    static int numeroObjetos;/*atributo estático*/
    
    /*construye un objeto de tipo circulo*/
    public circulo() {
        numeroObjetos++;
    }
    public circulo(double nuevoRadio) {
        radio = nuevoRadio;
        numeroObjetos++;
    }
    
    /*Devuelve el area del circulo*/
    double getArea(){
        return radio * radio * Math.PI;
    }
    
    /*Devuelve el perimetro del circulo*/
    double getPerimetro(){
        return 2 * radio * Math.PI;
    }
    
    /*Set new radius for this circle*/
    void setRadio(double nuevoRadio){
        radio = nuevoRadio;
    }
    
    /*metodo estatico*/
    static int getNumeroObjetos(){
        return numeroObjetos;
    }
}
