package TipoExamen.Coronavirus;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Enfermedad coronavirus = new Coronavirus(1);
        Enfermedad resfriado = new Coronavirus(2);
        Enfermedad gripe = new Coronavirus(3);

        ArrayList<Enfermedad> enfermedades = new ArrayList<Enfermedad>();

        Persona persona1 = new Paciente("Jose", 9, 'h', null);
        Persona persona2 = new Paciente("Juan", 54, 'h', null);
        Persona persona3 = new Sanitario("Maria", 32, 'm', "Enfermera");
    
        saludar(persona1);
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
    }
}
