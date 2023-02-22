import java.util.Scanner;

public class array5numeros {
    public static void main(String[] args) {
        Scanner scannercito = new Scanner(System.in);
       
        int numeros[] = new int[5];
        System.out.println("Introduce 5 numeros: ");
       
       
        for(int i = 0; i < 5; i++)
        {
             numeros[i] = scannercito.nextInt();
        }
        for(int j = 4; j >= 0; j--)
        {
            System.out.println(numeros[j]);
        }
    }
}