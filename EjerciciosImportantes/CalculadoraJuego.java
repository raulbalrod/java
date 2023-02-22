
import utilidades.*;
import java.util.Scanner;
import java.util.Arrays;

public class CalculadoraJuego {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NumeroJuagdor1 = 0;
        int NumeroJuagdor2 = 0;
        int contador = 0;
        int[] calculadora = new int [9];
        boolean salida = false;
        int contadorjugador2 = 0;
        int contadorjugador1 = 0;
        
        System.out.println("  ****00**** ");
        System.out.println("Empieza el juego. Elige un numero del (1-9)");
        System.out.println();


        System.out.println("Numero juagdor 1");
        System.out.println("Inserte un numero ");

        NumeroJuagdor1 = sc.nextInt();

        if(1<=NumeroJuagdor1 && NumeroJuagdor1<=9){
            contador = contador +  NumeroJuagdor1;
            Utils.InsertarNumeroEnArray(calculadora, NumeroJuagdor1);
            contadorjugador1 = contador + contadorjugador1;
            System.out.println();
        }else{
            System.out.println("Inserta otro numero: ");
            NumeroJuagdor1 = sc.nextInt();
            contador = contador +  NumeroJuagdor1;
            Utils.InsertarNumeroEnArray(calculadora, NumeroJuagdor1);
            contadorjugador1 = contador + contadorjugador1;

            System.out.println();
        }
        
        do {
            System.out.println("Numero juagdor 2");
            System.out.println("Solo puedes elegir uno de estos numeros " + Arrays.toString(Utils.ObtenerNumerosRelacionados(NumeroJuagdor1)));
            System.out.println();

            
            do {
                System.out.println("Inserte un numero: ");
                NumeroJuagdor2 = sc.nextInt();
                if(1<=NumeroJuagdor2 && NumeroJuagdor2<=9){
                    if(Utils.ComprobarNumeroExisteEnArray(Utils.ObtenerNumerosRelacionados(NumeroJuagdor1), NumeroJuagdor2) == true){
                        if(Utils.ComprobarNumeroExisteEnArray(calculadora, NumeroJuagdor2) == false){
                            contador = contador + NumeroJuagdor2;
                            Utils.InsertarNumeroEnArray(calculadora, NumeroJuagdor2);
                            contadorjugador2 = contador + contadorjugador2;

                            salida = true;

                            if(contadorjugador2 >= 31)
                            {
                                break;
                            }
                        }
                    }
                }
            } while (!salida);
            salida = false;
            System.out.println();


            System.out.println("Numero juagdor 1");
            System.out.println("Solo puedes elegir uno de estos numeros " + Arrays.toString(Utils.ObtenerNumerosRelacionados(NumeroJuagdor2)));
            System.out.println();

            do {
                System.out.println("Inserte un numero: ");
                NumeroJuagdor1 = sc.nextInt();
                if(1<=NumeroJuagdor1 && NumeroJuagdor1<=9){
                    if(Utils.ComprobarNumeroExisteEnArray(Utils.ObtenerNumerosRelacionados(NumeroJuagdor2), NumeroJuagdor1) == true){
                        if(Utils.ComprobarNumeroExisteEnArray(calculadora, NumeroJuagdor1) == false){
                            contador = contador + NumeroJuagdor1;
                            Utils.InsertarNumeroEnArray(calculadora, NumeroJuagdor1);
                            contadorjugador1 = contador + contadorjugador1;
                            System.out.println();

                            salida = true;

                            
                            if(contadorjugador1 >= 31)
                            {
                                break;
                            }
                        }
                    }
                }
            } while (!salida);
            salida = false;
            System.out.println();
            
            
        } while (contadorjugador1 <=31 || contadorjugador2 <= 31);

        if(contadorjugador1 >= 31)
        {
            System.out.println("Ha ganado el juegador 1");
        }
        else
        {
            System.out.println("Ha ganado el juegador 2");
        }
    }
}
