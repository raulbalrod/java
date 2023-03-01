package Polimorfismo.Barco;

import java.util.ArrayList;

public class Barco {

    private String nombre;
    private String tipo;
    private int CapacidadPasajeros;
    private ArrayList<Tripulante> tripulantes;
    private Gps gps;
    private ArrayList<Sala> salas; 

    public Barco(
    String nombre, String tipo, int CapacidadPasajeros) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.CapacidadPasajeros = CapacidadPasajeros;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getCapacidadPasajeros() {
        return this.CapacidadPasajeros;
    }
  
    public ArrayList<Tripulante> getTripulantes() {
        return this.tripulantes;
    }

    public Gps getGps() {
        return this.gps;
    }

    public ArrayList<Sala> getSalas() {
        return this.salas;
    }

    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }

    public void setTipo(String newTipo) {
        this.tipo = newTipo;
    }

    public void setCapacidadPasajeros(int newCapacidadPasajeros) {
        CapacidadPasajeros = newCapacidadPasajeros;
    }

    public void setTripulantes(ArrayList<Tripulante> newTripulantes) {
        this.tripulantes = newTripulantes;
    }

    public void setGps(Gps newGps) {
        this.gps = newGps;
    }

    public void setSalas(ArrayList<Sala> newSala) {
        this.salas = newSala;
    }

    @Override
    public String toString() {
        return "Barco [nombre=" + nombre + ", tipo=" + tipo + ", CapacidadPasajeros=" + CapacidadPasajeros
                +  ", gps=" + gps + "]";
    }
}