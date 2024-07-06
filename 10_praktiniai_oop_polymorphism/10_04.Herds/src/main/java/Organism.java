public class Organism implements Movable {

    private int dx;
    private int dy;

    public Organism(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }

    @Override
    public void move(int dx, int dy) {
        this.dx += dx;
        this.dy += dy;
    }

    @Override
    public String toString() {
        return "x: " + dx + "; y: " + dy;
    }
}
