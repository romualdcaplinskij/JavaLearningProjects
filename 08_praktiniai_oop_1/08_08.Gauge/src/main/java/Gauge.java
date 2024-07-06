public class Gauge {

    private int value;

    public Gauge(){
        value = 0;
    }

    public void increase(){
        if (value < 5){
            value += 1;
        }

    }

    public void decrease(){
        if (value > 0){
            value -= 1;
        }
    }

    public int value(){
        return value;
    }

    public boolean full(){
        boolean full = false;
        if (value == 5){
            full = true;
        }
        return full;
    }
}
