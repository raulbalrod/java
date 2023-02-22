

import java.util.*;

public class HundirFlota {
    public static int numFilas = 10; 
    public static int numColumnas = 10; 
    public static int barcosJugador = 5;
    public static int barcosOrdernador = 5;
    public static String[][] tablero = new String[10][10]; 
    public static int[][] disparoFallado = new int[0][0]; 

    public static void main(String[] args){
        System.out.println("##### HUNDIR LA FLOTA #####");
        System.out.println("El océano está vacío\n");

        
        crearMapaOceano();
        
        despliegueBarcosJugador();

        
        despliegueBarcosOrdernador();

        do {
            combate();
        }while((barcosJugador != 0) && (barcosOrdernador != 0));

        gameOver();
    }

    public static void crearMapaOceano(){
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[i].length; j++){
                tablero[i][j] = "  ";

            }
        }
    }
    public static void imprimirMapaOceano(){
        System.out.print("   0 1 2 3 4 5 6 7 8 9");
        for(int i = 0; i < tablero.length; i++){
            System.out.println();
            System.out.print(i + "|");
            
            for(int j = 0; j < tablero[i].length; j++){
                System.out.print(tablero[i][j]);
                
            }
            System.out.print(" |" + i);
        }
        System.out.println();
        System.out.println("   0 1 2 3 4 5 6 7 8 9");
        
    }

    public static void despliegueBarcosJugador(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nDespliega tus barcos:");
        HundirFlota.barcosJugador = 5;
        for(int i = 1; i <= HundirFlota.barcosJugador;){
            int x = input.nextInt();
            int y = input.nextInt();

            if((x >= 0 && x < numFilas) && (y >= 0 && y < numColumnas) && (tablero[x][y] == "  "))
            {
                tablero[x][y] =  " J";
                System.out.println(i + ". barco desplegado");
                i++;
            }
            
        }
        imprimirMapaOceano();
    }

    public static void despliegueBarcosOrdernador(){
        System.out.println("\nEl ordenador está colocando sus barcos");
        
        HundirFlota.barcosOrdernador = 5;
        for (int i = 1; i <= HundirFlota.barcosOrdernador;) {
            int x = (int)(Math.random() * 10);
            int y = (int)(Math.random() * 10);

            if((x >= 0 && x < numFilas) && (y >= 0 && y < numColumnas) && (tablero[x][y] == "  "))
            {
                tablero[x][y] =   " O";
                System.out.println(i + ". barco desplegado");
                i++;
            }else{
                System.out.println("Repite posicion de barco");
            }
        }
        
        imprimirMapaOceano();
    }

    public static void combate(){
        
        turnoJugador();
        
        turnoOrdenador();

        imprimirMapaOceano();

        System.out.println();
        System.out.println("Barcos del jugador: " + barcosJugador +
         " | Barcos del ordenador: " + barcosOrdernador);
        System.out.println();
    }

    public static void turnoJugador(){
        System.out.println("\n¡Es tu turno!");
        int x = -1, y = -1;
        int tmp = 0;
        do {
            Scanner input = new Scanner(System.in);

            x = input.nextInt();
            y = input.nextInt();

            if((x >= 0 && x < numFilas) && (y >= 0 && y < numColumnas) && (tablero[x][y] == " O" )){
                tablero[x][y] = " X";
                barcosOrdernador--;
                tmp++;
            }else if((x >= 0 && x < numFilas) && (y >= 0 && y < numColumnas) && (tablero[x][y] == "  ")){
                tablero[x][y] = " _";
                tmp++;
            }
            
        }while(tmp < 1); 
    }

    public static void turnoOrdenador(){
        System.out.println("\n¡Turno del ordenador!");
        int x = -1, y = -1;
        int tmp = 0;
        do {
            
            x = (int)(Math.random() * 10);
            y = (int)(Math.random() * 10);

            if((x >= 0 && x < numFilas) && (y >= 0 && y < numColumnas) && (tablero[x][y] == " J" )){
                tablero[x][y] = " !";
                barcosJugador--;
                tmp++;
            }else if((x >= 0 && x < numFilas) && (y >= 0 && y < numColumnas) && (tablero[x][y] == "  ")){
                tablero[x][y] = " _";
                tmp++;
            }

        }while(tmp < 1);
    }

    public static void gameOver(){
        System.out.println("Tus barcos: " + barcosJugador + 
         " | Barcos del ordenador: " + barcosOrdernador);
        if(barcosOrdernador == 0){
            System.out.println("¡Enhorabuena! Has ganado la batalla :)");
        }else if(barcosJugador == 0){
            System.out.println("Has perdido la batalla");
        } 
        System.out.println();
    }   
}
