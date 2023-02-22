import java.util.Scanner;

public class funciones2 {
    
    public static int Doble(int numero){
        int res = numero * numero;
        return res;
    }

    public static int Potencia(int x, int numero){
        int res = 1;
        for(int i = 1 ; i <= x; i++){
            res *= numero;

        }
        return res;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para el doble");
        int numero1 = sc.nextInt();

        System.out.println(Doble(numero1));

        System.out.println("Ingrese un numero para la potencia");
        int numero2 = sc.nextInt();
        System.out.println("veces de la potencia");
        int Npotencia = sc.nextInt();

        System.out.println(Potencia(Npotencia, numero2));
        
    }
}
