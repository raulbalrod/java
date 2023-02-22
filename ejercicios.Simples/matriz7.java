import java.util.Arrays;
import java.util.Scanner;

public class matriz7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce numero de la matriz");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i==j){
                    matriz[i][j]= 1;

                }else{
                    matriz[i][j]= 0;
                }
            }
        }
        for(int i = 0; i < matriz.length; i++){
            System.out.println(Arrays.toString(matriz[i]));
        }
        

    }
}
