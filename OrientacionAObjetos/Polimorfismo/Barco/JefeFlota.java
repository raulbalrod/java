package Polimorfismo.Barco;

public class JefeFlota extends Tripulante {

    public JefeFlota(int id, int edad, int tiempoEmpresa, String nombre) {
        super(id, edad, tiempoEmpresa, nombre);
    }

    @Override
    public double sueldo() {
        return 2000;
    }

    @Override
    public String MostrarDato() {
      
        return "Tripulante [id= " + getId() 
            + ", edad= " + getEdad() 
            + ", TiempoEmpresa= " + getTiempoEmpresa() 
            + ", nombre= " + getNombre()
            + ", sueldo= " + this.sueldo() +
            "]";
    }
}
