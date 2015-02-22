package metodos;

import java.util.Scanner;

/*
 * Implementar un programa en java que simule una calculadora
 * mediante la implementacion de métodos
 * La calculadora deberá realizar suma, multiplicación y división de dos cifras
 */
/**
 *
 * @author Julian Gawron
 */
public class Ej1Calculadora {
    public static void main(String args[]){
    int primerNro;
    int segundoNro;
    int operador;
    Scanner entrada = new Scanner(System.in);
        
    //Pedido de datos
        System.out.println("Calculadora básica.");
        System.out.print("Inserte el primer número:");
        primerNro = entrada.nextInt();
        System.out.print("Inserte el segundo número:");
        segundoNro = entrada.nextInt();
        System.out.print("Ahora elija una opción de operador\n"
                + "1. Suma\n"
                + "2. Resta\n"
                + "3. Multiplicacion\n"
                + "4. Division\n"
                + "Seleccione su opción:");
        operador = entrada.nextInt();
        String mensaje = "";
        switch (operador) {
            
            case 1:
                mensaje = "El resultado es " + suma(primerNro, segundoNro);
                break;
            case 2:
                mensaje = "El resultado es " + resta(primerNro, segundoNro);
                break;
            case 3:
                mensaje = "El resultado es " + multiplica(primerNro, segundoNro);
                break;
            case 4:
                mensaje = "El resultado es " + divide(primerNro, segundoNro);
                break;
            default:
                mensaje= "No ha elegido una opcion correcta";
        }// final del switch
        
        System.out.println(mensaje);
    }// fin del main
    
    
    public static int suma(int primero, int segundo){
    int resultado;
    resultado = primero + segundo;
    return resultado;
    }//fin de suma
    
    public static int resta(int primero, int segundo){
    int resultado;
    resultado = primero - segundo;
    return resultado;
    }//fin de resta
    
    public static int multiplica(int primero, int segundo){
    int resultado;
    resultado = primero * segundo;
    return resultado;
    }//fin de multiplica
    
    public static double divide(int primero, int segundo){
    double resultado;
    resultado = primero / segundo;
    return resultado;
    }//fin de resta
    
    
    
}// fin clase
