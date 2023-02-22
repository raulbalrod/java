import OrientacionAObjetos.Clases.*;
import utilidades.Enumerados.COLORES;

public class MainCoordenadas{

	public static void main(String[] args){
		// getter: get -> añade el primer valor
		// setter: set -> cambia el valor anterior
		
		Punto p = new Punto(3, 5);

		double coordenadaX = p.getX();
		double coordenadaY = p.getY();

		p.setX(79);
		System.out.println(p.toString());

		Pixel p2 = new Pixel(1.0 , 4.5, COLORES.ROJO);

		System.out.println(p2.toSting());
	}
}