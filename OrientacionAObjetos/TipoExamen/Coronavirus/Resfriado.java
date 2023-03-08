package TipoExamen.Coronavirus;

public class Resfriado implements Enfermedad {
    // Variables
    private int codigo = 2;
    private boolean curable;

    // Constructor
    public Resfriado(int codigo, boolean curable) {
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

    public void contagiar(Paciente paciente, Enfermedad enfermedad) {
        if (paciente.getEnfermedades() != null) {
            paciente.enfermar(enfermedad);
        }
    }

    // toString

}
