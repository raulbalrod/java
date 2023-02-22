import java.util.Scanner;

public class arrys4 {
    public static void main(String[] args) {
    Scanner scannercito = new Scanner(System.in);
        int[] numeros = new int [10];
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese un numero hasta 10");
            numeros[i] = scannercito.nextInt();
        }
        for(int i=0; i < numeros.length/2; i++){
            System.out.print(numeros[i] + ", ");
            System.out.print(numeros[(numeros.length-1)-i] + ", ");
        }
    }
}
