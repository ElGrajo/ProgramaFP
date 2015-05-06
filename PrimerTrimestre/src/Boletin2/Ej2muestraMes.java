package Boletin2;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Ej2muestraMes {
    
    /*
    2. Realizar un programa que lea una variable entera llamada mes y compruebe 
    si el valor corresponde a un mes de 30, 31 o 28 días. Se mostrará además el 
    nombre del mes. Se debe comprobar que el valor introducido esté comprendido 
    entre 1 y 12.
    */
     public static void main( String args[] )
    {
        // declaracion e inicializacion de variables
        int mes = 0;
        int cantidadDias = 0;
        
        String[] nombreMes;
        nombreMes = new String[13];
        nombreMes[0] = "";
        nombreMes[1] = "Enero";
        nombreMes[2] = "Febrero";
        nombreMes[3] = "Marzo";
        nombreMes[4] = "Abril";
        nombreMes[5] = "Mayo";
        nombreMes[6] = "Junio";
        nombreMes[7] = "Julio";
        nombreMes[8] = "Agosto";
        nombreMes[9] = "Setiembre";
        nombreMes[10] = "Octubre";
        nombreMes[11] = "Noviembre";
        nombreMes[12] = "Diciembre";

        Scanner entrada = new Scanner(System.in);
        
        //Pedida de datos
        System.out.print("Inserte numero de mes:");
        mes = entrada.nextInt();
        
        //Bucle de chequeo
        while(mes > 12 || mes < 1){
            System.out.print("Inserte numero de mes entre 1 y 12:");
            mes = entrada.nextInt();
        }
        
        //Opciones 
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                cantidadDias = 31;
            break;
            case 2:
                cantidadDias = 28;
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                cantidadDias = 30;
            break;
            default:
                cantidadDias = 0;
            break;
        }// fin del switch
        
        //Salida
        System.out.printf("El mes %s %d tiene %d dias", nombreMes[mes], mes, cantidadDias);
     } // fin de main
    
}// fin de muestra Mes
