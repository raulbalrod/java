package Examen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {
        // Peliculas
        Pelicula pelicula1 = new Pelicula(1, "Titanic",  2.2, 12, 1500.2, "Drama");
        Pelicula pelicula2 = new Pelicula(2, "El Hobbit",  3.1, 16, 2555.6, "Thriller");
        Pelicula pelicula3 = new Pelicula(3, "Señor de los anillos",  3.3, 16, 1735.9, "Thriller");

        // Series
        Serie serie1 = new Serie(1, "La Casa de Papel", 50.3, 18, 3500.3,  "Accion", 12, 4);
        Serie serie2 = new Serie(2, "Sin Huellas", 100.3, 18, 2500.3,  "Drama", 5, 1);
        Serie serie3 = new Serie(3, "Triada", 30.3, 18, 1500.3,  "Thriller", 21, 2);
        

        ArrayList<Contenido> contenidos = new ArrayList<Contenido>();

        contenidos.add(pelicula1);
        contenidos.add(pelicula2);
        contenidos.add(pelicula3);
        contenidos.add(serie1);
        contenidos.add(serie2);
        contenidos.add(serie3);

        // Plataformas
        ArrayList<PlataformaStreaming> plataformaStreamings = new ArrayList<PlataformaStreaming>();
            // ADAFLIX
        ArrayList<Contenido> contenidosADAFLIX = new ArrayList<Contenido>();

        contenidosADAFLIX.add(serie3);
        contenidosADAFLIX.add(pelicula2);
        contenidosADAFLIX.add(pelicula2);

        PlataformaStreaming adaFlixBasic = new PlataformaStreaming(1, "ADAFLIX - Basic", 0, contenidosADAFLIX, true);        
        PlataformaStreaming adaFlixStandard = new PlataformaStreaming(1, "ADAFLIX - Standard", 3.99, contenidosADAFLIX, false);        
        PlataformaStreaming adaFlixPremium = new PlataformaStreaming(1, "ADAFLIX - Premium", 9.99, contenidosADAFLIX, false);

            // Amazon
        ArrayList<Contenido> contenidosAmazon = new ArrayList<Contenido>();

        contenidosAmazon.add(serie1);
        contenidosAmazon.add(serie2);
        contenidosAmazon.add(pelicula1);

        PlataformaStreaming AmazonStandard = new PlataformaStreaming(2, "Amazon - Standard", 3.99, contenidosAmazon, false);        
        PlataformaStreaming AmazonPremium = new PlataformaStreaming(2, "Amazon - Premium", 9.99, contenidosAmazon, false);

        plataformaStreamings.add(AmazonPremium);
        plataformaStreamings.add(AmazonStandard);
        plataformaStreamings.add(adaFlixBasic);
        plataformaStreamings.add(adaFlixPremium);
        plataformaStreamings.add(adaFlixStandard);

        // Personas
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
            // User1
            LocalDate dateUser1 = LocalDate.of(2000, 10, 30);

            ArrayList<PlataformaStreaming> plataformaStreamingsUser1 = new ArrayList<PlataformaStreaming>();
            ArrayList<Contenido> contenidoUser1 = new ArrayList<Contenido>();

            plataformaStreamingsUser1.add(AmazonStandard);
            plataformaStreamingsUser1.add(adaFlixBasic);
            contenidoUser1.add(serie3);
            contenidoUser1.add(pelicula1);

            Usuario user1 = new Usuario(
                    1,
                    "Jose",
                    dateUser1, 
                    plataformaStreamingsUser1,
                    49.50,
                    contenidoUser1
                );
    
                // User 2
            LocalDate dateUser2 = LocalDate.of(1999, 11, 23);
    
            ArrayList<PlataformaStreaming> plataformaStreamingsUser2 = new ArrayList<PlataformaStreaming>();
            ArrayList<Contenido> contenidoUser2 = new ArrayList<Contenido>();

            plataformaStreamingsUser2.add(AmazonPremium);
            plataformaStreamingsUser2.add(adaFlixStandard);
            contenidoUser2.add(serie2);
            contenidoUser2.add(serie3);
            contenidoUser2.add(pelicula2);

            Usuario user2 = new Usuario(
                        2,
                        "Pedro",
                        dateUser2, 
                        plataformaStreamingsUser2,
                        49.50,
                        contenidoUser2
                    );
    
            usuarios.add(user1);     
            usuarios.add(user2); 

                // Profesor
            LocalDate dateProfesor = LocalDate.of(1984, 1, 21);
            LocalDate horario = LocalDate.of(1999, 3, 1);
    
            Profesor profresor1 = new Profesor(
                        2,
                        "Adolfo",
                        dateProfesor,
                        horario
                );
        Scanner sc = new Scanner(System.in);

        int eleccion = 0;

        do {
            System.out.println("Bienvenido a ADAFLIX: Gestión de plataformas streaming");
            System.out.println("1. Listar las distintas suscripciones que existen de una plataforma");
            System.out.println("2. Subscribirse a una plataforma");
            System.out.println("3. Darse de baja de una plataforma");
            System.out.println("4. Listar el contenido según el tipo (pelicula, serie o canal profesorado)");
            System.out.println("5. Mostrar el TOP 10 de los contenidos");
            System.out.println("6. Salir");

            System.out.println("Introduzca una opcion:");
            eleccion = sc.nextInt();

            if (eleccion == 1) {
                for (PlataformaStreaming p : plataformaStreamings) {
                    System.out.println(plataformaStreamings.toString());
                }
            } else if (eleccion == 2) {
                // .darAltaPlataforma()
            } else if (eleccion == 3) {
                // .darBajaPlataforma()
            } else if (eleccion == 4) {
                
            } else if (eleccion == 5) {
                // contenidos.obtenerTopDiez();
            }
            
        } while (eleccion != 6);
    }
}
