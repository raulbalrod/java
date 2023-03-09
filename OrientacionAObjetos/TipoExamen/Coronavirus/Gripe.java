package TipoExamen.Coronavirus;

import java.util.ArrayList;

public class Gripe implements Enfermedad {
    // Variables
    private int codigo = 3;
    private boolean curable;

    // Constructor
    public Gripe(int codigo) {
        this.codigo = codigo;
        this.curable = true;
    }

    // Getters and setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return this.codigo;
    }

    // Metodos
    public boolean isCurable() {
        return this.curable;
    }

    public void contagiar(Paciente paciente, ArrayList<Enfermedad> enfermedades, Enfermedad enfermedad) {
        enfermedades.add(enfermedad);
    }

    // toString
    public String toString() {
        return "    * Gripe, codigo -> " + this.codigo 
        + ", curable "
        ;
    }
}
