package metodos;


/**
 *
 * @author Ejemplo de sobre carga de metodos
 */
public class Ej4SobreCarga {
    public static void main(String args[]){
     int numero1 = 2;
     int numero2 = 45;
     int numero3 = 125;
     
        System.out.println(max(numero1, numero2, numero3));
        
    }

    public static int max(int num1, int num2){
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        System.out.println("Este es el metodo con enteros");
        return result;
    }
    
    public static double max(double num1, double num2){
            if (num1 > num2){
                return num1;
            }else
                return num2;
    }
    
    
   public static int max(int num1, int num2, int num3){
       return max( max(num1, num2),num3);
    }
    
}
