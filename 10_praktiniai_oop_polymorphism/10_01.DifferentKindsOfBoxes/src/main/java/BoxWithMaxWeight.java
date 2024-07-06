import java.util.ArrayList;
import java.util.Objects;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> newBox = new ArrayList<>();

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
    }

   public int totalWeight(){
        int totalWeight = 0;
        for (Item i : newBox) {
           totalWeight += i.getWeight();
       }
       return totalWeight;
   }


    @Override
    public void add(Item item) {
        if ((totalWeight() + item.getWeight()) <= capacity) newBox.add(item);
    }


    @Override
    public boolean isInBox(Item item) {
        return newBox.contains(item);
    }

    @Override
    public String toString() {
        return "BoxWithMaxWeight{" +
                "capacity=" + capacity +
                ", newBox=" + newBox +
                '}';
    }
}
