
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int posSum = 0;
        int posCount = 0;
        double avg = 0;
        while(true){
            System.out.println("Give a number: ");
            int givenNum = Integer.parseInt(scanner.nextLine());
            if (givenNum != 0) {
                if (givenNum > 0) {
                    posSum += givenNum;
                    posCount += 1;
                    avg = (double) posSum / posCount;
                }
            } else if (avg == 0){
                System.out.println("Cannot calculate the average");
                break;
            } else {
                System.out.println(avg);
                break;
            }
        }
    }
}
