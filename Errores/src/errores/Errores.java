package errores;
public class Errores {
    public static void main(String[] args) {
        /*
        String[] cursos= {"PHP", "Java", "C++"};
        System.out.println(cursos[3]);
        //java.lang.ArrayIndexOutOfBoundsException: 3
        //Esto solo se arregla cambiando el indice
                */
        
        float sum = 0;
        for(int i = 0; i < args.length; i++){
          sum  = sum + Float.parseFloat(args[i]);
        }
        System.out.println("El total es:" + sum);
    }
}
