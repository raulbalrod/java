import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static boolean Anagrama(String palabra1 , String palabra2){
        char [] c1 = palabra1.toCharArray();
        char [] c2 = palabra2.toCharArray(); 
        
        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1, c2)){
            return true;
        }else{
            return false;
        }
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra1 = "";
        String palabra2 = "";
        System.out.println("Juego de la palabra Anagrama");
        System.out.println();
        do {
            
            System.out.println("Inserte la primera palabra");
            palabra1 = sc.nextLine();
            System.out.println("Inserte la segunda palabra");
            palabra2 = sc.nextLine();
                
        } while (!(palabra1.length() == palabra2.length()) && palabra1.equals(palabra2));

        Anagrama(palabra1, palabra2);
        if(Anagrama(palabra1, palabra2) == true){
            System.out.println("La palabra es Anagrama");
        }else{
            System.out.println("La palabra no es Anagrama");
        }
    }
}
