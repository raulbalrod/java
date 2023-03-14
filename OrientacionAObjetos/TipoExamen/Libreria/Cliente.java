package TipoExamen.Libreria;

import java.util.ArrayList;

public class Cliente {
    // Variables
    private String nombre;
    private ArrayList<Libro> libros;
    private double dinero;
    
    // Constructor
    public Cliente(String nombre, double dinero, ArrayList<Libro> libros ) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.libros = libros;
    }

    // Getters & setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }
    public void setLibros(ArrayList<Libro> newLibros) {
        this.libros = newLibros;
    }

    public double getDinero() {
        return dinero;
    }
    public void setDinero(double newDinero) {
        this.dinero = newDinero;
    }

    // Metodos
    public void pagarLibro(double cantidad) {
        this.dinero -= cantidad;
    }

    public void addLibro(Libro libro) {
        this.libros.add(libro);
    }
    
    public int getNumeroLibros() {
        return this.libros.size();
    }

    // ToString
        // Imprimir lista de libros de un cliente
            /*
                public void ImprimirListaLibros() {
                    for(Libro l : libros) {
                        System.out.println(l);
                    }
                }
            */

    @Override
    public String toString() {
        return 
        "Cliente: \n" 
        + "nombre -> " + this.nombre + ", " 
        + "libros -> " + this.libros.size() + ", " 
        + "dinero -> " + this.dinero + ". ";
    }
}
