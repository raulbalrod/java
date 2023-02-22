import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner scanercito = new Scanner(System.in);

        
        int maquina;
        int recargar = 1;
        int bloquear = 2;
        int disparar = 3;
        int balajugador = 0;
        int balamquina = 0;

         maquina = (int)(Math.random()*3+1);
        do {
            
        
        System.out.println("Introduce la primera opción que vas a elegir: 1.Recargar 2.Bloquear 3.Disparar");
        int jugador = scanercito.nextInt();



            if(jugador == disparar && maquina == bloquear || maquina == disparar && jugador == bloquear || jugador == disparar && maquina == disparar)
            {
                if(jugador == disparar)
                {
                balajugador--;
                }else if(jugador == recargar)
                {
                balajugador++;
                }
                if(maquina == disparar)
                {
                    balamquina--;
                }else if(maquina == recargar)
                {
                    balamquina++;
                }
                System.out.println(" Empate sigue la ronda ");
                System.out.println("jugador: " + balajugador);
                System.out.println("maquina" + balamquina);
            }
        if(jugador == disparar && maquina == recargar || maquina == disparar && jugador == recargar){

         if(jugador == disparar && maquina == recargar)
        {
            System.out.println("El jugador ha ganado la partida");
            System.out.println("jugador: " + balajugador);
            System.out.println("maquina: " +  balamquina);
        } else if(maquina == disparar && jugador == recargar)
        {
            System.out.println("La maquina ha ganado la partida");
            System.out.println("jugador: " + balajugador);
            System.out.println("maquina: " +  balamquina);
        }
        }
    } while (balajugador > 0 && balamquina >  0 );
    }
}
