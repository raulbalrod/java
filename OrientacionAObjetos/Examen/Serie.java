package Examen;

public class Serie extends Contenido {
    // Variables
    private String tipoSerie;
    private int numeroCapitulos;
    private int numeroTemporadas;
    
    // Constructor
    public Serie(int id, String nombre, double duracion, int edadMinima, double numeroHorasReproducidas, String tipoSerie, int numeroCapitulos, int numeroTemporadas) {
        super(id, nombre, duracion, edadMinima, numeroHorasReproducidas);
        this.tipoSerie = tipoSerie;
        this.numeroCapitulos = numeroCapitulos;
        this.numeroTemporadas = numeroTemporadas;
    }

    // Getters && setters
    public String getTipoSerie() {
        return this.tipoSerie;
    }
    public void setTipoSerie(String tipoSerie) {
        this.tipoSerie = tipoSerie;
    }

    public int getNumeroCapitulos() {
        return this.numeroCapitulos;
    }
    public void setNumeroCapitulos(int numeroCapitulos) {
        this.numeroCapitulos = numeroCapitulos;
    }

    public int getnumeroTemporadas() {
        return this.numeroTemporadas;
    }
    public void setnumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    // toString
    @Override
    public String toString() {
        return "Pelicula [id= " + getId()
        + ", nombre= " + getNombre()
        + ", duracion= " + getDuracion()
        + ", edadMinima= " + getEdadMinima()
        + ", numeroHorasReproducidas= " + getNumeroHorasReproducidas()
        + ", tipoSerie= " + tipoSerie
        + ", numeroCapitulos= " + numeroCapitulos
        + ", numeroTemporales= " + numeroTemporadas
        + "]";
    }
}
