package TipoExamen.Coronavirus;

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

    public void contagiar(Paciente paciente, Enfermedad enfermedad) {
        if (paciente.getEnfermedades() != null) {
            paciente.enfermar(enfermedad);
        }
    }

}
