package Polimorfismo.Barco;

import java.util.List;

public class Sala {
    private String nombreSala;
    private int aforoTotal;
    List<Tripulante> tripulantesEnSala;
    String[] rangosPermitidos = new String[3];

    public Sala(String nombreSala, int aforoTotal, List<Tripulante> tripulantesEnSala, String[] rangosPermitidos){
        this.nombreSala = nombreSala;
        this.aforoTotal = aforoTotal;
        this.tripulantesEnSala = tripulantesEnSala;
        this.rangosPermitidos = rangosPermitidos;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public int getAforoTotal() {
        return aforoTotal;
    }

    public List<Tripulante> getTripulantesEnSala() {
        return tripulantesEnSala;
    }
    
    public String[] getRangosPermitidos() {
        return rangosPermitidos;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public void setAforoTotal(int aforoTotal) {
        this.aforoTotal = aforoTotal;
    }

    public void setTripulantesEnSala(List<Tripulante> tripulantesEnSala) {
        this.tripulantesEnSala = tripulantesEnSala;
    }
    
    public void setRangosPermitidos(String[] rangosPermitidos) {
        this.rangosPermitidos = rangosPermitidos;
    }

    public void entrarSala(Tripulante tripulante){
        boolean entrarASala = false;
        for(int i=0; i<rangosPermitidos.length; i++){
            if(rangosPermitidos[i].equals(tripulante.getClass().getSimpleName())){
                entrarASala = true;
            }
        }
        if(entrarASala){
            tripulantesEnSala.add(tripulante);
            System.out.println("El tripulante tiene permiso para entrar en la sala. Ahora hay "+getTripulantesEnSala().size()+" tripulantes en la sala.");
        }else{
            System.out.println("Este tripulante no tiene acceso a esta sala.");
        }
    }

    @Override
    public String toString(){
        return "Datos de la sala: "+
        "\nNombre de la sala: "+this.nombreSala+
        "\nAforo total: "+this.aforoTotal;
    }
}