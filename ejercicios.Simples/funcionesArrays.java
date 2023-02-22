import java.util.Scanner;

public class funcionesArrays {
    
    public static int Array1(int[] array, int n){
        
        int exit = array[array.length-1];
        for(int i = array.length-1; i>0; i--){
            array[i] = array[i-1];
        }
        array[0] = n;
        return exit;
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
    }
}
