package hashmappartido;

public class Gol {

    public int minuto;
    public Jugador j;
    public Partido p;

    public static int k = 0;

    public Gol(int minuto, Jugador j, Partido p) {
        this.minuto = minuto;
        this.j = j;
        this.p = p;
        j.listaGol.put(k, this);
        p.listaGol.put(k, this);
        k += 1;
    }

}
