package TipoExamen.Libreria;

public class Libro {
    // Variables
    private String nombre;
    private String autor;
    private String categoria;
    private double precio;
    private int cantidad;

    // Constructor
    public Libro(String nombre, String autor, String categoria, double precio, int cantidad) {
        this.nombre = nombre;
        this.autor = autor;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Getters & setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String newAutor) {
        this.autor = newAutor;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String newCategoria) {
        this.categoria = newCategoria;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double newPrecio) {
        this.precio = newPrecio;
    }


    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int newCantidad) {
        this.cantidad = newCantidad;
    }

    // Metodos
    public Libro comprar(int unidades) {
        if (unidades <= 0) {
            unidades = 1;
        }
        if (cantidad >= unidades) {
            cantidad -= unidades;
            return this;
        } else {
            return null;
        }
    }

    // ToString
    @Override
    public String toString() {
        return 
        "Libro: \n" 
        + "nombre -> " + this.nombre + ", " 
        + "autor -> " + this.autor + ", " 
        + "categoria -> " + this.categoria + ", " 
        + "precio -> " + this.precio + ", " 
        + "cantidad -> " + this.cantidad + ". ";
    }

}
