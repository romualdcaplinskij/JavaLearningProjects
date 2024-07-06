
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int givenNum = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= givenNum; i++){
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }
}
