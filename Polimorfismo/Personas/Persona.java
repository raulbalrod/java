package Polimorfismo.Personas;

public abstract class Persona {
    protected String name;
    protected int edad;

    public Persona(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }


    @Override
    public String toString() {
        return this.name + ", " + this.edad;
    }
    
}