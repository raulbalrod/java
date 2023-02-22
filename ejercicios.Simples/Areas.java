import java.util.Scanner;

public class Areas {
    public static String Area(String area){
        String resultado = "";
        if(area.equalsIgnoreCase("triangulo")){
            resultado = "(base * altura)/ 2";
        }else if(area.equalsIgnoreCase("cuadrado")){
            resultado = "a^2";
        }else if(area.equalsIgnoreCase("rectangulo")){
            resultado = "base * altura";
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String respuesta = ""; 
        System.out.println("Introduzca que area desea saber");
        System.out.println("1.Triangulo");
        System.out.println("2.Cuadrado");
        System.out.println("3.Rectangulo");
        System.out.println();
        respuesta = sc.nextLine();

        System.out.println(Area(respuesta));



    }
}
