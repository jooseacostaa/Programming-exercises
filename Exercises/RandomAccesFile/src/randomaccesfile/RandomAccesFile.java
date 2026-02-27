package randomaccesfile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccesFile {

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

    public static void agregar(String fichero, String texto) {
        try {
            RandomAccessFile f = new RandomAccessFile(fichero, "rw");
            f.seek(f.length());
            String s = texto;
            f.writeBytes(s);
            f.close();

        } catch (IOException ex) {
        }
    }

    public static void main(String[] args) {

        try {
            RandomAccessFile f = new RandomAccessFile("texto.txt", "rw");
            String s = "En un lugar de Las Palmas";
            f.writeBytes(s);
            f.close();

        } catch (IOException ex) {
        }

        mostrar("texto.txt");

        //AÑADE "DE GRAN CANARIA" Y MUÉSTRALO CON UN MÉTODO ESTÁTICO
        try {
            RandomAccessFile f = new RandomAccessFile("texto.txt", "rw");
            f.seek(f.length());
            String s = " de Gran Canaria";
            f.writeBytes(s);
            f.close();

        } catch (IOException ex) {
        }

        agregar("texto.txt", "lo que quiera agregar");

        mostrar("texto.txt");

    }

//CREA LOS METODO ESTATICOS AGREGAR(FICHERO,"JKHJKHJKHJKHJKHJKHJKH")
}
