package TipoExamen.Coronavirus;

import java.util.ArrayList;

public class Adulto extends Paciente {
    // Constructor
    public Adulto(String nombre, int edad, char sexo, ArrayList<Enfermedad> enfermedades) {
        super(nombre, edad, sexo, enfermedades);
    }
}
