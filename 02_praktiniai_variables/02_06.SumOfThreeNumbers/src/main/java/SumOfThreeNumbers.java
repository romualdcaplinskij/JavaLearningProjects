
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum, secondNum, thirdNum, sumOfNums;
        System.out.println("Give the first number:");
        firstNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        secondNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the third number:");
        thirdNum = Integer.parseInt(scanner.nextLine());
        sumOfNums = firstNum + secondNum + thirdNum;
        System.out.println("The sum of the numbers is " + sumOfNums);
    }
}
