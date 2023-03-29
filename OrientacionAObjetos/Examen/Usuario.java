package Examen;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario extends Persona {
    // Variables
    private ArrayList<PlataformaStreaming> plataformaStreamings;
    private double saldo;
    private ArrayList<Contenido> contenidoFavoritos;

    // Constructor
    public Usuario(int id, String nombre, LocalDate fechaNacimiento, ArrayList<PlataformaStreaming> plataformaStreamings, double saldo, ArrayList<Contenido> contenidoFavoritos) {
        super(id, nombre, fechaNacimiento);
        this.plataformaStreamings = plataformaStreamings;
        this.saldo = saldo;
        this.contenidoFavoritos = contenidoFavoritos;
    }

    // Getters & setters
    public ArrayList<PlataformaStreaming> getPlataformaStreamings() {
        return this.plataformaStreamings;
    }
    public void setPlataformaStreamings(ArrayList<PlataformaStreaming> plataformaStreamings) {
        this.plataformaStreamings = plataformaStreamings;
    }

    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Contenido> getContenidoFavoritos() {
        return this.contenidoFavoritos;
    }
    public void setContenidoFavoritos(ArrayList<Contenido> contenidoFavoritos) {
        this.contenidoFavoritos = contenidoFavoritos;
    }

    // Metodos
    public void darAltaPlataforma(PlataformaStreaming p){
        if(getSaldo() > p.getPrecioSuscripcion()){
            for (PlataformaStreaming p2 : plataformaStreamings) {
                if(p.getNombre() == p2.getNombre()){
                    plataformaStreamings.remove(p2);
                    plataformaStreamings.add(p);
                    setSaldo(getSaldo() - p.getPrecioSuscripcion());
                }else{
                    plataformaStreamings.add(p);
                    setSaldo(getSaldo() - p.getPrecioSuscripcion());
                }
            }
        }else if(getSaldo() > p.getPrecioSuscripcion() ){
            for (PlataformaStreaming p2 : plataformaStreamings) {
                if(p.getNombre() == p2.getNombre()){
                    plataformaStreamings.remove(p2);
                    plataformaStreamings.add(p);
                    setSaldo(getSaldo() - p.getPrecioSuscripcion());
                }else{
                    plataformaStreamings.add(p);
                    setSaldo(getSaldo() - p.getPrecioSuscripcion());
                }
            }

        }else if(getSaldo() > p.getPrecioSuscripcion()){
            for (PlataformaStreaming p2 : plataformaStreamings) {
                if(p.getNombre() == p2.getNombre()){
                    plataformaStreamings.remove(p2);
                    plataformaStreamings.add(p);
                    setSaldo(getSaldo() - p.getPrecioSuscripcion());
                }else{
                    plataformaStreamings.add(p);
                    setSaldo(getSaldo() - p.getPrecioSuscripcion());
                }
            }
        }
    }

    public void darBajaPlataforma(PlataformaStreaming p) {
        plataformaStreamings.remove(p);
    }

    public void compartirContenidoFavorios(Usuario u, Contenido c) {
        if (u.contenidoFavoritos.contains(c)) {
            u.contenidoFavoritos.add(c);
        }
    }

    public boolean añadirContenidoFavorito(Contenido c) {
        return contenidoFavoritos.add(c);
    }

    public boolean elimninarContenidoFavoritos(Contenido c) {
        boolean result = false;

        for (Contenido contenido : contenidoFavoritos) {
            if (c.getId() == contenido.getId()) {
                result = contenidoFavoritos.remove(c);
            }
        }

        return result;
    }

    public String listarContenidoFavorito() {
        String listaContenidos = "";

        for(Contenido p : contenidoFavoritos) {
           listaContenidos = p.toString();
        }

        return listaContenidos;
    }

    public String listaPlataformaStreamings() {
        String listaPlataformas = "";

        for(PlataformaStreaming p : plataformaStreamings) {
           listaPlataformas = p.toString();
        }

        return listaPlataformas;
    }

    // toString
    @Override
    public String toString() {
        return "Usuario [id=" + getId()
        + ", nombre=" + getNombre()
        + ", fechaNacimiento=" + getFechaNacimiento()
        + ", plataformaStreamings=" + plataformaStreamings 
        + ", saldo=" + saldo 
        + ", contenidoFavoritos=" + contenidoFavoritos 
        + "]";
    }

    
}
