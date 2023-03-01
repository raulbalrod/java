package Polimorfismo.Animal;

public class MainAnimal {
    public static void main(String[] args) {
        Perro perro = new Perro("Gato");
        Gato gato = new Gato("Gato");
        Pajaro pajaro = new Pajaro("Gato");
        Bulldog bulldog = new Bulldog("Gato");

        Animal[] animales ={
            perro,
            gato,
            pajaro,
            bulldog
        };

        for(Animal a : animales){
            a.saludar();
        }
     }
}
