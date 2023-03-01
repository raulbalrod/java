package Ejercicios.Clases;
import Ejercicios.Clases.*;

public class Tienda{
	public Mascota[] Mascotas;
	public String[] Comidas;

	public Tienda(Mascota[] Mascotas, String[] Comidas){
		this.Mascotas = Mascotas;
		this.Comidas = Comidas;
	}

    public Mascota[] getMascotas(){
        return this.Mascotas;
    }

    public void setMascotas(Mascota[] newMascotas){
        this.Mascotas = newMascotas;
    }

    public String[] getComidas(){
        return this.Comidas;
    }

    public void setComidas(String[] newComidas){
        this.Comidas = newComidas;
    }

	@Override
	public String toString(){
		return "(" + this.Mascotas + ", " +  this.Comidas + ")";
	}
}