package programejos;

import java.util.Scanner;

public class trampolin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         while(sc.hasNext()){
             double lasNotas[] = new double [7];
             double aux = 0;
             String StringNotas = sc.nextLine();
             String [] misNotas = (StringNotas.split(" "));
             for (int i = 0; i < misNotas.length; i++) {
                 lasNotas[i] = Double.parseDouble(misNotas[i]);
             }
             
             //Ordenar las notas
             for (int i = 0; i < 7; i++) {
                 for (int j = i + 1; j < 7; j++) {
                     if(lasNotas[i]> lasNotas[j]){
                         aux = lasNotas[i];
                         lasNotas[i] = lasNotas[j];
                         lasNotas[j] = aux;
                     }
                 }
             }
             
             //Sacar utilizar tres valores, y sacar cuenta
             double total = (lasNotas[2] + lasNotas[3] + lasNotas[4])* 2;
             System.out.printf("%.0f\n", total);
         }
    }
}
