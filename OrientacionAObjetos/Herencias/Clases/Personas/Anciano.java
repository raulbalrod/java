package Herencias.Clases.Personas;

public class Anciano extends Persona{

    public Anciano(String name, int years){
        super(name, years);
    }
    
    @Override
    public String toString(){
        return "(" + this.name + ", " + this.years + ")";
    }
}