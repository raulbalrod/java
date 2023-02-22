import java.util.Arrays;

public class SumaMatrices {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {4 ,4 ,4}, {9, 0, 9}};
        int[][] array2 = {{3, 2, 1}, {0, -3, 7}, {1, 2, 3}};
        int[][] total =  new int [3][3];


        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array1[i].length; j++){
                total[i][j]= array1[i][j] + array2[i][j];
            }
        }

        for(int i = 0; i < total.length; i++){
           System.out.println(Arrays.toString(total[i]));
        }
    }
}
