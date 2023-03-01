package Polimorfismo.Personas;

public class Deportista extends Persona{
    public Deportista(String name, int edad) {
        super(name, edad);
    }

    public int correr() {
        return 7;
    }

    @Override
    public String toString() {
        return super.name + ", " + super.edad + ", " + correr();
    }
}
