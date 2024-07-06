
import java.util.Objects;
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstString, secondString;
        System.out.println("Enter the firs string");
        firstString = scan.nextLine();
        System.out.println("Enter the second string:");
        secondString = scan.nextLine();
        if (Objects.equals(firstString, secondString)){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
