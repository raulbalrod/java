package TipoExamen.MaquinaExpendedora;

public class Juguete extends Articulo {

    // Constructor
    public Juguete(String nombre, String codigo, double precio) {
        super(nombre, codigo, precio);
    }

    // Metodos
    public String usar() {
        return "Juego con mi " + getNombre() + ".";
    }
    
}
