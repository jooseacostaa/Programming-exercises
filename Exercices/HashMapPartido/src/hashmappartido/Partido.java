package hashmappartido;

import java.util.HashMap;

public class Partido {

    public String titulo;

    HashMap<Integer, Gol> listaGol = new HashMap<>();

    public Partido(String titulo) {
        this.titulo = titulo;
        this.listaGol = new HashMap<>();
    }

}
