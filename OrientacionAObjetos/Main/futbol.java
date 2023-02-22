import OrientacionAObjetos.Clases.*;

import java.util.Calendar;
import java.util.Date;

import javax.sound.sampled.SourceDataLine;

public class futbol{
	public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1987);
        calendar.set(Calendar.MONTH, 01);
        calendar.set(Calendar.DATE, 02);

        Date fecha = calendar.getTime();

        Jugador jugador = new Jugador("Piqué", 3, "Defensa", "España", fecha, "F.C Barcelona");

        System.out.println(jugador.toString());
	}
}
