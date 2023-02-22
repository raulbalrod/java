package OrientacionAObjetos.Clases;
import OrientacionAObjetos.Clases.*;

public class Persona {
    public String Nombre;
    public int Edad;
    public char Talla;
    public Camiseta Camiseta;

    public Persona(char Talla, Camiseta Camiseta){
        this.Talla = Talla;
        this.Camiseta = Camiseta;
    }

    public void ponerCamiseta(Camiseta Camiseta){
        this.Camiseta = Camiseta;
    }

    public boolean probarCamiseta(){
        return this.Talla == this.Camiseta.Talla;
    }

    public void quitarCamiesta(){
        this.Camiseta = null;
    }
}
