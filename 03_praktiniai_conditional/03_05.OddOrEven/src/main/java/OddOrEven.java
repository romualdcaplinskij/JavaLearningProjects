
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int givenNum = Integer.parseInt(scan.nextLine());
        if (givenNum%2 == 0){
            System.out.printf("Number %d is even", givenNum);
        } else {
            System.out.printf("Number %d is odd", givenNum);
        }
    }
}
