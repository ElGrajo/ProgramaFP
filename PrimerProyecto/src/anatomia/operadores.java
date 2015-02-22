class Operadores {
    public static void main(String[] args){
        int altura = 123;
        int total = 325 + (altura *22);
        altura = altura % 7;
        
        System.out.println(total);
        
        int x = 3;
        int valor = x++ *10; //En incremento se hace más tarde entonces valor
        //vale 30, si fuera ++x entonces valor valdria 40
        System.out.println(valor);
        System.out.println(x);
        
    }
}