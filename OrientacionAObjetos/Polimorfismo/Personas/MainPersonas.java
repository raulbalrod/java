package Polimorfismo.Personas;


public class MainPersonas {

    public static void main(String[] args) {
        Persona i = new Informatico("John", 25);
        Persona d = new Deportista("Max", 23);

        Persona[] persons = {i, d};

        // Opcion 1
        for(Persona p : persons){
            System.out.println(p.toString());
        }

        // Opcion 2
        for(Persona p : persons) {
            if (p instanceof Informatico){
                System.out.println(i);
            }else if( p instanceof Deportista) {
                System.out.println(d);
            }
        }
    }
}
