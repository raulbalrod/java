package HashMap.Ejercicios;

import java.util.Scanner;
import java.util.HashMap;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero con espacios: ");
        String numeros = sc.nextLine();

        String[] numerosSpliteado = numeros.split(" ");

        Integer[] numerosEnteros = new Integer[numerosSpliteado.length];

        for(int i = 0; i < numerosEnteros.length; i++) {
            numerosEnteros[i] = Integer.parseInt(numerosSpliteado[i]);
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < numerosEnteros.length; i++) {
            if(map.containsKey(numerosEnteros[i])) {
                map.put(numerosEnteros[i], map.get(numerosEnteros[i]) + 1);
            }else {
                map.put(numerosEnteros[i], 1);
            }
        }

        System.out.println(map);
        System.out.println(map.entrySet());
    }
}
