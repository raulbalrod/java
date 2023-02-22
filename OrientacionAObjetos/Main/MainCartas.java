import java.util.Arrays;

import OrientacionAObjetos.Clases.*;

public class MainCartas {
    public static void main(String[] args) {

        Carta[] oros = generarCartas(10, "oro");
        Carta[] bastos = generarCartas(10, "bastos");
        Carta[] espadas = generarCartas(10, "espadas");
        Carta[] copas = generarCartas(10, "copas");

        Carta[] baraja = new Carta[oros.length + bastos.length + espadas.length + copas.length];
        for(int i = 0; i < oros.length; i++){
            baraja[i] = oros[i];
            baraja[i + 10] = copas[i];
            baraja[i + 20] = espadas[i];
            baraja[i + 30] = bastos[i];
        }
        
        for(int i = 0; i < baraja.length; i++){
            mostrarcartas(baraja[i]);
        }
    }


    static Carta[] generarCartas(int numCartas, String palo){
        Carta[] cartas = new Carta[numCartas];
        for(int i = 0; i < cartas.length; i++){
            Carta micarta = new Carta();

            micarta.valor = i+1;
            micarta.palo = palo;

            cartas[i] = micarta;
        }
        return cartas;
    }


    static void mostrarcartas(Carta carta){
        System.out.println(carta.valor + " de " + carta.palo);
    }

    
}
