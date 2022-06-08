package edu.escuelaing.arem.ASE.app;

import java.io.File;
import java.util.Scanner;

/**
 * Clase que cuenta lineas
 */
public class CountLoc {
    public static void main(String[] args) throws Exception {
        File documento = new File(args[1]);
        int total = 0;
        if (documento.isDirectory()) {
            total = contadorDir(documento, args[0]);
        } else {
            total = contador(documento, args[0]);
        }
        System.out.println("Existen " + total + " Lineas");
    }

    public static int contadorDir(File dir, String tipo) throws Exception {
        File listFile[] = dir.listFiles();
        int contador = 0;
        for (File file : listFile) {
            if (file.isDirectory()) {
                contador += contadorDir(file, tipo);
            } else {
                contador += contador(file, tipo);
            }
        }
        return contador;
    }

    public static int contador(File archivo, String tipo) throws Exception {
        Scanner obj = new Scanner(archivo);
        int contador = 0;
        if (tipo.equals("phy")) {
            while (obj.hasNextLine()) {
                contador++;
                obj.nextLine();
            }
        } else if (tipo.equals("loc")) {
            while (obj.hasNextLine()) {
                String linea = obj.nextLine();
                if (!linea.isEmpty() && !linea.trim().startsWith("/") && !linea.trim().startsWith("*")) {
                    contador++;
                }
            }
        } else {
            throw new Exception("El primer argumento solo puede ser 'phy' o 'loc'");
        }
        obj.close();
        return contador;
    }
}