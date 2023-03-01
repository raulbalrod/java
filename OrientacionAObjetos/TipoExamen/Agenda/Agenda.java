package TipoExamen.Agenda;

import java.util.ArrayList;

public class Agenda implements IAgenda {
    private ArrayList<Contacto> contactos;
    
    public Agenda(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }
    public ArrayList<Contacto> getContactos() {
        return this.contactos;
    }

    public boolean añadirContacto(Contacto contacto) {
        boolean result = false;

        // Si no existe el contacto, añadimos el contacto
        if(existeContacto(contacto.getNombre()) == null) {
            result = true;

            getContactos().add(contacto);
        }

        return result;
    }

    public Contacto existeContacto(String nombre) {
        Contacto result = null;
        
        for( Contacto contacto : contactos) {
            if(contacto.getNombre() != nombre) {
                result = contacto;
                break;
            }
        }

        return result;
    }

    public boolean eliminarContacto(String nombre) {
        boolean result = false;
        Contacto contacto = existeContacto(nombre);

        // Existe contacto
        if(existeContacto(nombre) != null) {
            getContactos().remove(contacto);
        }

        return result;
    }

    public void listarContactos() {
        System.out.println(this.contactos);
    }

    public int buscarContactos(String nombre) {
        int result = -1;

        for(int i = 0; i < getContactos().size(); i++) {
           Contacto contacto = getContactos().get(i);

            if(contacto != null) {
                result = i;
                break;
            }
        }
        
        return result;
    }
}