
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum, secondNum, resSum, resSub, resMult;
        double resDiv;
        System.out.println("Give the first number:");
        firstNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        secondNum = Integer.parseInt(scanner.nextLine());
        resSum = firstNum + secondNum;
        resSub = firstNum - secondNum;
        resMult = firstNum * secondNum;
        resDiv = (double) firstNum / secondNum;
        System.out.println(firstNum + " + " + secondNum + " = " + resSum);
        System.out.println(firstNum + " - " + secondNum + " = " + resSub);
        System.out.println(firstNum + " * " + secondNum + " = " + resMult);
        System.out.println(firstNum + " / " + secondNum + " = " + resDiv);
    }
}
