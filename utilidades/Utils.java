package utilidades;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Utils 
{
    public static String[] LeerFichero(String rutaFichero) throws FileNotFoundException, IOException 
    { 
        String cadena; 

        FileReader f = new FileReader(rutaFichero);

        int numeroLineas = ContarNumeroLineas(rutaFichero);
        BufferedReader b = new BufferedReader(f); 
        String[] resultado = new String[numeroLineas];

        int indice = 0;
        while((cadena = b.readLine())!=null) 
        { 
            resultado[indice] = cadena;
            indice++;
        }

        b.close();

        return resultado; 
    }

    public static boolean ComprobarNumeroExisteEnArray(int[] numerosPresionados,
        int numero)
    {
        boolean resultado = false;

        for(int indice = 0; indice < numerosPresionados.length; indice++)
        {
            if(numerosPresionados[indice] == numero )
            {
                resultado = true;
                break;
            }
        }

        return resultado;
    }

    public static int[] InsertarNumeroEnArray(int[] array, int nuevoNumero)
    {
        int i;

        for (i = 0; i < array.length; i++)
        {
            if(array[i] == 0)
            {
                array[i] = nuevoNumero;
                break;
            }
        }

        return array;
    }

    public static int[] ObtenerNumerosRelacionados(int numero)
    {
        int[] resultado = new int[4];
        
        if(numero == 1)
        {
            resultado[0] = 2;
            resultado[1] = 3;
            resultado[2] = 4;
            resultado[3] = 7;
        }
        else if(numero == 2)
        {
            resultado[0] = 1;
            resultado[1] = 3;
            resultado[2] = 5;
            resultado[3] = 8;
        }
        else if(numero == 3)
        {
            resultado[0] = 1;
            resultado[1] = 2;
            resultado[2] = 6;
            resultado[3] = 9;
        }
        else if(numero == 4)
        {
            resultado[0] = 1;
            resultado[1] = 5;
            resultado[2] = 6;
            resultado[3] = 7;
        }
        else if(numero == 5)
        {
            resultado[0] = 2;
            resultado[1] = 4;
            resultado[2] = 6;
            resultado[3] = 8;
        }
        else if(numero == 6)
        {
            resultado[0] = 3;
            resultado[1] = 4;
            resultado[2] = 5;
            resultado[3] = 9;
        }
        else if(numero == 7)
        {
            resultado[0] = 1;
            resultado[1] = 4;
            resultado[2] = 8;
            resultado[3] = 9;
        }
        else if(numero == 8)
        {
            resultado[0] = 2;
            resultado[1] = 5;
            resultado[2] = 7;
            resultado[3] = 9;
        }
        else
        {
            resultado[0] = 3;
            resultado[1] = 6;
            resultado[2] = 7;
            resultado[3] = 8;
        }

        return resultado;
    }
    
    private static int ContarNumeroLineas(String rutaFichero) throws IOException {
        LineNumberReader reader = null;

        try 
        {
            FileReader file = new FileReader(rutaFichero); 

            reader = new LineNumberReader(file);

            while ((reader.readLine()) != null);

            return reader.getLineNumber();
        } catch (Exception ex) 
        {
            return -1;
        } finally 
        { 
            if(reader != null) 
                reader.close();
        }
    }
}
