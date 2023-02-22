import java.util.Scanner;

public class CodigoMorse {
    public static String Morse(String frase){
        String minuscula = frase.toLowerCase();
        String Resultado ="";
        for(int i=0; i <minuscula.length(); i++){
            if( minuscula.charAt(i) == 'a'){
                Resultado += ".- ";
            }else if(minuscula.charAt(i) == 'b'){
                Resultado += "-... ";
            }else if(minuscula.charAt(i) == 'c'){
                Resultado += "-.-. ";
            }else if(minuscula.charAt(i) == 'd'){
                Resultado += "-.. ";
            }else if(minuscula.charAt(i) == 'e'){
                Resultado += ". ";
            }else if(minuscula.charAt(i) == 'f'){
                Resultado += "..-. ";
            }else if(minuscula.charAt(i) == 'g'){
                Resultado += "--. ";
            }else if(minuscula.charAt(i) == 'h'){
                Resultado += ".... ";
            }else if(minuscula.charAt(i) == 'i'){
                Resultado += ".. ";
            }else if(minuscula.charAt(i) == 'j'){
                Resultado += ".--- ";
            }else if(minuscula.charAt(i) == 'k'){
                Resultado += "-.- ";
            }else if(minuscula.charAt(i) == 'l'){
                Resultado += ".-.. ";
            }else if(minuscula.charAt(i) == 'm'){
                Resultado += "-- ";
            }else if(minuscula.charAt(i) == 'n'){
                Resultado += "-. ";
            }else if(minuscula.charAt(i) == 'o'){
                Resultado += "--- ";
            }else if(minuscula.charAt(i) == 'p'){
                Resultado += "-.-. ";
            }else if(minuscula.charAt(i) == 'q'){
                Resultado += "-.-. ";
            }else if(minuscula.charAt(i) == 'r'){
                Resultado += "-.-. ";
            }else if(minuscula.charAt(i) == 's'){
                Resultado += "-.-. ";
            }else if(minuscula.charAt(i) == 't'){
                Resultado += "-.-. ";
            }else if(minuscula.charAt(i) == 'u'){
                Resultado += "-.-. ";
            }else if(minuscula.charAt(i) == 'v'){
                Resultado += "-.-. ";
            }else if(minuscula.charAt(i) == 'w'){
                Resultado += "-.-. ";
            }else if(minuscula.charAt(i) == 'x'){
                Resultado += "-.-. ";
            }else if(minuscula.charAt(i) == 'y'){
                Resultado += "-.-. ";
            }else if(minuscula.charAt(i) == 'z'){
                Resultado += "-.-. ";
            }else if(frase.charAt(i) == ' '){
                Resultado += " // ";
            }
        }
        return Resultado;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la frase para pasar a morse");
        System.out.println();
        String frase = sc.nextLine();

        System.out.println(Morse(frase));


    }
}
