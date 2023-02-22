public class fibonacci {
    public static int fibonacci(int numero){
        if(numero > 1){
            return fibonacci(numero-1) + fibonacci(numero-2);
        }else if(numero == 1){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int resultado = fibonacci(8);
        System.out.println(resultado);
        
    }
}
