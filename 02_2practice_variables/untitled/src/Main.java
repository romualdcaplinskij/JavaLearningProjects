import java.util.Scanner;

public class Main {

    public static final int MINUTES_IN_YEAR = 525600;
    public static final int MINUTES_IN_DAY = 1440;

    public static void main(String[] args) {
        //miles();
        //minutesToYears();
        //distance();
    }

    private static void distance() {
        Scanner prompt = new Scanner(System.in);
        double x1, y1, x2, y2, result;
        System.out.println("Enter x1:");
        x1 = Double.parseDouble(prompt.nextLine());
        System.out.println("Enter y1:");
        y1 = Double.parseDouble(prompt.nextLine());
        System.out.println("Enter x2:");
        x2 = Double.parseDouble(prompt.nextLine());
        System.out.println("Enter y2:");
        y2 = Double.parseDouble(prompt.nextLine());
        result = Math.hypot((x2-x1), (y2-y1));
        System.out.println("The distance between two points is " + result);
    }

    private static void minutesToYears() {
        Scanner minInput = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        int minutes = Integer.parseInt(minInput.nextLine());
        int years = minutes / MINUTES_IN_YEAR;
        int days = (minutes % MINUTES_IN_YEAR) / MINUTES_IN_DAY;
        System.out.printf("%d minutes is approximately %d years and %d days.", minutes, years, days);
    }

    private static void miles() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter miles:");
        int miles = scanner.nextInt();
        double kilometers = miles * 1.6;
        //System.out.println(miles + " miles is " + kilometers + " kilometers.");
        System.out.printf("%d miles is %.2f kilometers.", miles, kilometers);
    }
}