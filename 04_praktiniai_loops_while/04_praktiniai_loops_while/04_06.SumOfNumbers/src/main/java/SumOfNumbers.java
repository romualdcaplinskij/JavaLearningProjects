
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Give a number:");
            int givenNum = Integer.parseInt(scanner.nextLine());
            if (givenNum != 0){
                sum += givenNum;
            } else {
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
        }
    }
}
