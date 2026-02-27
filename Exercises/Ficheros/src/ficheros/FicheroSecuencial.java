package ficheros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FicheroSecuencial {

    public static void main(String[] args) {

        // Declarar objetos de archivo
        DataOutputStream archivo = null;
        DataInputStream fich = null;

        String nombre;
        int edad;

        try {

            // Crear o abrir fichero para escribir
            // false → sobrescribe
            // true  → añade al final
            archivo = new DataOutputStream(
                    new FileOutputStream(
                            "C:\\Users\\Jose\\Desktop\\secuencial.dat",
                            false
                    )
            );

            // Escribir datos
            archivo.writeUTF("aaaaaaaaaaaaaaaaaaaaaaaaaa   ");
            archivo.writeInt(33);

            archivo.writeUTF("Pedro Piqueras Peñaranda");
            archivo.writeInt(45);

            archivo.writeUTF("José Antonio Ruiz Pérez");
            archivo.writeInt(51);

            // Cerrar fichero de escritura
            archivo.close();

            // Abrir fichero para leer
            fich = new DataInputStream(
                    new FileInputStream("C:\\Users\\Jose\\Desktop\\secuencial.dat")
            );

            // Leer datos en el mismo orden
            nombre = fich.readUTF();
            System.out.println(nombre);

            edad = fich.readInt();
            System.out.println(edad);

            nombre = fich.readUTF();
            System.out.println(nombre);

            edad = fich.readInt();
            System.out.println(edad);

            nombre = fich.readUTF();
            System.out.println(nombre);

            edad = fich.readInt();
            System.out.println(edad);

            // Cerrar fichero de lectura
            fich.close();

        } catch (FileNotFoundException fnfe) {

            System.out.println("Archivo no encontrado");

        } catch (IOException ioe) {

            System.out.println("Error de E/S: " + ioe.getMessage());

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }
}
