import java.util.ArrayList;

public class MisplacingBox extends Box {

    private ArrayList<Item> newBox = new ArrayList<>();
    public MisplacingBox(){
    }

    @Override
    public void add(Item item) {
        newBox.add(item);
    }


    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
