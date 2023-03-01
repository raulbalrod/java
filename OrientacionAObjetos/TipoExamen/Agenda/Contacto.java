package TipoExamen.Agenda;

public class Contacto implements IContacto {
    protected String nombre;
    protected String telefono;
    
    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }

    public String getTelefono() {
        return this.telefono;
    }
    public void setTelefono(String newTelefono) {
        this.telefono = newTelefono;
    }

    
}
