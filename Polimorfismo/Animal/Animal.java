package Polimorfismo.Animal;

public class Animal {
    protected String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }

    public void saludar(){
        System.out.println("Sonido de animal");
    }
    
    @Override
    public String toString(){
        return "( " + this.nombre + " )";
    }
}
