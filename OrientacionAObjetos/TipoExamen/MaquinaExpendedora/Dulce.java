package TipoExamen.MaquinaExpendedora;

public class Dulce extends Comida {
    // Variables
    private double grasas;

    // Constructors
    public Dulce(String nombre, String codigo, double precio, double grasas) {
        super(nombre, codigo, precio);
        this.grasas = grasas;
    }

    // Getters & setters
    public double getGrasas() {
        return grasas;
    }
    public void setGrasas(double grasas) {
        this.grasas = grasas;
    }

    // Metodos
    public void setCaducado(boolean caducado) {
        throw new UnsupportedOperationException("Unimplemented method 'setCadudcado'");
    }

    public String usar() {
        return "Me tomo " + getNombre() + "y me nutro " + this.grasas + "gramos.";
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

        return "Dulce -> " 
        + getNombre() + "- " 
        + getCodigo() + "- " 
        + getPrecio() + "- "
        + ", " + getNombre() + " esta " + resultado + "-> Esto engorda "
        + this.grasas + " gramos."
        ;
    }
    
}
