package OrientacionAObjetos.Clases;

import java.util.ArrayList;
import OrientacionAObjetos.*;

public class Equipo{
	public String Nombre;
	ArrayList<Mascota> mascotas;
	public Equipo(String Nombre, ArrayList<Mascota> mascotass){
		this.Nombre = Nombre;
        this.mascotas = mascotas;
	}

	public String getNombre(){
        return this.Nombre;
    }

	public void setNombre(String NewNombre){
        this.Nombre = NewNombre;
    }

	public boolean addMascota(Mascota mascota){
		if(mascotas.size() < 5){
			return mascotas.add(mascota);
		}
		return false;
	}

	public boolean removeMascota(Mascota mascota){
		if(mascotas.size() > 0){
			return mascotas.remove(mascota);
		}
		return false;
	}

	public Mascota getNextMascota(){
		return mascotas.remove(0);
	}

	@Override
	public String toString(){
		return "(" + this.Nombre + ")";
	}
}