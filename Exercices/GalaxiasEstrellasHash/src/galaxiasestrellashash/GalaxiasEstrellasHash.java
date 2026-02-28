package galaxiasestrellashash;

import java.util.HashSet;

public class GalaxiasEstrellasHash {

    public static int azar() {
        return (int) (Math.random() * 27);
    }

    public static String generarGalaxia() {
        String[] letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ".split("");
        return letras[azar()] + letras[azar()] + letras[azar()];
    }

    public static String generarEstrella() {
        String[] letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ".split("");
        return letras[azar()] + letras[azar()] + letras[azar()] + letras[azar()] + letras[azar()];
    }

    public static void main(String[] args) {

        HashSet<String> galaxia = new HashSet<>();

        while (galaxia.size() < 10000) {
            galaxia.add(generarGalaxia());
        }

    }

}
