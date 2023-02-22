import java.security.PublicKey;
import java.util.Scanner;

public class funciones {

    public static  int NumeroMayor(int a , int b){
            if(a > b){
                return a;
            } else{
                return b;
            }
    }

    public static double ConvertirDolarAEuro(double dolar, double euro){
        double total;
        return total = dolar * 0.97;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserte cuantos dolares quieres cambiar a euro");
        double dolar = sc.nextDouble();
        double euro = 0.97;

        System.out.println("Su cambio a euros es: " + (double)Math.round(ConvertirDolarAEuro(dolar, euro)*100)/100 + " euros"); 
    }
}
