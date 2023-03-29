package Examen;

import java.util.ArrayList;
import java.util.Collections;

public class PlataformaStreaming implements IPlataformaStreaming {

    // Variables
    private int id;
    private String nombre;
    private double precioSuscripcion;
    private ArrayList<Contenido> contenidos;
    private boolean contieneAnuncio;

    // Constructor
    public PlataformaStreaming(int id, String nombre, double precioSuscripcion, ArrayList<Contenido> contenidos, boolean contieneAnuncio) {
        this.id = id;
        this.nombre = nombre;
        this.precioSuscripcion = precioSuscripcion;
        this.contenidos = new ArrayList<>();
        this.contieneAnuncio = false;
    }

    // Getters & setters
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioSuscripcion() {
        return this.precioSuscripcion;
    }
    public void setPrecioSuscripcion(double precioSuscripcion) {
        this.precioSuscripcion = precioSuscripcion;
    }

    public ArrayList<Contenido> getContenidos() {
        return this.contenidos;
    }
    public void setContenidos(ArrayList<Contenido> contenidos) {
        this.contenidos = contenidos;
    }

    public boolean isContieneAnuncio() {
        return this.contieneAnuncio;
    }
    public void setContieneAnuncio(boolean contieneAnuncio) {
        this.contieneAnuncio = contieneAnuncio;
    }

    // Metodos
    @Override
    public boolean añadirContenido(Contenido c) {
        return contenidos.add(c);
    }

    @Override
    public boolean eliminarContenido(Contenido c) {
        boolean result = false;

        for (Contenido contenido : contenidos) {
            if (c.getId() == contenido.getId()) {
                result = contenidos.remove(c);
            }
        }

        return result;
    }

    @Override
    public ArrayList<Contenido> obtenerTopDiez() {
        ArrayList<Double> contenidosOrdenados = new ArrayList<>();
        
        for(Contenido c : contenidos) {
            contenidosOrdenados.add(c.getNumeroHorasReproducidas());
        }
        Collections.sort(contenidosOrdenados);

        ArrayList<Contenido> topDiez = new ArrayList<>();

        for (int i = 0; i < 10 && i < contenidos.size(); i++) {
            topDiez.add(contenidos.get(i));
        }

        return topDiez;
    }

    @Override
    public int obtenerCalidadImagen() {
        int result = 0;

        if (this.getPrecioSuscripcion() == 0) {
            result += 720;
        } else if (this.getPrecioSuscripcion() > 0 || this.getPrecioSuscripcion() <= 3.99) {
            result += 1080;
        } else if (this.getPrecioSuscripcion() >= 9.99) {
            result += 4096;
        }

        return result;
    }

    @Override
    public int obtenerNumeroMaximoPantallas() {
        int result = 0;

        if (this.getPrecioSuscripcion() == 0) {
            result = 1;
        } else if (this.getPrecioSuscripcion() > 0 || this.getPrecioSuscripcion() <= 3.99) {
            result = 2;
        } else if (this.getPrecioSuscripcion() >= 9.99) {
            result = 15;
        }

        return result;
    }

    @Override
    public String reproducirAnunciosAleatorios() {
        ArrayList<String> anuncios = new ArrayList<String>();

        anuncios.add("En este aviso de Bimbo, la imagen resalta la idea de que este pan está hecho con leche.");
        anuncios.add("Este aviso de Café Atacama busca posicionar la marca como el café para desayunar.");
        anuncios.add("Como Coca Cola es una marca muy reconocida, no necesita un texto explicativo que detalle las propiedades de la bebida.");
        anuncios.add("Este aviso corresponde a los años 50 y utiliza más texto que los avisos actuales.");
        anuncios.add("Esta publicidad del año 1967 recurre utiliza como figura retórica el movimiento de las letras que simulan el movimiento del andar suave del automóvil que publicitan.");

        int random = (int)(Math.random() * anuncios.size());
        return anuncios.get(random);
    }

    @Override
    public String listarContenidos() {
        String listaContenidos = "";

        for(Contenido c : contenidos) {
           listaContenidos = c.toString();
        }

        return listaContenidos;
    }

    // toString
    @Override
    public String toString() {
        return 
        "PlataformaStreaming [id=" + id 
        + ", nombre=" + nombre 
        + ", precioSuscripcion=" + precioSuscripcion 
        + ", contenidos=" + contenidos 
        + ", contieneAnuncio=" + contieneAnuncio + "]";
    }
}
