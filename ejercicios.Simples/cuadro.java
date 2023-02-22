public class cuadro {
    public static void main(String[] args) {
        
        int[][] marco = new int[8][6];

        for(int i = 0; i < marco.length; i++){
            for(int j = 0; j < marco[i].length; j++){
                if(j == marco[i].length - marco[i].length  || j == marco[i].length-1 || i == marco.length-marco.length || i == marco.length-1){
                    System.out.print("1 ");

                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
