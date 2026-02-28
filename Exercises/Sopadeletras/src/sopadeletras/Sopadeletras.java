package sopadeletras;

public class Sopadeletras {

    public static int azar(int a, int b) {
        return (int) (Math.random() * (b - a + 1)) + a;
    }

    public static void main(String[] args) {

        char[][] sopa = new char[20][20];

        String letras = "ABCDEFGHIJKLMNOPQRSTUV";

        for (int fila = 0; fila < sopa.length; fila += 1) {

            for (int columna = 0; columna < sopa.length; columna += 1) {

                sopa[fila][columna] = letras.charAt(azar(0, letras.length()-1));
                System.out.print(sopa[fila][columna]+" ");
            }
            System.out.println("");

        }

    }

}
