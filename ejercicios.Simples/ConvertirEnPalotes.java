import java.util.Scanner;

public class ConvertirEnPalotes {
    public static String Convertirenpalotes(String numero){
        String resultado = "";
        for(int i = 0;i < numero.length(); i++){
            if(numero.charAt(i) == '1'){
                resultado += "|";
            }else if(numero.charAt(i) == '2'){
                resultado += "||";
            }else if(numero.charAt(i) == '3'){
                resultado += "|||";
            }else if(numero.charAt(i) == '4'){
                resultado += "||||";
            }else if(numero.charAt(i) == '5'){
                resultado += "|||||";
            }else if(numero.charAt(i) == '6'){
                resultado += "||||||";
            }else if(numero.charAt(i) == '7'){
                resultado += "|||||||";
            }else if(numero.charAt(i) == '8'){
                resultado += "||||||||";
            }else if(numero.charAt(i) == '9'){
                resultado += "||||||||||";
            }else if(numero.charAt(i) == '0'){
                resultado += " -";
            }
            if(!(i == numero.length()-1)){
                resultado += "-";
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;

        System.out.println("Introduzca un numero");
        numero1 = sc.nextInt();

        String numero2 = String.valueOf(numero1);

        System.out.println(Convertirenpalotes(numero2));
    }
}
