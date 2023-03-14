package TipoExamen.Libreria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ArrayList<Libro> libros = new ArrayList<Libro>();
        ArrayList<Libro> librosCliente1 = new ArrayList<Libro>();
        ArrayList<Libro> librosCliente2 = new ArrayList<Libro>();
        ArrayList<Libro> librosCliente3 = new ArrayList<Libro>();
        ArrayList<Libro> librosCliente4 = new ArrayList<Libro>();

        Libro libro1 = new Libro("ESDLA", "Sergio", "Literatura", 12.43, 5);
        Libro libro2 = new Libro("El hobbit", "Kun", "Filosofia", 9.76, 1);
        Libro libro3 = new Libro("La historia", "Leo", "Literatura", 16.21, 9);
        Libro libro4 = new Libro("The end", "Alberto", "Filosofia", 6.75, 15);
        
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Cliente cliente1 = new Cliente("Arturo", 35.21, librosCliente1);
        Cliente cliente2 = new Cliente("Adolfo", 4.32, librosCliente2);
        Cliente cliente3 = new Cliente("Juan", 79.12, librosCliente3);
        Cliente cliente4 = new Cliente("Jose", 57.21, librosCliente4);

        Tienda tienda1 = new Tienda("Erase una vez", libros, clientes);

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);

        int opcion = 0;
        do {
            System.out.println();
            System.out.println("### Bienvenido a Erase una vez ###");
            System.out.println("1. Ver libros");
            System.out.println("2. Ver clientes");
            System.out.println("3. Buscar libros");
            System.out.println("4. Vender libro");
            System.out.println("5. Registrar libro");
            System.out.println("6. Registrar cliente");
            System.out.println("0. Salir");
            System.out.println("Introduzca una opcion:");
    
            opcion = sc.nextInt();
        
            if (opcion == 1) {
                tienda1.listar();
                
            } else if (opcion == 2) {
                tienda1.verClientes();
    
            } else if (opcion == 3) {
                System.out.println("--- Elija la opcion de busqueda ---");
                System.out.println("1. Nombre");
                System.out.println("2. Autor");
                System.out.println("3. Categoria");
                int seleccion = sc.nextInt();
    
                tienda1.listar(seleccion);
    
            } else if (opcion == 4) {
                int i = 1;
                for(Cliente c : clientes) {
                    System.out.println(i++ + ". " + c);
                }
    
                System.out.println("Elija un comprador: ");
                int comprador = sc.nextInt();
    
                int j = 1;
                for(Libro l : libros) {
                    System.out.println(j++ + ". " + l);
                }
    
                System.out.println("Elija un libro: ");
                int libroCompra = sc.nextInt();

                System.out.println("Elija cuantos quiere comprar: ");
                int unidaesDeCompra = sc.nextInt();

                if (clientes.get(comprador - 1).getDinero() > libros.get(libroCompra - 1).getPrecio() && libros.get(libroCompra - 1).getCantidad() > 0) {
                    System.out.println("Comprado !");
                    tienda1.venderLibro(libros.get(libroCompra - 1), clientes.get(comprador - 1), unidaesDeCompra);
                } else {
                    System.out.println("Error en la compra");
                }
    
            } else if (opcion == 5) {
                tienda1.addLibro();
            } else if (opcion == 6) {
                tienda1.addCliente();
            }
        } while(opcion != 0);
    }
}

