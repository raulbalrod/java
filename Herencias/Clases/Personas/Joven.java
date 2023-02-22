package Herencias.Clases.Personas;

public class Joven extends Persona{
    String pelo;

    public Joven(String name, int years){
        super(name, years);
        this.pelo = "corto";
    }

    public void saludar(){
        System.out.println("Hola soy joven jajaja xD");
    }

    public void saludar2(){
        super.saludar();
    }

    @Override
    public String toString(){
        return "(" + super.toString() + ", " + this.pelo + ")";
    }
}