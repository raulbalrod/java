package TipoExamen.Agenda;

import java.time.LocalDate;

public class ContactoPersona extends Contacto implements IContactoEmpresa {
 
    protected LocalDate date;
    
    public ContactoPersona(String nombre, String telefono, LocalDate date) {
        super(nombre, telefono);
        this.date = date;
    }

    public LocalDate getDate() {
        return this.date;
    }
    public void setDate(LocalDate newDate) {
        this.date = newDate;
    }

    
}
