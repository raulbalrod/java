import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner scannercito = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int posicion = 0;

        for(int i = 0; i < numeros.length - 2; i++){
            System.out.println("Ingrese 8 valores");
            numeros[i] = scannercito.nextInt();
        }
        System.out.println("Inserte la posicion del cambio de numero");
        posicion = scannercito.nextInt();

        for(int j = numeros.length-1; j > posicion; j--){
            
            numeros[j] = numeros[j-1];
            
        }
        System.out.println("Inserte un numero");
        numeros[posicion] = scannercito.nextInt();

        for(int i = 0; i<numeros.length; i++){
            System.out.print(numeros[i]);
        }

    }
}
