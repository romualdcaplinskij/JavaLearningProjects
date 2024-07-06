package lt.techin.praktinis;

public class CupsCalculator {

    public void calculateCups(int numberOfCups) {
        int box = numberOfCups / 3;
        int cupsLeft = numberOfCups % 3;
        System.out.println("Dėžių: " + box);
        System.out.println("Liko puodelių: " + cupsLeft);
    }

}
