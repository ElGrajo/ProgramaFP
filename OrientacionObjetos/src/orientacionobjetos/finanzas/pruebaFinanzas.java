package orientacionobjetos.finanzas;

import java.util.Scanner;

public class pruebaFinanzas {
    public static void main(String[] args) {
       // finanzas misCuentas = new finanzas();
        Scanner sc = new Scanner(System.in);
        double euros;
        double dolares;
        System.out.print("Introduce el numero de euros: ");
        euros = sc.nextDouble();
        System.out.print("Introduce el numero de dolares: ");
        dolares = sc.nextDouble();
        
        System.out.printf("€ %.2f son U$S %.2f\n",
                euros, finanzas.dolaresToEuros(dolares));
        
        System.out.printf("€ %.2f son U$S %.2f\n",
                euros, finanzas.eurosToDolares(euros));
        System.out.println(finanzas.getContadorCambios());
    }
}
