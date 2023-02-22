package Herencias.Clases.Electrodomestico;

public class Lavadora extends Electrodomestico{
    public double precio;
    public boolean aguacaliente;

    public Lavadora(String marca, double potencia){
        super("Lavadora", marca, potencia);
    }

    public Lavadora(String marca, double potencia, double precio, boolean aguacaliente){
        super("Lavadora", marca, potencia);
        this.precio = 0;
        this.aguacaliente = false;
    }
    
    public double getPrecio(){
        return this.precio;
    }

    public void setprecio(double newPrecio){
        this.precio = newPrecio;
    }

    public boolean getAguacaliente(){
        return this.aguacaliente;
    }

    public void setAguacaliente(boolean newAguacaliente){
        this.aguacaliente = newAguacaliente;
    }

    public void setPotencia(double newPotencia){
        super.potencia = newPotencia;
    }

    public double getConsumo(int horas){
         return super.potencia * horas;
    }

    public double getCosteConsumo(int horas, double CosteHora){
       return getConsumo(horas) * CosteHora;
    }

    @Override
    public String toString(){
        return "(" + 
        super.marca + ", " + 
        this.precio + ", " + 
        super.potencia + ", " + 
        super.tipo + ", " +
        this.aguacaliente +
        ")";
    }
}
