package TipoExamen.Coronavirus;

import java.util.ArrayList;

public class Coronavirus implements Enfermedad {
    // Variables
    private int codigo = 1;
    private boolean curable;
    
    // Constructor
    public Coronavirus(int codigo) {
        this.codigo = codigo;
        this.curable = false;
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
        return "    * Coronavirus, codigo -> " + this.codigo 
        + ", no curable "
        ;
    }

}
