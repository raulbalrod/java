package Ejercicios.Clases;

public class Mascota{
	public String Nombre;
	public int Vida;
	public int Ataque;

	public Mascota(String Nombre, int Vida, int Ataque){
		this.Nombre = Nombre;
		this.Vida = Vida;
		this.Ataque = Ataque;
	}

	public String getNombre(){
        return this.Nombre;
    }

	public void setNombre(String NewNombre){
        this.Nombre = NewNombre;
    }

	public int getVida(){
        return this.Vida;
    }
	
	public void setVida(int NewVida){
        this.Vida = NewVida;
    }

	public int getAtaque(){
        return this.Ataque;
    }
	
	public void setAtaque(int NewAtaque){
        this.Ataque = NewAtaque;
    }

	public void Atacar(Mascota Mascota) {
		this.Vida = this.Vida - Mascota.Ataque; 
		this.Vida = Mascota.Ataque - this.Vida; 
	}

	@Override
	public String toString(){
		return "(" 
		+ this.Nombre + ", " 
		+ this.Ataque + ", " 
		+ this.Vida + 
		")";
	}
}