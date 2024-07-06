import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String colors = "Transparent";

        ArrayList<Shape> listOfShapes = new ArrayList<>();
        while (true){
            System.out.print("What shape from Circle, Rectangle or Square to add? ");
            String shapeName = scanner.nextLine();

            if (Objects.equals(shapeName, "Circle")) {
                System.out.println("Enter circle radius: ");
                double radius = Double.parseDouble(scanner.nextLine());

                boolean fillConf = filled();
                if (fillConf) {
                    colors = color();
                }

                listOfShapes.add(new Circle(colors, fillConf, radius));

            } else if (Objects.equals(shapeName, "Rectangle")) {
                System.out.println("Enter width of a rectangle: ");
                double width = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter high of a rectangle: ");
                double higth = Double.parseDouble(scanner.nextLine());

                boolean fillConf = filled();
                if (fillConf) {
                    colors = color();
                }

                listOfShapes.add(new Rectangle(colors, fillConf, width, higth));
            } else if (Objects.equals(shapeName, "Square")) {
                System.out.println("Enter side length of a square: ");
                double side = Double.parseDouble(scanner.nextLine());

                boolean fillConf = filled();
                if (fillConf) {
                    colors = color();
                }

                listOfShapes.add(new Square(colors, fillConf, side));
            } else System.out.println("Shape not found.");
            if (shapeName.isEmpty()) break;
        }

        for (Shape i : listOfShapes) {
            System.out.println(i);
        }

    }

    public static Scanner scanner = new Scanner(System.in);

    static String color(){
        System.out.println("Enter fill color: ");
        return scanner.nextLine();
    }

    static boolean filled(){
        boolean fillConf = false;
        System.out.print("Is your shape filled with color? (yes / no) ");
        String  answer = scanner.nextLine();
        if (Objects.equals(answer, "yes")) {
           fillConf = true;
        }
        return fillConf;
    }
}
