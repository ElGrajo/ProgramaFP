package RecopilatorioExamenes;

import java.util.Scanner;

/**
 *
 * @author Julian Gawron
 * El programa de “La bruja Lola” desea para sus predicciones zodiacales 
 * conocer el día de la semana en el que nacieron los usuarios. Para ello 
 * encargan a la empresa TEIDE y Asociados S.A el desarrollo de un programa 
 * informático que permita su cálculo. Le pedirán por teclado el día, mes y 
 * año del usuario y una vez que el sistema haya comprobado que la fecha es 
 * correcta (teniendo en cuenta los años bisiestos) realizará los cálculos 
 * necesarios para identificar en qué día de la semana cayó esa fecha.
 * 
 * El cálculo parte de la obtención de tres variables (a, y. m) y suponiendo
 * DIA, MES y ANO como los valores que introduce el usuario por teclado:
 * 
 * a = (14 - MES)/12
 * 
 * y = ANO - a
 * 
 * m = MES + (12 * a) - 2
 * 
 * Una vez conocidas estas tres variables, se podrá obtener el valor del 
 * día de la semana:
 * 
 * diaDeLaSemana = DIA + y + (y/4)-(y/100)+(y/400)+(31*m)/12
 * 
 * El valor de día de la semana lo dividiremos entre siete y obtendremos 
 * su resto. Si el resto es 0 indicará que el día de la semana es Domingo, 
 * si el resto es 1 será un Lunes, si el resto es 2 será un Martes, etc. 
 * Estos cálculos solamente se realizarán en el caso que la fecha sea correcta,
 * en caso contrario el sistema indicará FECHA INCORRECTA.
 */
public class Ej2DiasSemana {
    
    public static void main(String[] args) {
    //Variables
    Scanner entrada = new Scanner(System.in);
    
    int diasPorMes[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    String diasSemana[]={"Domingo","Lunes","Martes","Miércoles","Jueves",
        "Viernes","Sábado" };
    int DIA = 25;
    int MES = 8;
    int ANO = 1991;
    boolean seguir = true;
    
    System.out.println("Dia:");
    DIA = entrada.nextInt();
    System.out.println("Mes:");
    MES = entrada.nextInt();
    System.out.println("Año");
    ANO = entrada.nextInt();
    
    //Le agrega un día a febrero si es biciesto
    if( 0 ==(ANO % 4)){
        diasPorMes[2] = 29;
    }
    
    //Verifica fecha 
    //Hay que mirar primero el mes, porque si no se sale del array diasPorMes
    if(!((( 0 < MES ) && ( MES < 13))&&
            ((0 < DIA) && (DIA < diasPorMes[MES]))
            &&(( 0 < ANO ) && ( ANO < 2015)))){
        System.out.println("La fecha es incorrecta");
        seguir = false;
    }
    
    if(seguir){
    //Supercálculo
    double a = (14 - MES)/12;
    double y = ANO - a;
    double m = MES + (12 * a) - 2;
    
    double diaDeLaSemana = DIA + y + (y/4)-(y/100)+(y/400)+((31*m)/12);
    
    int diaSemanaFinal = ((int)diaDeLaSemana) % 7;
    
        System.out.printf("Dia de la semana: %s\n", diasSemana[diaSemanaFinal-1] );
        }//fin del if seguir
    }//fin del main
}//fin de clase
