package Polimorfismo.Barco;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Tripulante> tripulantes = new ArrayList<Tripulante>();

        // Crear array de tripulantes
        Tripulante Juan = new JefeFlota(1, 53, 265, "Juan");
        Tripulante Emilio = new Capitan(2, 28, 150, "Emilio");
        Tripulante Fer = new Marinero(3, 43, 180, "Fer", 300);
        Tripulante Dani = new Marinero(4, 34, 450, "Dani", 500);

        tripulantes.add(Juan);
        tripulantes.add(Emilio);
        tripulantes.add(Fer);
        tripulantes.add(Dani);

        for(Tripulante t : tripulantes) {
            System.out.println(t.MostrarDato());
        }

        Gps gps = new Gps(2.3, 5.3, LocalDate.now());
        System.out.println(gps);

        Barco barco = new Barco("BarcoNombre", "Crucero", 500);
        
        // Setear datos gps + arraylist de tripulantes
        barco.setTripulantes(tripulantes);
        barco.setGps(gps);

        System.out.println(barco.toString());
    }
}
