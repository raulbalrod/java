import Ejercicios.Clases.*;

public class camisetas{
	public static void main(String[] args){
		Camiseta camiseta = new Camiseta('L');

        Persona persona = new Persona('L', camiseta);

        persona.ponerCamiseta(camiseta);

        if(persona.probarCamiseta()){
            System.out.println("Me está bien la camiseta");
        }else{
            System.out.println("Me quito la camiseta");
            persona.quitarCamiesta();
        }
	}
}
