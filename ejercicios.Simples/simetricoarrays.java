import javax.swing.plaf.TreeUI;

public class simetricoarrays {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {2,5,0}, {3,0,5}};
        int[][] traspuesta = new int[3][3];
        boolean simetricas = true;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                traspuesta[j][i] = matriz[i][j];   
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(matriz[i][j] != traspuesta[i][j]){
                    simetricas = false;
                }   
            }
        }

        if(simetricas == true){
            System.out.println("Son simetricas.");
        }else{
            System.out.println("No son simetricas.");
        }
    }
}
