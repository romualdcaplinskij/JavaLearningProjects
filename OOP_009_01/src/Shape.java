public class Shape {

    private String color;
    private boolean filled;

    public Shape(){
        this.color = "Transparent";
        this.filled = false;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String checkFilled(){
        return filled ? "filled" : "not filled";
    }

    @Override
    public String toString() {
        return "A shape with color " + color + "and " + checkFilled();
    }
}
