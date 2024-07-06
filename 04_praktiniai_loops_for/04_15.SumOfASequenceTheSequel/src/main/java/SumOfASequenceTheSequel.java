
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum, lastNum;
        int sum = 0;
        System.out.println("First number?");
        firstNum = scanner.nextInt();
        System.out.println("Last number?");
        lastNum = scanner.nextInt();
        for (; firstNum <= lastNum; firstNum++){
            sum += firstNum;
        }
        System.out.println("The sum is: " +sum);
    }
}
