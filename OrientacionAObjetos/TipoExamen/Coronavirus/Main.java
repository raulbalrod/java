package TipoExamen.Coronavirus;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Enfermedad> enfermedadesPaciente1 = new ArrayList<Enfermedad>();
        ArrayList<Enfermedad> enfermedadesPaciente2 = new ArrayList<Enfermedad>();

        Enfermedad coronavirus = new Coronavirus(1);
        Enfermedad resfriado = new Resfriado(2);
        Enfermedad gripe = new Gripe(3);

        ArrayList<Persona> personas = new ArrayList<Persona>();

        Paciente persona1 = new Adulto("Jose", 43, 'H', enfermedadesPaciente1);
        Paciente persona2 = new Anciano("David", 63, 'H', enfermedadesPaciente2);
        Sanitario persona3 = new Sanitario("Maria", 32, 'M', "Enfermera");

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);

        for(Persona p : personas) {
            System.out.println(p);
        }

        // Saludar
        persona2.saludar(persona1);

        // Contagio
        coronavirus.contagiar(persona1, enfermedadesPaciente1, coronavirus);

        for(Enfermedad e : enfermedadesPaciente1) {
            System.out.print(e);
        }

        System.out.println();

        // Diagnostico
        persona3.diagnosticar(persona1);

        // Cura
        persona3.curar(persona1, coronavirus);
    }
}
