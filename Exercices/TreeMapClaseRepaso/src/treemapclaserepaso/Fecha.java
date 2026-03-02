package treemapclaserepaso;

public class Fecha implements Comparable<Fecha> {

    public String fecha;
    public Alumno a;
    public Excursion e;

    public static String k;

    public Fecha(String fecha, Alumno a, Excursion e) {
        this.fecha = fecha;
        this.a = a;
        this.e = e;
        String[] v = fecha.split("/");
        k = v[2] + "/" + v[1] + "/" + v[0];
        this.a.listaExcursion.put(k, this);
        this.e.listaExcursion.put(k, this);
    }

    @Override
    public int compareTo(Fecha otro) {

        int p;

        p = this.fecha.compareTo(otro.fecha);
        if (p == 0) {
            p = 1;
        }

        return p;
    }

}
