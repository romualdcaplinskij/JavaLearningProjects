public class SimplifiedCircle {
     private double radius;

     public SimplifiedCircle(){
         radius = 1.0;
     }

     public SimplifiedCircle(double radius){
         this.radius = radius;
     }

     public double getRadius(){
         return radius;
    }

    public void setRadius(double newRadius){
         radius = newRadius;
    }

    public double getArea(){
         return radius*radius*Math.PI;
    }

    public double getCircumference(){
         return 2*radius*Math.PI;
    }

    public String toString(){
         return String.format("The circle has radius %5.2f\n", radius);
    }

}
