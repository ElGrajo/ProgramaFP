package Boletin2;

import java.util.Scanner;

/**
 *
 * @author Julian Gawron
 */
public class Ej5nomina {
    /*
    5.	Realizar un algoritmo que calcule la nómina de un trabajador. 
    El trabajador cobra un precio fijo por hora y se le retiene un 5 % en 
    concepto de IRPF. El algoritmo debe pedir el nombre del trabajador, las 
    horas trabajadas y el precio que cobra por hora. Como salida se debe 
    imprimir por pantalla el sueldo bruto, la retención y el sueldo neto. 
    */
    
    
    public static void main( String args[] ){
    
    String nombreEmpleado;
    int valorHora;
    int horasTrabajadas;
    int impuestoIRPF = 2;
    int valorTotal;
    int valorFinal;
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Nombre del empleado: ");
    nombreEmpleado = entrada.next();
    
    System.out.print("Valor por hora: ");
    valorHora = entrada.nextInt();
    
    System.out.print("Cantidad de horas trabajadas: ");
    horasTrabajadas = entrada.nextInt();
    
    valorTotal = valorHora * horasTrabajadas;
    valorFinal = valorTotal - ((valorTotal / 100) * impuestoIRPF);
    System.out.println( nombreEmpleado + " hizo " + horasTrabajadas + " horas a un valor de " + 
    Integer.toString(valorHora) + ". Ganaría " + Integer.toString(valorTotal) 
    + " euros, pero sin el IRPF es " + Integer.toString(valorFinal) );
    
    }// fin del main
}// fin de la clase
