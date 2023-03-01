package InterfacesJava.Clases.Login;

import java.util.ArrayList;

public class Usuario {
    protected String name;
    protected String password;
    protected BBDD bbdd = new BBDD();

    public Usuario(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    } 

    // metodo publicarComentario
    public void publicarComentario(Comentario comentario) {
        bbdd.setComentarios(comentario);
    } 

    public void AñadirUsuario(Usuario usuario, ArrayList<Usuario> usuarios) {
        usuarios.add(usuario);
    }

    @Override
    public String toString() {
        return "Usuario [name=" + name + ", password=" + password + ", bbdd=" + bbdd + "]";
    }
}
