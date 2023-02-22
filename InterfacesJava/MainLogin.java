package InterfacesJava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import InterfacesJava.Clases.Login.*;

public class MainLogin {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        ArrayList<Comentario> comentarios = new ArrayList<Comentario>();

        Usuario user1 = new Usuario(
            "user1", "*****"
        );

        Usuario user2 = new Usuario(
            "user2", "*****"
        );

        Comentario coment1 = new Comentario(user1, "coment1", LocalDate.now());
        Comentario coment2 = new Comentario(user2, "coment1", LocalDate.now());

        // System.out.println(coment1.toString());

        BBDD bbdd1 = new BBDD();
        bbdd1.setComentarios(coment2);

        // System.out.println(bbdd1);

        usuarios.add(user1);
        usuarios.add(user2);
        comentarios.add(coment1);
        comentarios.add(coment2);

        // System.out.println(comentarios);

        // System.out.println(usuarios);

        Usuario users[] = {
            user1, user2
        };

        System.out.println(Arrays.toString(users));
    }
}
