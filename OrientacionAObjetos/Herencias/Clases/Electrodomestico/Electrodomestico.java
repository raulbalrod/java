package Herencias.Clases.Electrodomestico;

public class Electrodomestico{
    protected String tipo;
    protected String marca;
    protected double potencia;

    public Electrodomestico(String tipo, String marca, double potencia){
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }
    
    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String newTipo){
        this.tipo = newTipo;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String newMarca){
        this.marca = newMarca;
    }

    public double getPotencia(){
        return this.potencia;
    }

    public void setPotencia(double newPotencia){
        this.potencia = newPotencia;
    }

    public double getConsumo(int horas){
         return this.potencia * horas;
    }

    public double getCosteConsumo(int horas, double CosteHora){
       return getConsumo(horas) * CosteHora;
    }

    @Override
    public String toString(){
        return "(" + this.tipo + ", " + this.marca + ", " + this.potencia + ")";
    }
}