import java.util.Scanner;

public class TresEnRaya {
        public static String AnalizarTablero(String[][] Array){
            String resultado = "";

            for(int i = 0; i < Array.length; i++){
                for(int j = 0; j < Array[i].length; j++){

                    if( Array[0][0].equals("x") && Array[0][1].equals("x") && Array[0][2].equals("x")){
                        resultado = "X";
                    }else if( Array[1][0].equals("x") && Array[1][1].equals("x") && Array[1][2].equals("x")){
                        resultado = "X";
                    }else if( Array[1][0].equals("x") && Array[1][1].equals("x") && Array[1][2].equals("x")){
                        resultado = "X";
                    }else if( Array[0][0].equals("x") && Array[1][0].equals("x") && Array[2][0].equals("x")){
                        resultado = "X";
                    }else if( Array[0][1].equals("x") && Array[1][1].equals("x") && Array[2][1].equals("x")){
                        resultado = "X";
                    }else if( Array[0][2].equals("x") && Array[1][2].equals("x") && Array[2][2].equals("x")){
                        resultado = "X";
                    }else if( Array[0][0].equals("x") && Array[1][1].equals("x") && Array[2][2].equals("x")){
                        resultado = "X";
                    }else if( Array[0][2].equals("x") && Array[1][1].equals("x") && Array[2][0].equals("x")){
                        resultado = "X";
                    }else if( Array[0][0].equals("o") && Array[0][1].equals("o") && Array[0][2].equals("o")){
                        resultado = "O";
                    }else if( Array[1][0].equals("o") && Array[1][1].equals("o") && Array[1][2].equals("o")){
                        resultado = "O";
                    }else if( Array[1][0].equals("o") && Array[1][1].equals("o") && Array[1][2].equals("o")){
                        resultado = "O";
                    }else if( Array[0][0].equals("o") && Array[1][0].equals("o") && Array[2][0].equals("o")){
                        resultado = "O";
                    }else if( Array[0][1].equals("o") && Array[1][1].equals("o") && Array[2][1].equals("o")){
                        resultado = "O";
                    }else if( Array[0][2].equals("o") && Array[1][2].equals("o") && Array[2][2].equals("o")){
                        resultado = "O";
                    }else if( Array[0][0].equals("o") && Array[1][1].equals("o") && Array[2][2].equals("o")){
                        resultado = "O";
                    }else if( Array[0][2].equals("o") && Array[1][1].equals("o") && Array[2][0].equals("o")){
                        resultado = "O";
                    }else {
                        resultado = "Empate";
                    }


                    
                }
            }

            
            return resultado;
        }
    public static void main(String[] args) {
        boolean verdad = true;
        Scanner sc = new Scanner(System.in);
        String[][] ejemplo ={
        {"x", " ", "x"},
        {"o", "o", "x"},
        {"x", "o", "o"}};

        do {
            
            for(int i = 0; i < ejemplo.length; i++){
                for(int j = 0; j < ejemplo[i].length; j++){
                    if(ejemplo[i][j].equals(" ")){
                        System.out.println("Ingrese otro dato");
                        ejemplo[i][j]= sc.next();
                        verdad = false;
    
                    }
                }
    
            }
            
        } while (verdad != false);

        String resultado2 =  AnalizarTablero(ejemplo);
        System.out.println(resultado2);
    }
}
