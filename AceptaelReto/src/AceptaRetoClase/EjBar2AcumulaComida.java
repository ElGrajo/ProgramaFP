package AceptaRetoClase;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class EjBar2AcumulaComida {
    public static void main(String[] args) throws FileNotFoundException{
    String archivo = "C:\\Users\\DAM1\\Desktop\\JavaApplication1\\src\\programejos\\EjBar2.txt";
    Scanner sc = new Scanner(new File(archivo));
    sc.useLocale(Locale.ENGLISH); //Esto es para que tome los datos double
    char letra;
    double[] promedioComidas = new double[2]; //[0]Suma final; [1] cantidad datos
    double[] acumulador = new double[5];
    
    while(sc.hasNext()){
       letra = sc.next().charAt(0);
       if(letra=='D')
        acumulador[0] = sc.nextDouble();
       else if(letra=='A'){
        acumulador[1] = sc.nextDouble();
        //Prepara el promedio de comidas
        promedioComidas[0] += acumulador[1];
        promedioComidas[1]++;
        }
       else if(letra=='M')
        acumulador[2] = sc.nextDouble();
       else if(letra=='I')
        acumulador[3] = sc.nextDouble();
       else if(letra=='C')
           acumulador[4] = sc.nextDouble();
       else if(letra=='N'){
           sc.nextDouble();
           System.out.println(MayorMenor(acumulador, promedioComidas));
           for (int i = 0; i < 5; i++) {
               acumulador[i] = 0;
           }
       }
    }

    }
    
    public static String MayorMenor(double[] datos, double []paraMedia){
        String[] TipoDato = {"DESAYUNOS",
            "COMIDA","MERIENDA","CENA","COPAS","EMPATE"};
       
        double promedio = paraMedia[0]/paraMedia[1];//servirá para el promedio
        double ValorMaximo = 0;
        double ValorMinimo = 0;
        int posicMinimo = 0;
        int posicMaximo = 0;
        boolean empateMax = true;
        boolean empateMin = true;
        
        //Chequea los máximos
        for (int i = 0; i < 5; i++) {
            if(datos[i]> ValorMaximo){
                ValorMaximo = datos[i];
                posicMaximo = i;
                empateMax = false;
            }else if(datos[i]==ValorMaximo){
                empateMax = true;
            }
        }
        //Chequea los minimos
        ValorMinimo = ValorMaximo;
        for (int i = 0; i < 5; i++) {
               if(datos[i]< ValorMinimo){
                ValorMinimo = datos[i];
                posicMinimo = i;
                empateMin = false;
            }else if(datos[i]==ValorMinimo){
             empateMin = true;
            }
        }
        
        //Compara la comida con el promedio de comidas.
        String siONO = "NO";
        if (datos[1] > promedio){
            siONO = "SI";
        }
        
        //Arma el string Verificando si hubo un empate
        String Maxi;
        if(!empateMax)
            Maxi = TipoDato[posicMaximo];
        else
            Maxi = TipoDato[5];
        
        String Min;
        if(!empateMin)
            Min = TipoDato[posicMinimo];
        else
            Min = TipoDato[5];
        return Maxi+"#"+Min+"#"+siONO;
    }
}


