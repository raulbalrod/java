package TipoExamen.Libreria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Libro> libros = new ArrayList<Libro>();

        Libro libro1 = new Libro("nombre1", "autor1", "categoria1", 12.43, 5);
        Libro libro2 = new Libro("nombre2", "autor2", "categoria2", 9.76, 1);
        Libro libro3 = new Libro("nombre3", "autor3", "categoria3", 16.21, 9);
        Libro libro4 = new Libro("nombre4", "autor4", "categoria4", 6.75, 15);

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);
        
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Cliente cliente1 = new Cliente("Arturo", 51.21, null);
        Cliente cliente2 = new Cliente("Adolfo", 41.32, null);
        Cliente cliente3 = new Cliente("Juan", 99.12, libros);
        Cliente cliente4 = new Cliente("Jose", 15.21, null);

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);

        System.out.println("### Bienvenido a erase una vez ###");
        System.out.println("1. Ver libros");
        System.out.println("2. Ver clientes");
        System.out.println("3. Buscar libros");
        System.out.println("4. Vender libro");
        System.out.println("5. Registrar libro");
        System.out.println("6. Registrar cliente");
        System.out.println("0. Salir");
        System.out.println("Introduzca una opcion:");

        int opcion = sc.nextInt();
    
        if (opcion == 1) {
            for(Libro l : libros) {
                System.out.println(l);
            }
            
        } else if (opcion == 2) {
            for(Cliente c : clientes) {
                System.out.println(c);
            }

        } else if (opcion == 3) {
            System.out.println("--- Elija la opcion de busqueda ---");
            System.out.println("1. Nombre");
            System.out.println("2. Autor");
            System.out.println("3. Categoria");

            int seleccion = sc.nextInt();
            System.out.println(libro1.listar(seleccion));

        } else if (opcion == 4) {

        } else if (opcion == 5) {

        } else if (opcion == 6) {

        }  else if (opcion == 0) {
            
        } else {

        }
    }
}
