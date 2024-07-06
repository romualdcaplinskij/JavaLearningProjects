
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int sum = 0;
        int count = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        while (true){
            int givenNum = Integer.parseInt(scanner.nextLine());
            if (givenNum != -1){
                sum += givenNum;
                count += 1;
                avg = (double) sum / count;
                if (givenNum%2 == 0){
                    even += 1;
                } else {
                    odd += 1;
                }
            } else {
                System.out.println("Thx! Bye!");
                if(count!=0){
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                System.out.println("Average: " + avg);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);}
                break;
            }
        }
    }
}
