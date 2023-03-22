package Examen;

import java.time.LocalDate;

public class Profesor extends Persona {
    // Variables
    private LocalDate horario;

    // Constructor
    public Profesor(int id, String nombre, LocalDate fechaNacimiento, LocalDate horario) {
        super(id, nombre, fechaNacimiento);
        this.horario = horario;
    }

    // Gettes & setters
    public LocalDate getHorario() {
        return this.horario;
    }
    public void setHorario(LocalDate horario) {
        this.horario = horario;
    }

    // toString
    @Override
    public String toString() {
        return "Profesor [horario= " + horario 
        + ", id= " + getId() 
        + ", nombre= " + getNombre() 
        + ", fechaNacimiento= " + getFechaNacimiento() 
        + ", horario= " + getHorario() 
        + "]";
    }

    
}
