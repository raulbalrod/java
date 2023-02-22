import javax.imageio.ImageIO;

public class EjerciciosCortos {




    public static void main(String[] args) {
        int[] array = new int[10];

        int[] fila = new int[100];

        double[] columna = new double[100];

        int[][] matriz = new int[8][10];

        int[] primo = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23};

        //Rellenar array
        int[][] pares = {{2,4,6}, {8,10,12}, {14,16,18}};

        //Comparar dos cadenas de texto sin tener en cuenta la mayusculas y miniusculas
        String [] Letras1 = {"hola"};
        String [] Letras2 = {"hola"};
        if(Letras1[0].equalsIgnoreCase(Letras2[0])){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintos");
        }


        //Metodo  para sustituir algo de un String 
        String letra3 = "Hola Mundo";
        String letra4 = letra3.replace(" ", "");
        System.out.println(letra4);


        //Comparar dos cadenas de texto segun el numero de caracteres 
        int numeros = Letras1[0].length();
        if(Letras1.length == Letras2.length){
            System.out.println("La longitud de la cadena son iguales " + numeros);
        }

        String letras5 = Letras1[0] + Letras2[0] + letra3;
        System.out.println(letras5);


        //Indica Si contine algun caracter especifico en el string
        boolean res = true;
        letra3.contains("C");


        //Reemplazar una letra de un String por otro caracter 
        String reemplazo = letra3.replace("o", "$");
        System.out.println(reemplazo);

        //Rellenar el array con impares 
        int[] impares = new int[10];
        int numero = 1;
        for(int i = 0; i < impares.length; i++){
            impares[i]= numero + 2;       
        }

        //Saber si un array tiene algun numero
        for(int i = 0 ; i < impares.length; i++){
            if(impares[i] == 0){
                res = false;
            }

        }

        // Variable con el valor del array en la posicion 6
        int numero2 = impares[5];
    }
}
