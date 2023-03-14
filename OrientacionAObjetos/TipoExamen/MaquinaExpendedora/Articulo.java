package TipoExamen.MaquinaExpendedora;

public abstract class Articulo {
    // Variables
    private String nombre;
    private String codigo;
    private double precio;
    
    // Constructor
    public Articulo(String nombre, String codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Metodos
    public abstract String usar();

    @Override
    public String toString() {
        return "Articulo -> " + this.nombre + ", " + this.codigo + ", " + this.precio + ".";
    }

    
}
