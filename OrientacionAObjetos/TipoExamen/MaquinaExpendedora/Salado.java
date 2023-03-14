package TipoExamen.MaquinaExpendedora;

public class Salado extends Comida {
    // Variables
    private double nutrientes;

    // Constructor
    public Salado(String nombre, String codigo, double precio, double nutrientes) {
        super(nombre, codigo, precio);
        this.nutrientes = nutrientes;
    }

    // Getter & setters
    public double getNutrientes() {
        return nutrientes;
    }

    public void setNutrientes(double nutrientes) {
        this.nutrientes = nutrientes;
    }

    // Metodos
    public String usar() {
        return "Me tomo " + getNombre() + "y me nutro " + this.nutrientes + "gramos.";
    }

    // toString
    @Override
    public String toString() {
        String resultado = "";

        if(isCaducado()) {
            resultado += "caducado.";
        } else {
            resultado += "no caducado.";
        }

        return "Salado -> " 
        + getNombre() + "- " 
        + getCodigo() + "- " 
        + getPrecio() + "- "
        + ", " + getNombre() + " esta " + resultado + "-> Esto nutre "
        + this.nutrientes + " gramos."
        ;
    }
}
