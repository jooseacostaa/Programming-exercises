package treemapclaserepaso;

import java.util.TreeMap;

public class Alumno extends Persona {

    public int id;
    public TreeMap<String, Fecha> listaExcursion;

    public Alumno(int id, String nombre) {
        super(nombre);
        this.id = id;
        this.listaExcursion = new TreeMap<>();
    }

    public void mostrarExcursiones() {

        this.listaExcursion.forEach((k, v) -> {
            System.out.println(v.a.nombre + " :fecha " + v.fecha);
        });

    }

}
