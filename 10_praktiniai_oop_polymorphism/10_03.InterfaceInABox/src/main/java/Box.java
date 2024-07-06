import java.util.ArrayList;

public class Box implements Packable {

    private double maxWeight;
    private int count;
    private ArrayList<Packable> newBox = new ArrayList<>();

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void add(Packable item) {

        if (weight() + item.weight() <= maxWeight) {
            newBox.add((Packable) item);
            count();
        }
    }

    public int count(){
        return count++;
    }


    public double weight() {
        double weight = 0;
        for (Packable i : newBox) {
            weight += i.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + count + " items, total weight " + weight() + " kg";
    }
}