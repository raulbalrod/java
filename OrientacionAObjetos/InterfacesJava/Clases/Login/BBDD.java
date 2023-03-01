package InterfacesJava.Clases.Login;

import java.util.ArrayList;

public class BBDD {
    protected ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    protected ArrayList<Comentario> comentarios = new ArrayList<Comentario>();
    
    public ArrayList<Usuario> getUsuarios() {
        return this.usuarios;
    }
    public void setUsuarios(Usuario newUsuarios) {
       usuarios.add(newUsuarios);
    }
    public ArrayList<Comentario> getComentarios() {
        return this.comentarios;
    }
    public void setComentarios(Comentario newComentarios) {
        comentarios.add(newComentarios);
    }

    @Override
    public String toString() {
        return "BBDD [usuarios=" + usuarios + ", comentarios=" + comentarios + "]";
    }
    
}
