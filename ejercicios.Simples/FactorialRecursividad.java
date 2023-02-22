public class FactorialRecursividad {

    public static int factorial(int numero){
        if(numero == 1){
            return 1;
        }else {
            int res = numero * factorial(numero -1);
            return res;
        }


    }
    public static void main(String[] args) {
        int resultado = factorial(5);
        System.out.println(factorial(5));
    }
}
