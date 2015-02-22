package ordenacionarrays;

import java.util.Scanner;

public class EjBar2 {
    public static void main(String[] args){
       
        
        String[] datos = {
            "D 2.80", 
            "C 48.00",
            "A 8.00", 
            "N 0"};
        String[] datos2 ={
            "D 15.33",
            "A 60.00",
            "M 12.00", 
            "I 25.00",
            "N 0"};
        String[] datos3 = {
            "D 15.33",
            "M 60.00",
            "A 12.00", 
            "C 25.00",
            "N 0"};
        
        String datos4 =
            "D 2.80 C 48.00 A 8.00 N 0 D 15.33 A 60.00 M 12.00 I 25.00 N 0 " +
            "D 15.33 M 60.00 A 12.00 C 25.00 N 0";
        
       Scanner sc = new Scanner(datos4);
       char letra;
       double cifra = 0;
       while(sc.hasNext()){
        do{
           letra = sc.next().charAt(0);
            System.out.printf("%s %s ", letra, sc.next());
        }while(!(sc.hasNext("N")));
           sc.next();
           sc.next();
           System.out.println(", Otro");
       }
        /*
        System.out.println(MayorMenor(datos));
        System.out.println(MayorMenor(datos2));
        System.out.println(MayorMenor(datos3));
        */
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
