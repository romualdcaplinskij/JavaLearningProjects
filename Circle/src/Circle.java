public class Circle {

    private double radius;
    private String color;

    public Circle(){
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius){
        this.radius = radius;
        color = "red";
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }

    public void setColor(String newColor){
        color = newColor;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public String toString(){
        return String.format("The circle has radius %5.2f of and color %s.\n", radius, color);
    }
}
