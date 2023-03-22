package Examen;

import java.util.ArrayList;

public interface IPlataformaStreaming {
    public boolean añadirContenido(Contenido c);
    public boolean eliminarContenido(Contenido c);
    public ArrayList<Contenido> obtenerTopDiez();
    public int obtenerCalidadImagen();
    public int obtenerNumeroMaximoPantallas();
    public String reproducirAnunciosAleatorios();
    public String listarContenidos();
}
