public class Rectangle extends Shape{

    private double width;
    private double higth;

    public Rectangle() {
        this.width = 1.0;
        this.higth = 1.0;
    }

    public Rectangle(double width, double higth) {
        this.width = width;
        this.higth = higth;
    }

    public Rectangle(String color, boolean filled, double width, double higth) {
        super(color, filled);
        this.width = width;
        this.higth = higth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigth() {
        return higth;
    }

    public void setHigth(double heigth) {
        this.higth = heigth;
    }

    public double getArea(double width, double heigth){
        return this.width * this.higth;
    }

    public double getPerimeter(double width, double heigth){
        return 2*this.width + 2*this.higth;
    }

    @Override
    public String toString() {
        return  "A Rectangle with color " + super.getColor() + " and " + super.checkFilled() + ".\n"
                + "Size is: width - " + getWidth() + ", high - " +getHigth() + " , perimeter - " + getPerimeter(this.width, this.higth) + " , area - "
                + getArea(this.width, this.higth) + "\n-------------------------------------------------------------";
    }
}
