
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int seconds = 86400;
        int days, result;
        System.out.println("How many days would you like to convert to seconds?");
        days = Integer.parseInt(scanner.nextLine());
        result = days * seconds;
        System.out.println(result);
    }
}
