package Herencias.Clases.Personas;

public class Adulto extends Persona{

    public Adulto(String name, int years){
        super(name, years);
    }
    
    @Override
    public String toString(){
        return "(" + this.name + ", " + this.years + ")";
    }
}