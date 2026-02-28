package ejerciciofichero;

import java.io.IOException;
import java.io.RandomAccessFile;

public class EjercicioFichero {

    public static void mostrar(String fichero) {
        //MOSTRAR CONTENIDO
        try {
            RandomAccessFile f = new RandomAccessFile(fichero, "rw");
            int k = 0;
            while (k < f.length()) {
                f.seek(k);
                System.out.print((char) f.readByte());
                k++;
            }
            System.out.println("");
            f.close();

        } catch (IOException ex) {
        }
    }

    public static void main(String[] args) throws IOException {

        Alumno a = new Alumno("56774321S", "JUAN AFONSO AFONSO", "H", "01/01/2001");

        try {
            RandomAccessFile f = new RandomAccessFile("C:", "rw");
            f.seek(f.length() - 11);
            f.writeBytes(a.toString());
            f.close();

        } catch (IOException ex) {
        }

        mostrar("C:");

    }

}
