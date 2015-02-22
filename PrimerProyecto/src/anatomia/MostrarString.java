class MostrarString {
    public static void main(String[] args){
        char valor = 'H';
        System.out.println("Aqui escribirmos el texto");
        System.out.println("La mejor cancion de Victor Jara es:\n\"Te recuerdo Amanda\"");
        System.out.println("Canción más bonita de Die Toten Hosen es\t Unsterblich");
        //Operador de concatenacion
        System.out.println("Estas líneas van " +
                "unidas en el texto final" + valor);
        
        //Concatenacion +=
        String palabrasClave = "";
        palabrasClave = palabrasClave + "videotutoriales ";
        palabrasClave = palabrasClave + "flash ";
        
        palabrasClave += "php";
        System.out.println(palabrasClave);
        
        // Método Equals
        String respuesta = "Amarillo";
        String resultado = "verde";
        System.out.println("Has respondido que el color es " + resultado + "?");
        System.out.println("Respuesta:" + respuesta.equals(resultado));
        System.out.println(respuesta.length());
        
        System.out.println(respuesta.toLowerCase());
        System.out.println(respuesta.toUpperCase());
        
        System.out.println(respuesta.indexOf("ma"));
    }
}