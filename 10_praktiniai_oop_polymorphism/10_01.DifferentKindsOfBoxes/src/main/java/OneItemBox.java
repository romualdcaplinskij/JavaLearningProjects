import java.util.ArrayList;

public class OneItemBox extends Box{

    private ArrayList<Item> newBox = new ArrayList<>();
    public OneItemBox(){
    }

    @Override
    public void add(Item item) {
        if (newBox.isEmpty()) newBox.add(item);
    }


    @Override
    public boolean isInBox(Item item) {
        return newBox.contains(item);
    }

}
