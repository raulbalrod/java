package Ejercicios.Clases;

public class Monitor {
    public String marca;
    public double pulgadas;
    public String dimensiones;
    public int hz;
    public String color;

    public Monitor(String marca, double pulgadas, String dimensiones, 
    int hz, String color){
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.dimensiones = dimensiones;
        this.hz = hz;
        this.color = color;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String newMarca){
        this.marca = newMarca;
    }

    public double getPulgadas(){
        return this.pulgadas;
    }

    public void setPlgadas(double newPulgadas){
        this.pulgadas = newPulgadas;
    }

    public String getDimensiones(){
        return this.dimensiones;
    }

    public void setDimensiones(String newDimensiones){
        this.dimensiones = newDimensiones;
    }

    public int getHz(){
        return this.hz;
    }

    public void setHz(int newHz){
        this.hz = newHz;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    @Override
    public String toString(){
        return "[" + this.marca + ", " + this.hz + ", " +
        this.dimensiones + ", " + this.color + ", " + this.pulgadas +"]";
    }
}
