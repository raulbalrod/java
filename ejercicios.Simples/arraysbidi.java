import java.util.Scanner;

public class arraysbidi {
    public static void main(String[] args) {
      int[][] numeros = new int[2][6];

      Scanner sc = new Scanner(System.in);

      for(int i = 0; i < numeros.length; i++){
        for(int j = 0; j < numeros[i].length; j++){
          System.out.println("Inserte numero");
          numeros[i][j] = sc.nextInt();

        }
      }
      for(int i = 0; i < numeros.length; i++){
        System.out.println("");
        System.out.print("[");
        for(int j = 0; j < numeros[i].length; j++){
        
          System.out.print(numeros[i][j]);
          if(j != numeros[i].length - 1){
            System.out.print(", ");
          }
        }
        System.out.print("]");
      }
    }
}
