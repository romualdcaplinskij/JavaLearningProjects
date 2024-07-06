public class Rectangle {

    private float length;
    private float width;

    public Rectangle(){
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float length, float width){
        this.length = length;
        this.width  = width;
    }

    public float getLength(){
        return length;
    }

    public void setLength(float newLength){
        length = newLength;
    }

    public float getWidth(){
        return  width;
    }

    public void setWidth(float newLength){
        length = newLength;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*length + 2*width;
    }

    public String toString(){
        return String.format("The rectangle has length %5.2f and %5.2f width.\n", length, width);
    }
}
