package hashmappartido;

import java.util.HashMap;

public class Jugador {

    public String nombre;

    HashMap<Integer, Gol> listaGol = new HashMap<>();

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.listaGol = new HashMap<>();
    }

    public void mostrarGoles() {

        this.listaGol.forEach((k, v) -> {
            System.out.println(v.j.nombre + " : minuto " + v.minuto);
        });

    }

}
