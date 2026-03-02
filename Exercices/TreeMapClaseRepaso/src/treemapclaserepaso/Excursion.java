package treemapclaserepaso;

import java.util.TreeMap;

public class Excursion {

    public String lugar;
    public TreeMap<String, Fecha> listaExcursion;

    public Excursion(String lugar) {
        this.lugar = lugar;
        this.listaExcursion = new TreeMap<>();
    }

}
