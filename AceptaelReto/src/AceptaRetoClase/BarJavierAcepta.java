package AceptaRetoClase;

import java.util.Scanner;
public class BarJavierAcepta {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char letra;
    double[] acumulador = new double[5];

    do
    {
    String entrada = sc.nextLine();
    letra = entrada.charAt(0);
    double numero = Double.parseDouble(entrada.substring(2)); 
        
       if(letra=='D')
        acumulador[0] = numero;
       else if(letra=='A')
        acumulador[1] = numero;
       else if(letra=='M')
        acumulador[2] = numero;
       else if(letra=='I')
        acumulador[3] = numero;
       else if(letra=='C')
           acumulador[4] = numero;
     }while(letra != 'N');
       System.out.println(MayorMenor(acumulador));
           for (int i = 0; i < 5; i++) {
               acumulador[i] = 0;
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
    
} 