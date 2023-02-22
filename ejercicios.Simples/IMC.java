import java.util.Scanner;

public class IMC {

    public static double CalcularIMC(double masa , double estatura){
        double resultado = masa / (estatura * estatura);
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su masa corporal");
        double masa = sc.nextDouble();

        System.out.println("Ingrese su altura en cm");
        double estatura = sc.nextDouble();

        double masacorporal = CalcularIMC(masa, estatura);
         
        if(masacorporal <= 18.50){
            System.out.println("Tienes IMC bajo");
        }else if(masacorporal >=18.50 || masacorporal <=24.99){
            System.out.println("Tienes IMC normal");
        }else if(masacorporal >=25 || masacorporal <= 29.99){
            System.out.println("Tienes IMC sobrepeso");
        }else if(masacorporal >= 30){
            System.out.println("Tienes IMC obesidad");
        }
       }
    }
