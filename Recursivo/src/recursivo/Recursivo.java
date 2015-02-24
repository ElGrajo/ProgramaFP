package recursivo;

/**
 *
 * Recursividad, hay que establecer el caso base que funciona como salida
 * y el caso recursivo, que volverá a llamrer
 */
public class Recursivo {

    public static int factorial(int n){
           System.out.print(n + " * ");
            if(n == 0){//caso base
                return 1;
            }else{
              return n * factorial(n - 1); // caso recursivo
            }
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    
}
