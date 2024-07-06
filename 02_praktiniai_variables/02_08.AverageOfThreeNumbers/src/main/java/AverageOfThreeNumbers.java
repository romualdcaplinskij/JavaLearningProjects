
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum, secondNum, thirdNum;
        double result;
        System.out.println("Give the first number:");
        firstNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        secondNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the third number:");
        thirdNum = Integer.parseInt(scanner.nextLine());
        result = (double) (firstNum + secondNum + thirdNum)/3;
        System.out.println("The average is " + result);
    }
}
