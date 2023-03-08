package TipoExamen.Libreria;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    // Variables
    private String nombre;
    private ArrayList<Libro> libros;
    private ArrayList<Cliente> clientes;

    // Constructor
    public Tienda(String nombre, ArrayList<Libro> libros, ArrayList<Cliente> clientes) {
        this.nombre = nombre;
        this.libros = libros;
        this.clientes = clientes;
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

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(ArrayList<Cliente> newClientes) {
        this.clientes = newClientes;
    }
    
    // Metodos
    public void verClientes() {
        System.out.println("Lista de clientes:");
        for (Cliente c : clientes) {
            System.out.println(c.getNombre());
        }
    }

    public void listar() {
        System.out.println("Lista de libros:");
        for (Libro l : libros) {
            System.out.println(l.getNombre());
        }
    }

    public void listar(int opcion) {    
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el término de búsqueda:");
        String termino = sc.nextLine();

        System.out.println("Libros que coinciden con la búsqueda:");
        for (Libro l : libros) {
            if (opcion == 1 && l.getNombre().toLowerCase().contains(termino.toLowerCase())) {
                System.out.println("- " + l.getNombre());

            } else if (opcion == 2 && l.getAutor().toLowerCase().contains(termino.toLowerCase())) {
                System.out.println("- " + l.getNombre());
                
            } else if (opcion == 3 && l.getCategoria().toLowerCase().contains(termino.toLowerCase())) {
                System.out.println("- " + l.getNombre());
            }
        }
    }

    public void addLibro() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el título del libro:");
        String titulo = sc.nextLine();

        System.out.println("Introduzca el autor del libro:");
        String autor = sc.nextLine();

        System.out.println("Introduzca la categoría del libro:");
        String categoria = sc.nextLine();

        System.out.println("Introduzca el precio del libro:");
        double precio = sc.nextDouble();

        System.out.println("Introduzca la cantidad de existencias del libro:");
        int cantidad = sc.nextInt();

        Libro newLibro = new Libro(titulo, autor, categoria, precio, cantidad);

        libros.add(newLibro);
    }

    public void addCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el nombre del cliente:");
        String nombre = sc.nextLine();

        System.out.println("Introduzca la cantidad de dinero del cliente:");
        double dinero = sc.nextDouble();
        
        Cliente newCliente = new Cliente(nombre, dinero, libros);

        clientes.add(newCliente);
    }

    public void venderLibro(Libro libro, Cliente cliente) {
        if (libro.comprar(libros.size()) != null) {
            cliente.addLibro(libro);
            cliente.pagarLibro(libro.getPrecio());
            System.out.println("El libro " + libro.getNombre() + " se ha vendido a " + cliente.getNombre() + ".");
        } else {
            System.out.println("No hay suficientes existencias del libro " + libro.getNombre() + ".");
        }
    }

    // ToString
    @Override
    public String toString() {
        return 
        "Cliente: \n" 
        + "nombre -> " + this.nombre + ", " 
        + "libros -> " + this.libros + ", " 
        + "clientes -> " + this.clientes + ". ";
    }
}
