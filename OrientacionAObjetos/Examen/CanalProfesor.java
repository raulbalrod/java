package Examen;

public class CanalProfesor extends Contenido {
    // Variables
    private Profesor profesor;
    private boolean enDirecto;

    // Constructor
    public CanalProfesor(int id, String nombre, double duracion, int edadMinima, double numeroHorasReproducidas, Profesor profesor, boolean enDirecto) {
        super(id, nombre, duracion, edadMinima, numeroHorasReproducidas);
        this.profesor = profesor;
        this.enDirecto = enDirecto;
    }

    // Getters & setters
    public Profesor getProfesor() {
        return this.profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public boolean isEnDirecto() {
        return this.enDirecto;
    }
    public void setEnDirecto(boolean enDirecto) {
        this.enDirecto = enDirecto;
    }

    // toString
    @Override
    public String toString() {
        return "Pelicula [id= " + getId()
        + ", nombre= " + getNombre()
        + ", duracion= " + getDuracion()
        + ", edadMinima= " + getEdadMinima()
        + ", numeroHorasReproducidas= " + getNumeroHorasReproducidas()
        + ", profesor= " + profesor
        + ", enDirecto= " + enDirecto
        + "]";
    }
    
    
}
