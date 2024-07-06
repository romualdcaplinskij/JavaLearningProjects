
import java.util.Objects;
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shall we carry on?");
        String stopWord = scanner.nextLine();
        String stop = "no";
        while (!Objects.equals(stopWord, stop)){
            System.out.println("Shall we carry on?");
            stopWord = scanner.nextLine();
        }
    }
}
