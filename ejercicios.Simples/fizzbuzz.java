public class fizzbuzz {
    public static void main(String[] args) {
        int numeros = 100;

        for(int i = 1; i<=numeros;i++){
            if(i%3==0){
                System.out.println("fizz");
            }else if(i%5==0){
                System.out.println("buzz");
            }else if(i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
