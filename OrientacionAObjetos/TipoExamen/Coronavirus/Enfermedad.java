package TipoExamen.Coronavirus;

public interface Enfermedad {
    public void contagiar(Paciente persona, Enfermedad enfermedad);
    public void setCodigo(int codigo);
    public int getCodigo();
    public boolean isCurable();
}
