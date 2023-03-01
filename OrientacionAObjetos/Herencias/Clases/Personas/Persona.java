package Herencias.Clases.Personas;

public class Persona {
    public String name;
    public int years;

    public Persona(String name, int years){
        this.name = name;
        this.years = years;
    }

    public void saludar(){
        System.out.println("Hola soy persona");
    }

    @Override
    public String toString(){
        return "(" + this.name + ", " + this.years + ")";
    }
}