package lt.techin.praktinis;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int num1, num2, num3, num4, sum;
        num1 = number%10;
        number /= 10;
        num2 = number%10;
        number /= 10;
        num3 = number%10;
        number /= 10;
        num4 = number%10;
        sum = num1 + num2 + num3 + num4;
        System.out.println(sum);

    }
}
