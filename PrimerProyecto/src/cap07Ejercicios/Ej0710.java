/*
7.10 (Comisión por ventas) Utilice un arreglo unidimensional para resolver el 
siguiente problema: una compañía paga a sus vendedores por comisión. 
Los vendedores reciben $200 por semana más el 9% de sus ventas totales de esa semana.
Por ejemplo, un vendedor que acumule $5000 en ventas en una semana, recibirá $200 
más el 9% de $5000, o un total de $650. Escriba una aplicación (utilizando un arreglo 
de contadores) que determine cuántos vendedores recibieron salarios en cada uno 
de los siguientes rangos (suponga que el salario de cada vendedor se trunca a una 
cantidad entera):
a) $200-299
b) $300-399
c) $400-499
d) $500-599
e) $600-699
f) $700-799
g) $800-899
h) $900-999
i) $1000 en adelante
Sintetice los resultados en formato tabular.
 */

package cap07Ejercicios;

/**
 *
 * @author Julian
 */
public class Ej0710 {
    final int salarioFijo = 200;
    final int porcentajeGananacia = 9;
    int rangos[] = new int [9];
    
    public boolean agregarTrabajador(int ventas){
        int sueldoEmpleado = salarioFijo + (ventas * porcentajeGananacia / 100);
        //Dos excepciones para que no se salga de rango.
        System.out.printf("El sueldo es: %d\n", sueldoEmpleado);
        if(sueldoEmpleado > 1000)
            sueldoEmpleado = 1000;
  
   
        //asigna el rango
        int rango = (sueldoEmpleado-salarioFijo)/100 ;
         ++rangos[rango];
        return true;


    }// final de agregarTrabajador
    
    public void mostrarResultados(){
        for(int i = 0; i < rangos.length; i++){
            int nroRango = i * 100 + salarioFijo;
            if (i == (rangos.length-1)){
                System.out.printf("Rango más de 1000: %d\n", 
                    rangos[i]);}
            else{
            System.out.printf("Rango: %d - %d: %d \n", nroRango, nroRango + 99, 
                    rangos[i]);}
        }
    }// final de mostrar resulstados
}
