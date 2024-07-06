
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.parseInt(scanner.nextLine());
        while (number != 0){
            if (number > 0){
                int inPower = number * number;
                System.out.println(inPower);
            } else {
                System.out.println("Unsuitable number");
            }
            System.out.println("Give a number:");
            number = Integer.parseInt(scanner.nextLine());
        }

    }
}
