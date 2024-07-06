
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true){
            System.out.println("Give a number:");
            int givenNum = Integer.parseInt(scanner.nextLine());
            if (givenNum < 0){
                count += 1;
            } else if (givenNum > 0){
                continue;
            } else {
                System.out.println("Number of negative numbers: " + count);
                break;
            }
        }
    }
}
