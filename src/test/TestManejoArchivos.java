
package test;

import manejoArchivos.ManejoArchivos;


public class TestManejoArchivos {
    public static void main(String[] args) {
        String nombreArchivo = "prueba.txt";
//        ManejoArchivos.crearArchivos(nombreArchivo);
//ManejoArchivos.escribirArchivo(nombreArchivo, "Hola desde java  esto es una prueba de escritura desde el matodo test manejo de archivos desde un lenguaje de programacion");
//ManejoArchivos.anexarArchivo(nombreArchivo, "Hola desde java  esto es una prueba de escritura desde el matodo test manejo de archivos desde un lenguaje de programacion");
ManejoArchivos.leerArchivo(nombreArchivo);
    }
}
