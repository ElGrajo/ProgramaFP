package ficherosjava;

import java.io.File;
/**
 * Trabajo con archivos
 */
public class FicherosJava {
    public static void main(String[] args) {
        String archivo = "src/FicherosJava/archivo.java";
        File file = new File(archivo);
        System.out.println("Existe fichero: "+file.exists());
        System.out.println("La longitud es de "+file.length()+" bytes");
        System.out.println("Puede ser leido?"+ file.canRead());
        System.out.println("Puede ser escrito?"+ file.canWrite());
        System.out.println("Puede ser directorio?" + file.isDirectory());
        System.out.println("Es un archivo?" +file.isFile());
        System.out.println("la ruta absoluta es:" +file.getAbsolutePath());
        System.out.println("la ultima modificacion:" +file.lastModified());     
    }
    
}
