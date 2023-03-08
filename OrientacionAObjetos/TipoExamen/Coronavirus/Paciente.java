package TipoExamen.Coronavirus;

import java.util.ArrayList;

public class Paciente extends Persona {
    // Variables
    private ArrayList<Enfermedad> enfermedades;

    // Constructors
    public Paciente(String nombre, int edad, char sexo, ArrayList<Enfermedad> enfermedades) {
        super(nombre, edad, sexo);
        this.enfermedades = enfermedades;
    }

    // Getters and setters
    public ArrayList<Enfermedad> getEnfermedades() {
        return enfermedades;
    }
    public void setEnfermedades(ArrayList<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }
    
    // Metodos
    public String enfermar(Enfermedad enfermedad) {
        enfermedades.add(enfermedad);

        return "Se ha enfermado de: " + enfermedad;
    }

    public String curarse(Enfermedad enfermedad) {
        enfermedades.remove(enfermedad);

        return "Se ha curado de: " + enfermedad;
    }
    
    // toString
    @Override
    public String toString() {
        return 
        "Sanitario: " + this.enfermedades + " - " +
        super.getNombre() + " - " +
        super.getEdad() + " - " +
        super.getSexo() + ". " 
        ;
    }
}
