import Ejercicios.Clases.*;

public class Cafe{
	public static void main(String[] args){
		Cafetera cafe = new Cafetera(170);

		System.out.println(cafe.servirTaza(700));

		System.out.println(cafe.agregarCafe(60));
	}
}