import java.util.Scanner;

public class RegalosEnvueltos {
    public static String[] regalos = new String [3];
    public static String[] terminado = new String [3];
    public static void Envolver(){
        for(int i = 0; i < regalos.length; i++){
            String regalosenvueltos = "";
            regalosenvueltos += "*";
            for(int j = 0; j < regalos[i].length(); j++){
                regalosenvueltos += "*";
            }
            regalosenvueltos += "*";

            regalosenvueltos += "\n";

            regalosenvueltos += "*";
            regalosenvueltos += regalos[i];
            regalosenvueltos += "*";

            regalosenvueltos += "\n";

            regalosenvueltos += "*";
            for(int j= 0; j < regalos[i].length(); j++ ){
                regalosenvueltos += "*";
            }
            regalosenvueltos += "*";

            terminado[i] = regalosenvueltos;

        }
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los regalos");

        for(int i=0; i < regalos.length; i++){
            System.out.println("Ingrese el regalo " + i);
            regalos[i] = sc.nextLine();
        }


        System.out.println("Estos son los regalos envueltos");
        System.out.println();
        Envolver();
        for(int i=0; i<terminado.length; i++){
            System.out.println();
            System.out.println(terminado[i]);
        }
    }
}
