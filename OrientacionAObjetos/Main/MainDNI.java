import OrientacionAObjetos.Clases.*;

public class MainDNI{
	public static void main(String[] args){
		DNI dni = new DNI();
		
		String letra = dni.leerDNI(29533049);

		System.out.println(dni);
	}
}