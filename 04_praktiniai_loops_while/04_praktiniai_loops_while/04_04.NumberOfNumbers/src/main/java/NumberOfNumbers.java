
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Give a number:");
        int givenNum = Integer.parseInt(scanner.nextLine());
        while (givenNum != 0){
            count += 1;
            System.out.println("Give a number:");
            givenNum = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Number of numbers: " + count);
    }
}
