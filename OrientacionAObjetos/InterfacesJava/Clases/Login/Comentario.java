package InterfacesJava.Clases.Login;

import java.time.LocalDate;

public class Comentario {
    protected Usuario user;
    protected String texto;
    protected LocalDate date;


    public Comentario(Usuario user, String texto, LocalDate date) {
        this.user = user;
        this.texto = texto;
        this.date = date;
    }
    
    public Usuario getUser() {
        return this.user;
    }
    public void setUser(Usuario newUser) {
        this.user = newUser;
    }

    public String getTexto() {
        return this.texto;
    }
    public void setTexto(String newTexto) {
        this.texto = newTexto;
    }

    public LocalDate getDate() {
        return  this.date;
    }
    public void setDate(LocalDate newDate) {
        this.date = newDate;
    }

    @Override
    public String toString() {
        return "Comentario (user=" + user + ", texto=" + texto + ", date=" + date + ")";
    }

}
