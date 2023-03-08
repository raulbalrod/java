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
        String result = "";
        enfermedades.add(enfermedad);

        if (enfermedad.getCodigo() == 1) {
            result += "Se ha contagiado del Coronavirus.";
        } else if (enfermedad.getCodigo() == 2) {
            result += "Se ha contagiado de un Resfriado.";
        } else if(enfermedad.getCodigo() == 3) {
            result += "Se ha contagiado de la Gripe.";
        }

        return result;
    }

    public String curarse(Enfermedad enfermedad) {
        String result = "";
        enfermedades.remove(enfermedad);

        if (enfermedad.getCodigo() == 1) {
            result += "Se ha curado del Coronavirus.";
        } else if (enfermedad.getCodigo() == 2) {
            result += "Se ha curado de un Resfriado.";
        } else if(enfermedad.getCodigo() == 3) {
            result += "Se ha curado de la Gripe.";
        }

        return result;
    }
    
    // toString
    @Override
    public String toString() {
        return 
        "Paciente: " + this.enfermedades + " - " +
        super.getNombre() + " - " +
        super.getEdad() + " - " +
        super.getSexo() + ". " 
        ;
    }
}
