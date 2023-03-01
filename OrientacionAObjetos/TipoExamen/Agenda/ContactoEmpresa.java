package TipoExamen.Agenda;

public class ContactoEmpresa extends Contacto implements IContactoEmpresa{
    protected String web;

    public ContactoEmpresa(String nombre, String telefono, String web) {
        super(nombre, telefono);
        this.web = web;
    }

    public String getWeb() {
        return this.web;
    }
    public void setWeb(String newWeb) {
        this.web = newWeb;
    }

}
