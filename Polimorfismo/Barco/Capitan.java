package Polimorfismo.Barco;

public class Capitan extends Tripulante{

    public Capitan(int id, int edad, int TiempoEmpresa, String nombre) {
        super(id, edad, TiempoEmpresa, nombre);
        
    }

    @Override
    public double sueldo() {
        return 1000 + super.getTiempoEmpresa();
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
