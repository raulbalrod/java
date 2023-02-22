import java.util.Scanner;

public class atleta {
    public static String[]respuesta = new String[5];
    public static String pista = "|_|_|";
    public static String pistanueva = "";
    public static boolean resultado = true;

    public static void resultrado(){
        for(int i = 0; i < respuesta.length; i++){
            if((respuesta[i].equals("run")) && (pista.charAt(i) == '|')){
                pistanueva += "/";
                resultado = false;
            }else if((respuesta[i].equals("jump")) && (pista.charAt(i) == '_')){
                pistanueva += "x";
                resultado = false;
            }else{
                pistanueva += pista.charAt(i);
            }
        }
        System.out.println("Asi queda la pista " + pistanueva);
        if(resultado == true){
            System.out.println("Ha pasado la prueba bien hecho :)");
        }else if(resultado == false){
            System.out.println("No ha pasado la prueba correctamente");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese sus acciones");
        System.out.println();
        for(int i =0; i < respuesta.length; i++){
            respuesta[i] = sc.nextLine().toLowerCase();
        }

        resultrado();
    }
}
