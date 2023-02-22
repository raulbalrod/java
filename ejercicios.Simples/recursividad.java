

public class recursividad {

    public static int Suma(int numero){
        if(numero == 1){
            return 1;
        }else{
            int res= numero + Suma(numero - 1);
            return res;
        }
    }

    public static void main(String[] args) {

        int sumar = Suma(7);
    }
}
