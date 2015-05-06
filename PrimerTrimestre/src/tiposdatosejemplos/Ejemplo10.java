import java.io.*;

public class Ejemplo10
{
		
	public static void main(String args[])
	{
	
		char c='p';
		
		System.out.println("Decimal\t\t\t\tCaracter");
		System.out.println("-------------------------------------");
		
		for (int i=0; i<256; ++i){
		
		System.out.println("  "+i+"  \t\t\t\t   "+(char)i);
		
		}
		
		System.out.println("El valor de c es: "+c);
		c='r';
		System.out.println("El valor de c es: "+c);

	}
}