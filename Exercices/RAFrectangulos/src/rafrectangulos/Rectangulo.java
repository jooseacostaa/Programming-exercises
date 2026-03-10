package rafrectangulos;

public class Rectangulo {

    int width;
    int height;
    int x;
    int y;

    public Rectangulo(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {

        return "<rect x=\"" + x
                + "\" y=\"" + y
                + "\" width=\"" + width
                + "\" height=\"" + height
                + "\" stroke=\"black\" fill=\"none\"/>\n";
    }

}
