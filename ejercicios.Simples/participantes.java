import java.util.Arrays;
import java.util.Scanner;

public class participantes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] participante = new String [10][5];
        int opcion = 0;
        int datos = 0;
        int lista = 0;
        int mayor = 0;
        double []dorsal = new double [10];
        
        System.out.println("¿Que desea elegir: ");
        System.out.println("1_Inscribir un participante");
        System.out.println("2_Listado por número de dorsal");
        System.out.println("3_Listado Marca 2002");
        System.out.println("4_Finalizar el programa");
        System.out.println();
        System.out.println("Ingrese la opcion");

        opcion = sc.nextInt();

        do {
             if(opcion == 1){

                System.out.println("Introduzca el nombre");
                participante[lista][0] = sc.next();

                System.out.println("Introduzca el dorsal");
                participante[lista][1] = sc.next();

                System.out.println("Mejor marca del 2002");
                participante[lista][2] = sc.next();

                System.out.println("Mejor marca del 2001");
                participante[lista][3] = sc.next();

                System.out.println("Mejor marca del 2000");
                participante[lista][4] = sc.next();

                System.out.println("Has introducido a " + participante[lista][0]);

                lista++;
             }
             System.out.println();

             if(opcion == 2){

                for(int i = 0; i < lista; i++){
                    System.out.println(participante[i][1]);
                }
             }

             if(opcion == 3){

                for(int i = 0; i < lista; i++){
                    mayor = Integer.parseInt(participante[0][2]);
                    if(Integer.parseInt(participante[i][2]) > mayor){
                        mayor = Integer.parseInt(participante[i][2]);
                    }else if(Integer.parseInt(participante[i][2]) < mayor){
                        mayor = mayor;
                    }
                }
                for(int i = 0; i < lista; i++){
                    System.out.println(participante[i][2]);
                }

             }




            System.out.println();
            System.out.println("¿Que desea elegir: ");
            System.out.println("1_Inscribir un participante");
            System.out.println("2_Listado por número de dorsal");
            System.out.println("3_Listado Marca 2002");
            System.out.println("4_Finalizar el programa");
    
            opcion = sc.nextInt();

        } while (opcion != 4);
        System.out.println("¡Gracias por Todo!");
    }
}
