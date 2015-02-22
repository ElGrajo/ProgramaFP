package strings;

/**
 *
 * Las clases StringBuilder y StringBuffer son similares a la clase String 
 * salvo por que los elementos de la clase String son inmutables.
 * En general, estas clases pueden ser usadas allá donde es usada la clase 
 * String y presentan la ventaja de que podemos crear, insertar y añadir 
 * nuevos elementos que no nos es posible en los String debido a su “rigidez”.
 */
public class StringBuliders {
     public static void main(String[] args){
         StringBuilder stringBuilder = new StringBuilder();
         StringBuilder referenciaSegunda = new StringBuilder();
         stringBuilder.append("Welcome");
         stringBuilder.append(' ');
         stringBuilder.append("to");
         stringBuilder.append(' ');
         stringBuilder.append("Java");
         
         //En el renglon de abajo, apunta referncia segunda al primer 
         //Stringbuilder
         referenciaSegunda = stringBuilder.reverse(); 
         
         //Pero si se ejecuta sin asignarlo, lo hace sobre si mismo
         // stringBuilder.reverse();
         
         System.out.println(stringBuilder);
         
         //Al modificar referencia segunda, tambien se modifica stringbuilder
         referenciaSegunda.deleteCharAt(0);      
         System.out.println(stringBuilder);
     }
}
