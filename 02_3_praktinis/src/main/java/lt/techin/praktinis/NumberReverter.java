package lt.techin.praktinis;

public class NumberReverter {
    public void revert(int number) {
       int reverse = 0;
       int num1 = number % 10;
       reverse = reverse*10 + num1;
       number /= 10;
       int num2 = number % 10;
       reverse = reverse * 10 + num2;
       number /= 10;
       int num3 = number % 10;
       reverse = reverse * 10 + num3;
        System.out.println(reverse);
    }
}
