package Examen;

public class Pelicula extends Contenido {
    // Variables
    private String tipoPelicula;

    // Constructor
    public Pelicula(int id, String nombre, double duracion, int edadMinima, double numeroHorasReproducidas, String tipoPelicula) {
        super(id, nombre, duracion, edadMinima, numeroHorasReproducidas);
        this.tipoPelicula = tipoPelicula;
    }

    // Getters & setters
    public String getTipoPelicula() {
        return this.tipoPelicula;
    }
    public void setTipoPelicula(String tipoPelicula) {
        this.tipoPelicula = tipoPelicula;
    }

    // toString
    @Override
    public String toString() {
        return "Pelicula [id= " + getId()
        + ", nombre= " + getNombre()
        + ", duracion= " + getDuracion()
        + ", edadMinima= " + getEdadMinima()
        + ", numeroHorasReproducidas= " + getNumeroHorasReproducidas()
        + ", tipoPelicula=" + tipoPelicula 
        + "]";
    }
}
