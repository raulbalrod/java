package Examen;

public abstract class Contenido {
    // Variables
    private int id;
    private String nombre;
    private double duracion;
    private int edadMinima;
    private double numeroHorasReproducidas;

    // Constructor
    public Contenido(int id, String nombre, double duracion, int edadMinima, double numeroHorasReproducidas) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.numeroHorasReproducidas = numeroHorasReproducidas;
    }

    // Getters & setters
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return this.duracion;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return this.edadMinima;
    }
    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public double getNumeroHorasReproducidas() {
        return this.numeroHorasReproducidas;
    }
    public void setNumeroHorasReproducidas(double numeroHorasReproducidas) {
        this.numeroHorasReproducidas = numeroHorasReproducidas;
    }

    // toString
    @Override
    public String toString() {
        return "Contenido [id=" + id 
        + ", nombre=" + nombre 
        + ", duracion=" + duracion 
        + ", edadMinima=" + edadMinima
        + ", numeroHorasReproducidas=" + numeroHorasReproducidas 
        + "]";
    }
}
