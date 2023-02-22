import java.util.Scanner;

public class arraysMAXvalue {
    public static void main(String[] args) {
        Scanner scannercito = new Scanner(System.in);
        int[] numeros = new int[10];
        int mayor = 0;
        int menor = 500;
        int posicionmayor = 0;
        int posicionmenor = 0;

        for(int i = 0; i < numeros.length; i++ ){
            System.out.println("Ingrese un numero hasta que llegues a 10");
            numeros[i] = scannercito.nextInt();
        }

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i]>mayor){
                mayor = numeros[i];
                posicionmayor = i;
            }

            if(numeros[i] <= menor){
                menor = numeros[i];
                posicionmenor = i;
            }
        }
        System.out.println("El numero mayor es: " + mayor + " y posicion " + posicionmayor);
        System.out.println("El numero menor es: " + menor + " y posicion " + posicionmenor);
    }
}
