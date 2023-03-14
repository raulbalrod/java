package TipoExamen.MaquinaExpendedora;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Articulo> articulos = new ArrayList<Articulo>();
        
        MaquinaExpendedora maquina = new MaquinaExpendedora(articulos);
        maquina.load();

        maquina.start();
    }
}
