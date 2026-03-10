package rafrectangulos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFrectangulos {

    public static int azar(int a, int b) {
        return (int) (Math.random() * (b - a + 1)) + a;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Rectangulo[] r = new Rectangulo[1000];

        for (int t = 0; t < r.length; t += 1) {

            int width = azar(20, 200);
            int height = azar(20, 200);
            int x = azar(0, 1920);
            int y = azar(0, 1080);

            r[t] = new Rectangulo(width, height, x, y);

        }

        String contenido = "<!DOCTYPE html>\n";
        contenido += "<html>\n";
        contenido += "<body>\n";
        contenido += "<svg width=\"1920\" height=\"1080\" xmlns=\"http://www.w3.org/2000/svg\">\n";

        for (int t = 0; t < r.length; t += 1) {
            contenido += r[t].toString();
        }

        contenido += "</svg>\n";
        contenido += "</body>\n";
        contenido += "</html>";

        try (RandomAccessFile f = new RandomAccessFile("C:\\Users\\cipot\\Desktop\\rectangulos.html", "rw")) {

            f.writeBytes(contenido);

            f.close();
        }

    }

}
