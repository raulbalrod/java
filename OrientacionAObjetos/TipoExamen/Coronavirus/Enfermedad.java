package TipoExamen.Coronavirus;

import java.util.ArrayList;

public interface Enfermedad {
    public void contagiar(Paciente persona, ArrayList<Enfermedad> enfermedades, Enfermedad enfermedad);
    public void setCodigo(int codigo);
    public int getCodigo();
    public boolean isCurable();
}
