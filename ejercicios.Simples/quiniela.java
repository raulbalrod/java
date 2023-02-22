import java.util.Arrays;

public class quiniela {
    public static void main(String[] args) {
        String[][] quiniela = new String[15][5];
        
        double resultado;

        for(int i = 0; i <quiniela.length; i++){
            for(int j = 0; j < quiniela[i].length;j++){
                resultado = Math.random() * 100;
                if(resultado >= 50){
                    quiniela[i][j] = "1";
                }else if((resultado<50) && (resultado>=20)){
                    quiniela[i][j] = "X";
                }else{
                    quiniela[i][j] = "2";
                }
            }
        }
        for(int i=0; i < quiniela.length; i++){
            System.out.println();
            System.out.println();
            System.out.print("partido " + (i+1) + "\t" );
            for(int j =0; j<quiniela[i].length;j++){
        
                System.out.print(quiniela[i][j] + " ");
                
                
                
            }
        }
    }
}
