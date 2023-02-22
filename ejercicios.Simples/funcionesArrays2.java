import java.util.Arrays;

public class funcionesArrays2 {

    public static int[] Push(int[]array, int n ){
        int[] array2 = new int [array.length+1];
        for(int i=0;i<0;i++){
            array2[i] = array[i];
        }
        array2[array2.length-1] = n;
        return array2;

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        array = Push(array, 4);
        System.out.println(Arrays.toString(args));
    }
}
