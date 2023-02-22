import java.util.ArrayList;

import OrientacionAObjetos.Clases.*;

public class AutoPet{
	public static void main(String[] args){
		ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
		mascotas.add(new Mascota("mascota1", 7, 6));
		mascotas.add(new Mascota("mascota2", 9, 8));

		ArrayList<Mascota> mascotasB = new ArrayList<Mascota>();
		mascotasB.add(new Mascota("mascota1", 7, 6));
		mascotasB.add(new Mascota("mascota2", 9, 8));
		
		Equipo EquipoA = new Equipo("El equipo A", mascotas);
		Equipo EquipoB = new Equipo("El equipo BS", mascotasB);
		
		Mascota m1 = EquipoA.getNextMascota();
		Mascota m2 = EquipoB.getNextMascota();

		System.out.println(mascotas);
		System.out.println(mascotasB);

		fight(m1, m2);
		if(m1.getVida() <= 0) EquipoA.removeMascota(m1);
		if(m2.getVida() <= 0) EquipoB.removeMascota(m2);

		System.out.println(mascotas);
		System.out.println(mascotasB);
	}

	public static Mascota fight(Mascota m1, Mascota m2){
		while(m1.getVida() > 0 && m2.getVida() > 0){
			m1.Atacar(m2);
		}
		if(m1.getVida() > 0){
			return m1;
		}else if(m2.getVida() > 0){	
			return m2;
		}else{
			return null;
		}
	}	
}