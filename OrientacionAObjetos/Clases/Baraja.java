package OrientacionAObjetos.Clases;

import OrientacionAObjetos.Clases.*;
import java.util.ArrayList;
import java.util.Collections;


public class Baraja {
    final int numCartasPorPalo = 13;
    final String[] palos = {"picas", "corazones", "treboles", "diamantes"};
    ArrayList<Carta> cartas = new ArrayList<Carta>();
    
    public Baraja (){
        this.Resetear();
    }

    // carta
    public ArrayList<Carta> getCartas(){
        return this.cartas;
    }

    public void setCartas(ArrayList<Carta> Newcartas){
        this.cartas = Newcartas;
    }

    // Metodos
    public void Barajar(){
        Collections.shuffle(this.cartas);
    }
    
    public void SacarCarta() {
        int PosicionCarta = (int) Math.random()*52;
        Carta element = this.cartas.get(PosicionCarta);
    }

    public void MeterCarta(Carta newCarta) {
        if(this.cartas.size() >= numCartasPorPalo*palos.length){
            System.out.println("Baraja llena");
            return;
        }
        this.cartas.add(newCarta); 
    }


    /*
        public void Ordenar(){
            Collections.sort(cartas);
        } 
   */

    public void Resetear(){
        this.cartas = new ArrayList<Carta>();

        for(int i = 0; i < palos.length; i++){
            for(int j = 0; j < numCartasPorPalo; j++){
                this.MeterCarta(new Carta(j + 1, palos[i]));
            }
        }
    }

    @Override
    public String toString(){
        String listaCartas = "";
        for(Carta carta : this.cartas){
            listaCartas += "- " + carta.getValor() + " de " + carta.getPalo();
        }
        return listaCartas;
    }
}
