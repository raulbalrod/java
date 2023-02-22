package OrientacionAObjetos.Clases;

public class DNI {
    public int numero;
    public String letra;

    public DNI(){
        this.numero = 0;
        this.letra = "";
    }

    public String leerDNI(int numero){
        int resultado = 0;
        this.numero = numero;

        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", 
                            "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        resultado = numero % 23;

        return letras[resultado];
    }

    @Override
    public String toString(){
        return this.numero + "-" + leerDNI(this.numero);
    }
}
