
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum, secondNum;
        System.out.println("Give the first number:");
        firstNum = Integer.parseInt(scan.nextLine());
        System.out.println("Give the second number:");
        secondNum = Integer.parseInt(scan.nextLine());
        if (firstNum > secondNum) {
            System.out.println("Greater number is: " + firstNum);
        } else if (firstNum < secondNum){
            System.out.println("Greater number is: " + secondNum);
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}
