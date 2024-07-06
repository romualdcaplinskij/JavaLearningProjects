public class Circle extends Shape {

    private double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(double radius) {
        return Math.PI * this.radius * this.radius;
    }

    public  double getPerimeter(double radius) {
        return Math.PI * this.radius * 2;
    }

    @Override
    public String toString() {
        return "A Circle with color " + super.getColor() + " and " + super.checkFilled() + ".\n"
                + "Size is: radius - " + radius + ", perimeter - " + getPerimeter(this.radius) + ", area - "
                + getArea(this.radius) + "\n-------------------------------------------------------------";
    }
}
