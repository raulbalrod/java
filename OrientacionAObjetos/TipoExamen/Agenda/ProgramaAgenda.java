package TipoExamen.Agenda;

import java.util.ArrayList;

public class ProgramaAgenda {
    public static void main(String[] args) {
        ArrayList<Contacto> contactos = new ArrayList<Contacto>();

        Contacto contact1 = new Contacto("nombre1", "123 412 543");
        Contacto contact2 = new Contacto("nombre2", "214 566 987");
        Contacto contact3 = new Contacto("nombre3", "689 124 432");

        contactos.add(contact1);
        contactos.add(contact2);
        contactos.add(contact3);

        System.out.println(contactos.listarContactos());
    }
}
