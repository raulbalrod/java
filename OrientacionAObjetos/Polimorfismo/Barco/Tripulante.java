package Polimorfismo.Barco;

public abstract class Tripulante {
    private int id;
    private int edad;
    private int TiempoEmpresa;
    private String nombre;

    public Tripulante(int id, int edad, int TiempoEmpresa, String nombre) {
        this.id = id;
        this.edad = edad;
        this.TiempoEmpresa = TiempoEmpresa;
        this.nombre = nombre;
    }

    public int getId() {
        return this.id;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getTiempoEmpresa() {
        return this.TiempoEmpresa;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public void setEdad(int newEdad) {
        this.edad = newEdad;
    }

    public void setTiempoEmpresa(int newTiempoEmpresa) {
        TiempoEmpresa = newTiempoEmpresa;
    }

    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }
    
    public abstract double sueldo();

    public abstract String MostrarDato();
}
