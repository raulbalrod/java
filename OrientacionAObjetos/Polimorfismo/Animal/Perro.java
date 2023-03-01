package Polimorfismo.Animal;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }
  
    public void saludar(){
        System.out.println("guau");
    }
}
