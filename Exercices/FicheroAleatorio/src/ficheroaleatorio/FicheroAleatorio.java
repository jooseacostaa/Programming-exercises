package ficheroaleatorio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class FicheroAleatorio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RandomAccessFile fichero = null;

        try {

            // Crear / abrir fichero en modo lectura-escritura
            fichero = new RandomAccessFile(
                    "C:\\Users\\Jose\\Desktop\\enteros.dat",
                    "rw"
            );

            System.out.println("Escribe un número entero:");
            int num = sc.nextInt();

            // Escribir entero en el fichero
            fichero.writeInt(num);

            // Volver al inicio del fichero
            fichero.seek(0);

            // Leer entero
            int leido = fichero.readInt();

            System.out.println("Número leído: " + leido);

            // Cerrar fichero
            fichero.close();

        } catch (FileNotFoundException e) {

            System.out.println("Archivo no encontrado");

        } catch (IOException e) {

            System.out.println("Error de entrada/salida: " + e.getMessage());

        } finally {

            sc.close();

        }

    }
}
