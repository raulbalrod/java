import java.util.Scanner;

public class Numcredecredesorde {
    public static void main(String[] args) {
        
        Scanner scannercito = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean creciente = true;
        boolean decreciente = true;
        ;

     for(int i = 0; i < numeros.length; i++)
        {
            System.out.println("Introduzca 10 numeros");
            numeros[i] = scannercito.nextInt();
        }
       for(int j = 0; j < numeros.length-1; j++){
            
            if(numeros[j]>numeros[j+1]){
                creciente = false;
            }else if(numeros[j]<numeros[j+1]){
                decreciente = false;
            }

        }

        if(creciente == true && decreciente == true){
            System.out.println("Son iguales");
        }else if(creciente == true && decreciente == false){
            System.out.println("Es creciente");
        }else if(decreciente == true && creciente == false){
            System.out.println("Es decreciente");
        }else {
            System.out.println("Estan desordenados");
        }
    }
}

