package Polimorfismo.Animal;

public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }

    public void saludar(){
        System.out.println("miau");
    }
}
