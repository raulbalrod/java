package Ejercicios.Clases;

public class Cafetera {
    public int CapacidadMaxima;
    public int CapacidadActual;

    public Cafetera(){
        this.CapacidadMaxima = 1000;
        this.CapacidadActual = 0;
    }
    
    public Cafetera(int CapacidadMaxima){
        this.CapacidadMaxima = CapacidadMaxima;
        this.CapacidadActual = CapacidadMaxima;
    }

    public int getCapacidadMaxima(){
        return this.CapacidadMaxima;
    }

    public void setCapacidadMaxima(int newCapacidadMaxima){
        this.CapacidadMaxima = newCapacidadMaxima;
    }

    public int getCapacidadActual(){
        return this.CapacidadActual;
    }

    public void setCapacidadActual(int newCapacidadActual){
        this.CapacidadActual = newCapacidadActual;
    }

    public void llenarCafetera(){   
        this.CapacidadActual = this.CapacidadMaxima;
    }

    public int servirTaza(int taza){
        if(this.CapacidadActual >= taza){
            taza = this.CapacidadMaxima - taza;

        }else{
           this.vaciarCafetera();
        }

        return taza;
    }

    public void vaciarCafetera(){
        this.CapacidadActual = 0;
    }

    public int agregarCafe(int cantidad){
        int resultado = cantidad;

        if(this.CapacidadActual + cantidad <= this.CapacidadMaxima){
            this.llenarCafetera();
        }else{
            resultado = this.CapacidadMaxima - this.CapacidadActual;

            this.CapacidadActual = this.CapacidadMaxima;
        }

        return resultado;
    }

}
