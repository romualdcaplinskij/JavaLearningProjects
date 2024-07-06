
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true){
            System.out.println("Give a number:");
            int givenNum = Integer.parseInt(scanner.nextLine());
            if (givenNum != 0){
                sum += givenNum;
                count += 1;
            } else {
                System.out.println("Number of numbers: " + count);
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
        }
    }
}
