public class Square extends Rectangle{

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setHigth(side);
    }

    @Override
    public String toString() {
        return  "A Square with color " + super.getColor() + " and " + super.checkFilled() + ".\n"
                + "Size is: side - " + getSide() + ", perimeter - " + getPerimeter(getSide(), getSide()) + ", area - "
                + getArea(getSide(),getSide()) + "\n-------------------------------------------------------------";
    }
}
