public class CustomTacoBox implements TacoBox{

    public int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }

    @Override
    public int tacosRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        if (tacos > 0) tacos--;
    }

    @Override
    public String toString() {
        return "CustomTacoBox: " + tacos;
    }
}
