package TipoExamen.Coronavirus;

public interface Enfermedad {
    public Persona contagiar(Persona persona);
    public void setCodigo(int codigo);
    public int getCodigo();
    public boolean isCurable();
}
