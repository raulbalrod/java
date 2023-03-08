package TipoExamen.Coronavirus;

public class Coronavirus implements Enfermedad {
    private int codigo = 1;
    private boolean curable;
    
    public Coronavirus(int codigo) {
        this.codigo = codigo;
        this.curable = false;
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
