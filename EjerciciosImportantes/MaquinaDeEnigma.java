import java.util.Scanner;

public class MaquinaDeEnigma {

    public static String cifrado1(String texto, int n){
        String resultado1 ="";
        String resultado2 ="";
        String resultado3 ="";
        int aux=0;

        String abc = "BDFHJLCPRTXVZNYEIWGAKMUSQO";
        String abcRotor1 = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
        String abcRotor2 = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
        for(int i=0; i <texto.length();i++){
            aux=0;
            for(int j=0; j < abc.length(); j++){
                if(texto.charAt(i) == abc.charAt(j)){
                aux = j + n + i;
                if(aux > abc.length()){
                    aux -= abc.length();
                } 
                    
                    
                }
                
            }
            resultado1 += abc.charAt(aux);
        }
        for(int i=0; i <resultado1.length();i++){
            aux=0;
            for(int j=0; j < abc.length(); j++){
                if(resultado1.charAt(i) == abc.charAt(j)){
                    
                    aux += j;
                    if(aux > abc.length()){
                        aux -= abc.length();
                    }
                    
                }
                
            }
            resultado2 += abcRotor1.charAt(aux);
        }
        for(int i=0; i <resultado2.length();i++){
            aux=0;
            for(int j=0; j < abcRotor1.length(); j++){
                if(resultado2.charAt(i) == abcRotor1.charAt(j)){
                    
                    aux += j;
                    if(aux > abc.length()){
                        aux -= abc.length();
                    }
                    
                }
                
            }
            resultado3 += abcRotor2.charAt(aux);
        }
        return resultado3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduzca una frase");
        String texto = sc.nextLine().toUpperCase();
        System.out.println("Introduce numero de veces en cifrado cesar");
        int numero = sc.nextInt();

        String resultado = cifrado1(texto,numero);

        System.out.println(resultado); 

    }
}
