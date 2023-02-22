import java.util.Scanner;

public class vocal {
    public static boolean LeerCaracter(String respuesta){
        boolean repetir = true;
        int respuesta2 = respuesta.length();
        if(respuesta2 > 1){
            repetir = false;
        }
        return repetir;
    }
    public static boolean EsVocal(String respuesta){
        boolean resultado;
        if(respuesta.charAt(0) == 'a' || respuesta.charAt(0) == 'e' || respuesta.charAt(0) == 'i' || respuesta.charAt(0) == 'o' || respuesta.charAt(0) == 'u'){
            return resultado = true;

        }else{
            return resultado = false;
        }
        

    } 
    public static void main(String[] args) {
        String respuesta;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un caracter:");
    
             respuesta = sc.nextLine().toLowerCase();
            if(respuesta.equals(" ")){
                break;
            }

            if(EsVocal(respuesta) == true){
                System.out.println("Es vocal");
            }else if(EsVocal(respuesta) == false){
                System.out.println("No es vocal");
            }

        } while (LeerCaracter(respuesta) == false);


    }
}
