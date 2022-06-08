package edu.escuelaing.arem.ASE.app;

import java.io.File;
import java.util.Scanner;

/**
 * Clase que cuenta lineas fisicas o de codigo de un archivo o directorio
 */
public class CountLoc {

    /**
     * Método main que imprimirá el número de líneas del archivo o directorio
     * 
     * @param args 'phy' para líneas físicas y 'loc' para líneas de código
     * @throws Exception
     */
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

    /**
     * Método que contará las líneas en caso de ser un directorio
     * 
     * @param dir  directorio a buscar
     * @param tipo 'phy' p 'loc'
     * @return número de líneas en el directorio
     * @throws Exception
     */
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

    /**
     * Método que contará las líneas en caso de ser un archivo
     * 
     * @param archivo archivo a contar líneas
     * @param tipo    'phy' o 'loc'
     * @return número de líneas en el archivo
     * @throws Exception
     */
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