package OrientacionAObjetos.Clases;
import utilidades.*;

public class Pixel{
    private double x;
    private double y;
    private Enumerados.COLORES color;

    public  Pixel(double x, double y, Enumerados.COLORES color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public double getX(){
        return this.x;
    }

    public Enumerados.COLORES getColor(){
        return this.color;
    }

    public double getY(){
        return this.y;
    }

    public void setX(double newX){
        this.x = newX;
    }

    public void setY(double newY){
        this.y = newY;
    }

    public void setColor(Enumerados.COLORES newColor){
        this.color = newColor;
    }

    public String toSting(){
        return "(" + this.getX() + ", " + this.getY() + ", " + this.color + ")";
    }
    
}