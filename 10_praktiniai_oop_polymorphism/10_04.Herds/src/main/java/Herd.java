import java.util.ArrayList;

public class Herd implements Movable {


    private ArrayList<Movable> herd = new ArrayList<>();

    public Herd() {

    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }


    @Override
    public void move(int dx, int dy) {
        for (Movable movable : herd) {
            movable.move(dx, dy);
        }
    }


    @Override
    public String toString() {
        return herd.toString();
    }
}
