
public class Statistics {

    private int count;
    private int sum;
    private int sumEven;
    private int sumOdd;

    public Statistics(){
        count = 0;
        sum = 0;
        sumEven = 0;
        sumOdd = 0;
    }

    public void addNumber(int number){
        count += 1;
        sum += number;
        if (number% 2 == 0) sumEven += number;
         else sumOdd += number;
    }

    public int getCount(){
        return count;
    }

    public int sum(){
        return sum;
    }

    public int getSumEven(){
        return sumEven;
    }

    public int getSumOdd(){
        return sumOdd;
    }

    public double average() {

        if (count != 0) {

            return (double) sum / count;
        }
        return 0;
    }
}
