
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum, secondNum, result;
        System.out.println("Give the first number:");
        firstNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        secondNum = Integer.parseInt(scanner.nextLine());
        result = firstNum * secondNum;
        System.out.println(firstNum + " * " + secondNum + " = " + result);
    }
}
