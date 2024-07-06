
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String someString = scan.nextLine();
        System.out.println("Give an integer:");
        int someInt = Integer.parseInt(scan.nextLine());
        System.out.println("Give a double:");
        double someDouble = Double.parseDouble(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean someBool = Boolean.parseBoolean(scan.nextLine());
        System.out.println("You gave the string " + someString);
        System.out.println("You gave the integer " + someInt);
        System.out.println("You gave the double " + someDouble);
        System.out.println("You gave the boolean " + someBool);
    }
}
