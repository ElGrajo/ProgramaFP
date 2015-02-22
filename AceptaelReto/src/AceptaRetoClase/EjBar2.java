package AceptaRetoClase;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class EjBar2 {
    public static void main(String[] args) throws FileNotFoundException{
    String archivo = "C:\\Users\\DAM1\\Desktop\\JavaApplication1\\src\\programejos\\EjBar2.txt";
    Scanner sc = new Scanner(new File(archivo));
    sc.useLocale(Locale.ENGLISH); //Esto es para que tome los datos double ,
    char letra;
    double[] acumulador = new double[5];
    while(sc.hasNext()){
       letra = sc.next().charAt(0);
       if(letra=='D')
        acumulador[0] = sc.nextDouble();
       else if(letra=='A')
        acumulador[1] = sc.nextDouble();
       else if(letra=='M')
        acumulador[2] = sc.nextDouble();
       else if(letra=='I')
        acumulador[3] = sc.nextDouble();
       else if(letra=='C')
           acumulador[4] = sc.nextDouble();
       else if(letra=='N'){
           sc.nextDouble();
           System.out.println(MayorMenor(acumulador));
           for (int i = 0; i < 5; i++) {
               acumulador[i] = 0;
           }
       }
    }

    }
    
    public static String MayorMenor(double[] datos){
        String[] TipoDato = {"DESAYUNOS",
            "COMIDA","MERIENDA","CENA","COPAS","EMPATE"};
       
        double total = 0;//servirá para el promedio
        double ValorMaximo = 0;
        double ValorMinimo = 0;
        int posicMinimo = 0;
        int posicMaximo = 0;
        boolean empateMax = true;
        boolean empateMin = true;
 
        for (int i = 0; i < 5; i++) {
            if(datos[i]> ValorMaximo){
                ValorMaximo = datos[i];
                posicMaximo = i;
                total += datos[i];
                empateMax = false;
            }else if(datos[i]==ValorMaximo){
                empateMax = true;
            }
        }
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
        
        String siONO = "NO";
        if (datos[1]>(total / 5)){
            siONO = "SI";
        }
        
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
    
    public static String MayorMenor(String[] datos){
        String[] TipoDato = {"DESAYUNOS",
            "COMIDA","MERIENDA","CENA","COPA","EMPATE"};
        
        //Cada posicion corresponde a un dia
        double[] acumulador = new double[5];
        double total = 0;//servirá para el promedio
        double ValorMaximo = 0;
        double ValorMinimo = 0;
        int posicMinimo = 0;
        int posicMaximo = 0;
        boolean empateMax = true;
        boolean empateMin = true;
        
        for(String dia : datos){
            String[] diaYRecauda = dia.split(" ");
            char SoloDia = dia.charAt(0);
            if(SoloDia == 'D')
               acumulador[0] = Double.parseDouble(diaYRecauda[1]);
            else if(SoloDia == 'A')
               acumulador[1] = Double.parseDouble(diaYRecauda[1]);
            else if(SoloDia== 'M')
                acumulador[2] = Double.parseDouble(diaYRecauda[1]);
            else if(SoloDia== 'I')
                acumulador[3] = Double.parseDouble(diaYRecauda[1]);
            else if(SoloDia== 'C')
                acumulador[4] = Double.parseDouble(diaYRecauda[1]);
        }
        
        for (int i = 0; i < 5; i++) {
            if(acumulador[i]> ValorMaximo){
                ValorMaximo = acumulador[i];
                posicMaximo = i;
                total += acumulador[i];
                empateMax = false;
            }else if(acumulador[i]==ValorMaximo){
                empateMax = true;
            }
        }
        ValorMinimo = ValorMaximo;
        for (int i = 0; i < 5; i++) {
               if(acumulador[i]< ValorMinimo){
                ValorMinimo = acumulador[i];
                posicMinimo = i;
                empateMin = false;
            }else if(acumulador[i]==ValorMinimo){
             empateMin = true;
            }
        }
        
        String siONO = "NO";
        if (acumulador[1]>(total / 5)){
            siONO = "SI";
        }
        
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


