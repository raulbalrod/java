package OrientacionAObjetos.Clases;

public class Carta {
    public int valor;
    public String palo;

    public Carta(int valor, String palo){
        this.valor = valor;
        this.palo = palo;
    }
    
    public Carta() {
    }

    // valor
    public int getValor(){
        return this.valor;
    }

    // palo
    public String getPalo(){
        return this.palo;
    }
}
