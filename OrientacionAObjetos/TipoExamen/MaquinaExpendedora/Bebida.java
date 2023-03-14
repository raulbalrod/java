package TipoExamen.MaquinaExpendedora;

public class Bebida extends Articulo implements Alimento {
    // Variables
    private boolean caducado;
    private double nutrientes;
    private double grasas;

    // Constructor
    public Bebida(String nombre, String codigo, double precio, double nutrientes, double grasas) {
        super(nombre, codigo, precio);
        this.nutrientes = nutrientes;
        this.grasas = grasas;
    }

    // Metodos
    @Override
    public boolean isCaducado() {
        this.caducado = true;
        return caducado;
    }

    @Override
    public void setCaducado(boolean caducado) {
        this.caducado = caducado;
    }

    public boolean caducar() {
        int probabilidadCaducar = (int) (Math.random() * 100); 

        if (probabilidadCaducar <= 25) {
            return true;
        } else {
            return false;
        }
    }

    public String usar() {
        return "Me tomo el " + getNombre() + 
        ", me nutro " + this.nutrientes + 
        "gramos y engordo " + this.grasas + 
        "gramos."
        ;
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

        return "Comida -> " 
        + getNombre() + "- " 
        + getCodigo() + "- " 
        + getPrecio() + "- "
        + ", " + getNombre() + "esta " + resultado   
        ;
    }
    
}
