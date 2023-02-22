package Polimorfismo.Barco;

public class Marinero extends Tripulante{
    private int Captura;

    public Marinero(int id, int edad, int tiempoEmpresa, String nombre, int Captura) {
        super(id, edad, tiempoEmpresa, nombre);
        this.Captura = Captura;
    }
    
    public int getCaptura() {
        return this.Captura;
    }

    public void setCaptura(int newCaptura) {
        this.Captura = newCaptura;
    }

    @Override
    public double sueldo() {
        return 900 + this.getCaptura();
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
