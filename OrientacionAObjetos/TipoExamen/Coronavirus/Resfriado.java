package TipoExamen.Coronavirus;

import java.util.ArrayList;

public class Resfriado implements Enfermedad {
    // Variables
    private int codigo = 2;
    private boolean curable;

    // Constructor
    public Resfriado(int codigo) {
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

    @Override
    public void contagiar(Paciente paciente, ArrayList<Enfermedad> enfermedades, Enfermedad enfermedad) {
        enfermedades.add(enfermedad);
    }

    @Override
    // toString
    public String toString() {
        return "    * Resfriado, codigo -> " + this.codigo 
        + ", curable "
        ;
    }
}
