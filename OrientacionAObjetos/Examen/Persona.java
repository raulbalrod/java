package Examen;

import java.time.LocalDate;

public class Persona {
    // Variables
    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;

    // Constructor
    public Persona(int id, String nombre, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
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

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // toString
    @Override
    public String toString() {
        return "Persona [id=" + id 
        + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
    }  
}
