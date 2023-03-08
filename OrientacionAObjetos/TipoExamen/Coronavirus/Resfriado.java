package TipoExamen.Coronavirus;

public class Resfriado implements Enfermedad {
    private int codigo = 2;
    private boolean curable;

    public Resfriado(int codigo, boolean curable) {
        this.codigo = codigo;
        this.curable = true;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public boolean isCurable() {
        return this.curable;
    }

    public Persona contagiar(Persona persona) {
        if(curable == false) {
            // no enferma
        } else {
            // enferma
        }
        
        return persona;
    }

}
