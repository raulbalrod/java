package InterfacesJava.Clases.Login;

import java.util.ArrayList;

public class Manager extends Usuario {

    public Manager(String name, String password) {
        super(name, password);
    }

    public void AñadirUsuario(Usuario usuario, ArrayList<Usuario> usuarios) {
        usuarios.add(usuario);
    }

}
