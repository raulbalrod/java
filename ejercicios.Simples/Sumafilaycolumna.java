import java.util.Random;
import java.util.Scanner;

public class Sumafilaycolumna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];
        int sumafila = 0;
        int sumacolumna = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length;j++){
                matriz[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                sumafila =  sumafila + matriz[i][j];

            }
            System.out.println("la suma de la fila " + i + " es: " + sumafila);
            sumafila = 0;



            for(int j = 0; j < matriz[i].length; j++){
                sumacolumna = sumacolumna + matriz[j][i];

            }
            System.out.println("la suma de la columna" + i + "es: " + sumacolumna);
        }



    }
}
