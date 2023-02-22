public class GeneradorDeContraseñas {
    public static void main(String[] args) {
        String contraseña = "";
        int longitud = (int)(Math.random()*16+8);
        int aux = 0;

        for(int i = 1; i<=longitud; i++){
          aux =(int)(Math.random()*126+33);
          contraseña += (char)aux + " ";
        }

        System.out.println(contraseña);
    }
}
