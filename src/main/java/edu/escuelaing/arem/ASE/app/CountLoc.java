package edu.escuelaing.arem.ASE.app;
import java.io.File;
import java.util.Scanner;

/**
 * Clase que cuenta lineas
 */
public class CountLoc 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Tipo de lineas: " + args[0]);
        System.out.println( "Archivo: " + args [1]);
        File documento = new File(args[1]);
        Scanner obj = new Scanner(documento);
        int contador = 0; 
        if (args[0].equals("phy")){
            while (obj.hasNextLine()){
                contador ++;
                obj.nextLine();
            }
        }else if (args[0].equals("loc")){
            while (obj.hasNextLine()){
                String linea = obj.nextLine();
                if (!linea.isEmpty() && !linea.strip().startsWith("/") && !linea.strip().startsWith("*")){
                    contador ++;
                }
            }
        } else {
            throw new Exception("El primer argumento solo puede ser 'phy' o 'loc'");
        }
        System.out.println("Número de lineas: " + contador);
        obj.close();
    }
}