package Herencias.Main;

import Herencias.Clases.Electrodomestico.*;
 
public class MainElectrodomesticos{
	public static void main(String[] args){
		Lavadora lavadora1 = new Lavadora("Samsung", 3.4);
		System.out.println(lavadora1);
		
		lavadora1.setprecio(234);
		System.out.println(lavadora1);

		lavadora1.setAguacaliente(true);
		System.out.println(lavadora1);

		double consumo1 = lavadora1.getConsumo(5);
		System.out.println(consumo1);

		double CosteConsumo1 = lavadora1.getCosteConsumo(5, 2);
		System.out.println(CosteConsumo1);
	}
}