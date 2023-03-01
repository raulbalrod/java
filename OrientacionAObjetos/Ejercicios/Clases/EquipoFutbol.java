package Ejercicios.Clases;

public class EquipoFutbol {
    private String Nombre;   
    private String Temporada;
    private int PartidosJugados;
    private int PartidosGanados;
    private int PartidosPerdidos;

    public EquipoFutbol(String Nombre, String Temporada){
        this.Nombre = Nombre;
        this.Temporada = Temporada;
    }

    public String getNombre(){
        return this.Nombre;
    }

    public String getTemporada(){
        return this.Temporada;
    }

    public int getPartidosJugados(){
        return this.PartidosJugados;
    }

    public int getPartidosGanados(){
        return this.PartidosGanados;
    }

    public int getPartidosPerdidos(){
        return this.PartidosPerdidos;
    }

    public void setNombre(String NewNombre){
        this.Nombre = NewNombre;
    }

    public void setTemporada(String NewTemporada){
        this.Temporada = NewTemporada;
    }

    public void setPartidosJugados(int NewPartidosJugados){
        this.PartidosJugados = NewPartidosJugados;
    }

    public void setPartidosGanados(int NewPartidosGanados){
        this.PartidosGanados = NewPartidosGanados;
    }

    public void setPartidosPerdidos(int NewPartidosPerdidos){
        this.PartidosPerdidos = NewPartidosPerdidos;
    }
}
