package hashmappartido;

public class HashMapPartido {

    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Jose");
        Jugador jugador2 = new Jugador("Pedrito");

        Partido partido1 = new Partido("España-Holanda");
        Partido partido2 = new Partido("Alemania-Belgica");

        Gol go1 = new Gol(30, jugador1, partido1);
        Gol gol3 = new Gol(38, jugador1, partido1);

        Gol gol2 = new Gol(90, jugador2, partido2);

        jugador1.mostrarGoles();
        jugador2.mostrarGoles();

    }

}
