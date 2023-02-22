import java.util.Scanner;

public class MetodoCesar {
    public static String cifradoCesar(String cadenaAcifrar){
        String resultado="";
        for(int i = 0; i < cadenaAcifrar.length();i++){
            
            int n = 0;
            n = cadenaAcifrar.charAt(i);
            if(n > 119){
                n = n - 23;
            }else{
                n = n + 3;
            }
            
            resultado += (char)n;
        }
        return resultado;
    }


    public static String descifradoCesar(String cadenaADescifrar){
        String resultado="";
        for(int i = 0; i < cadenaADescifrar.length();i++){
            int n = 0;
            n = cadenaADescifrar.charAt(n);
            if(n < 97){
                n = n + 23;
            }else{
                n = n - 3;
            }
            
            resultado += (char)n;
        }

        return resultado;
    }



    public static void main(String[] args) {
        System.out.println("introduzca su frase a cifrar");
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        
        System.out.println(cifradoCesar(palabra));

        System.out.println(descifradoCesar(palabra));
    }
}
