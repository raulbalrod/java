package Ejercicios.Clases;

import java.util.Date;

public class Jugador {
    private String Nombre;
    private int Dorsal;
    private String Nacionalidad;
    private String NombreEquipo;
    private int NumeroTarjetasAmarillas;
    private int NumeroTarjetasRojas;
    private String Posicion;
    private Date FechaNacimiento;


    public Jugador(String Nombre, int Dorsal, String Posicion, String Nacionalidad, Date FechaNacimiento, String NombreEquipo){
        this.Nombre = Nombre;
        this.Dorsal = Dorsal;
        this.NombreEquipo = NombreEquipo;
        this.Nacionalidad = Nacionalidad;
        this.FechaNacimiento = FechaNacimiento;
        this.Posicion = Posicion;
    }

    public String getNombre(){
        return this.Nombre;
    }

    public String getNombreEquipo(){
        return this.NombreEquipo;
    }

    public int getDorsal(){
        return this.Dorsal;
    }

    public String getPosicion(){
        return this.Posicion;
    }

    public String getNacionalidad(){
        return this.Nacionalidad;
    }

    public Date getFechaNacimiento(){
        return this.FechaNacimiento;
    }

    public int getNumeroTarjetasAmarillas(){
        return this.NumeroTarjetasAmarillas;
    }

    public int getNumeroTarjetasRojas(){
        return this.NumeroTarjetasRojas;
    }

    public void setNombre(String NewNombre){
        this.Nombre = NewNombre;
    }

    public void setNombreEquipo(String NewNombreEquipo){
        this.NombreEquipo = NewNombreEquipo;
    }

    public void setDorsal(int NewDorsal){
        this.Dorsal = NewDorsal;
    }

    public void setPosicion(String Posicion){
        this.Posicion = Posicion;
    }

    public void setNacionalidad(String NewNacionalidad){
        this.Nacionalidad = NewNacionalidad;
    }

    public void setFechaNacimiento(Date NewFechaNacimiento){
        this.FechaNacimiento = NewFechaNacimiento;
    }

    public void setNumeroTarjetasAmarillas(int NewNumeroTarjetasAmarillas){
        this.NumeroTarjetasAmarillas = NewNumeroTarjetasAmarillas;
    }

    public void setNumeroTarjetasRojas(int NewNumeroTarjetasRojas){
        this.NumeroTarjetasRojas = NewNumeroTarjetasRojas;
    }

    @Override
    public String toString(){
        return this.Nombre + " - " + this.Dorsal + " - " + this.Posicion + " - " + this.Nacionalidad + " - " + this.FechaNacimiento + " - " + this.NombreEquipo;
    }

}
