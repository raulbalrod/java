package TipoExamen.Coronavirus;

public class Gripe implements Enfermedad {
    // Variables
    private int codigo = 3;
    private boolean curable;

    // Constructor
    public Gripe(int codigo, boolean curable) {
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
}
