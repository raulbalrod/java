package Polimorfismo.Barco;

import java.time.LocalDate;

public class Gps {
    private double CoordenadaX;
    private double CoordenadaY;
    private LocalDate Fecha;
    
    public Gps(double coordenadaX, double coordenadaY, LocalDate fecha) {
        CoordenadaX = coordenadaX;
        CoordenadaY = coordenadaY;
        Fecha = fecha;
    }

    public double getCoordenadaX() {
        return this.CoordenadaX;
    }

    public double getCoordenadaY() {
        return this.CoordenadaY;
    }

    public LocalDate getFecha() {
        return this.Fecha;
    }

    public void setCoordenadaX(double newCoordenadaX) {
        CoordenadaX = newCoordenadaX;
    }

    public void setCoordenadaY(double newCoordenadaY) {
        CoordenadaY = newCoordenadaY;
    }

    public void setFecha(LocalDate newFecha) {
        Fecha = newFecha;
    }

    @Override
    public String toString() {
        return "Gps [CoordenadaX=" + CoordenadaX + ", CoordenadaY=" + CoordenadaY + ", Fecha=" + Fecha + "]";
    }
    
    
}
