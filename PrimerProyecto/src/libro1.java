import java.util.Scanner; // agregando la clase scanner
public class libro1{
 public static void main(String[] args) {
     // Imprimir varias líneas con una sola instrucción
     System.out.printf("%s\n %s\n", "Probando", "el nuevo pdf");
     
     // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner( System.in );
        int numero1; // primer número a sumar
        int numero2; // segundo número a sumar
        int suma; // suma de numero1 y numero2
        
        System.out.print( "Escriba el primer entero: " ); // indicador
        numero1 = entrada.nextInt(); // lee el primer número del usuario
        
        System.out.print( "Escriba el segundo entero: " ); // indicador
        numero2 = entrada.nextInt(); // lee el segundo número del usuario
        suma = numero1 + numero2; // suma los números
        System.out.printf( "La suma es %d\n", suma ); // muestra la suma
        if ( numero1 == numero2 ) 
            System.out.printf( "%d == %d\n", numero1, numero2 );
        if ( numero1 != numero2 )
            System.out.printf( "%d != %d\n", numero1, numero2 );
        if ( numero1 < numero2 )
            System.out.printf( "%d < %d\n", numero1, numero2 );
    if ( numero1 > numero2 )
       System.out.printf( "%d > %d\n", numero1, numero2 );
    if ( numero1 <= numero2 )
        System.out.printf("%d <= %d\n", numero1, numero2 );
     
 }

}