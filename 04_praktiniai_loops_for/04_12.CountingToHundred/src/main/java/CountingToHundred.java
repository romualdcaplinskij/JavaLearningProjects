
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNum = scanner.nextInt();
        for(int i = 100;givenNum <= i; givenNum++){
            System.out.println(givenNum);
        }
    }
}
