package TipoExamen.Agenda;

public interface IAgenda {
    public boolean añadirContacto(Contacto contacto);
    public boolean eliminarContacto(String nombre);
    public Contacto existeContacto(String nombre);
    public void listarContactos();
    public int buscarContactos(String nombre);
}
