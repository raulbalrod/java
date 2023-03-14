package TipoExamen.MaquinaExpendedora;

public class Tabaco extends Articulo {
    // Variables
    private int unidades;

    // Constructor
    public Tabaco(String nombre, String codigo, double precio) {
        super(nombre, codigo, precio);
        this.unidades = 10;
    }

    // Getters & setters
    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    // Metodos
    public String usar() {
        this.unidades -= 1;

        if (this.unidades > 0) {
            return "Me acabo de fumar un cigarro, quedan " + this.unidades + ".";
        } else {
            return "No quedan cigarros.";

        }
    }

    // toString
    @Override
    public String toString() {
        return "Juguete -> " + getNombre() + ", " + getCodigo() + ", " + getPrecio() + "," + this.unidades + ".";
    }

}
