package Polimorfismo.Personas;

public class Informatico extends Persona {
    public Informatico(String name, int edad) {
        super(name, edad);
    }

    public int correr() {
        return 2;
    }

    @Override
    public String toString() {
        return super.name + ", " + super.edad + ", " + correr();
    }
}
