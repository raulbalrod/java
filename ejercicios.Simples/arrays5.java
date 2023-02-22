import java.util.Scanner;

public class arrays5 {
    public static void main(String[] args) {
        Scanner scannercito = new Scanner(System.in);

        int[] numeros = new int[10];
        int cambio = 0;

        for(int i = 0; i < numeros.length; i++)
        {
            System.out.println("Ingrese 10 Numeros");
            numeros[i] = scannercito.nextInt();
        }
        System.out.println();

        for(int j = numeros.length -1; j > 0; j--)
        {
            if(numeros[j] == numeros.length -1)
            {
            cambio = numeros[j];
            }
            numeros[j] = numeros[j-1];
           
        }
        numeros[0] = cambio;

        for(int i = 0; i < numeros.length; i++)
        {
            System.out.println(numeros[i]);
        }
    }
}
