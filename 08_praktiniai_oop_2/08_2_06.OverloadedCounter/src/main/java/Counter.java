public class Counter {

    private int value;

    public Counter(){
        value = 0;
    }

    public Counter(int startValue){
        this.value = startValue;
    }

    public int value(){
        return value;
    }

    public void increase(int increaseBy){
        if (increaseBy > 0) value += increaseBy;
    }

    public void decrease(int decreaseBy){
        if (decreaseBy > 0)
            if ((value - decreaseBy) > 0) value -= decreaseBy;
    }

}