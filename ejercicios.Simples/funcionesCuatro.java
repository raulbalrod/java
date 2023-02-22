import java.util.Arrays;
import java.util.Scanner;

public class funcionesCuatro {
    public static char[] convertirEnChar(String texto){
        char[] letras = new char [texto.length()];
        for(int i =0; i < texto.length(); i++){
            letras[i] = texto.charAt(i);
        }
        return letras;
    }

    public static int[] NumeroDeVeces(String texto){
        char[] cadena = new char[texto.length()];
        char caracter;
        int[] contador= new int [texto.length()];
        int contador2=0;

        cadena = texto.toCharArray();
        for(int i =0; i < cadena.length; i++){
            caracter = cadena[i];

            for(int j =0; j < cadena.length; j++){
                if(cadena[j] == caracter){
                    contador2++;
                    contador[i]= contador2;
                }
            }
        }
        
        return contador;
    }


    public static void main(String[] args) {
        String texto;
        char[] cadena;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un texto");
        texto = sc.nextLine();
        cadena = texto.toCharArray();
        convertirEnChar(texto);
        System.out.println(Arrays.toString(convertirEnChar(texto)));

        int[] contador = NumeroDeVeces(texto);
        for(int i =0; i < cadena.length;i++){
            System.out.print(cadena[i]);
            for(int j =0; j < cadena.length;j++){
                System.out.print(" " + contador[j]);
                System.out.println();
            }
        }


    }
}
