package InterfacesJava.Clases.Login;

import java.util.ArrayList;

public class Admin extends Manager {

    public Admin(String name, String password) {
        super(name, password);
    }

    public void BorrarUser(Usuario usuario, ArrayList<Usuario> usuarios) {
        usuarios.remove(usuario);
    }
    
}
