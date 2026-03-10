package rafalumnos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFalumnos {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        RandomAccessFile f = new RandomAccessFile("C:\\Users\\cipot\\Desktop\\alumnos.dat", "rw");

        for (int t = 0; t < 10; t += 1) {

            int id = t;
            int edad = 18 + (int) (Math.random() * 10);
            double nota = 5 + Math.random() * 5;

            f.writeInt(id);
            f.writeInt(edad);
            f.writeDouble(nota);

        }

        f.close();

        f = new RandomAccessFile("C:\\Users\\cipot\\Desktop\\alumnos.dat", "r");

        while (f.getFilePointer() < f.length()) {

            int id = f.readInt();
            int edad = f.readInt();
            double nota = f.readDouble();

            System.out.println("Alumno: " + id + " Edad:" + edad + " Nota: " + nota);

        }

        f.close();

        //cambiar nota de un alumno
        f = new RandomAccessFile("C:\\Users\\cipot\\Desktop\\alumnos.dat", "rw");

        int posicion = (5) * 16;
        f.seek(posicion);

        int id = f.readInt();
        int edad = f.readInt();
        double nota = f.readDouble();

        System.out.println("--------------------");
        System.out.println("Alumno: " + id + " Edad:" + edad + " Nota: " + nota);

        f.seek(posicion + 8);

        f.writeDouble(9.5);

        f.seek(posicion);

        //vuelvo a leer
        id = f.readInt();
        edad = f.readInt();
        nota = f.readDouble();

        System.out.println("--------------------");
        System.out.println("Alumno: " + id + " Edad:" + edad + " Nota: " + nota);
        System.out.println("--------------------");

        f.close();

        //saber cuantos registros hay en el fichero
        f = new RandomAccessFile("C:\\Users\\cipot\\Desktop\\alumnos.dat", "r");

        int numAlumnos = (int) (f.length() / 16);

        System.out.println("Número de alumnos: " + numAlumnos);

        f.close();

    }

}
