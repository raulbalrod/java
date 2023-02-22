import java.util.Scanner;

public class array10numerosdistintos {
    public static void main(String[] args) {
        Scanner scannercito = new Scanner(System.in);

        int numeros[] = new int[10];
        int contador0 = 0;
        int contadorpositivo = 0;
        int contadornegativo = 0;
        int acumuladorpositivo=0;
        int acumuladornegativo=0;
        int mediapositivo = 0;
        int medianegativo = 0;

        for(int i = 0; i < 10 ; i++)
        {
            System.out.println("Introduzca un numero:");
            numeros[i]= scannercito.nextInt();
        }
        for(int j = 0; j < numeros.length ; j++)
        {
            if(numeros[j] == 0)
            {
                contador0++;
            }
            else if(numeros[j] > 0)
            {
                contadorpositivo++;
                acumuladorpositivo += numeros[j];
            }
            else if (numeros[j] < 0)
            {
                contadornegativo++;
                acumuladornegativo += numeros[j];
            }
        }

        if(contadorpositivo > 0)
        {

        mediapositivo = acumuladorpositivo / contadorpositivo;
        System.out.println("La media de positivos es: " + mediapositivo + " y tiene " + contadorpositivo + " positivos");

        }else
            {
                System.out.println("No has introducido ningun numero");
            }

        if(contadornegativo > 0)
        {

        medianegativo = acumuladornegativo / contadornegativo;
        System.out.println("La media de negativos es: " + medianegativo + " y tiene " + contadornegativo + " negativos");

        }else
            {
                System.out.println("No has introducido ningun numero");
            }

        System.out.println("hay " +  contador0 + " ceros");
    }
}
