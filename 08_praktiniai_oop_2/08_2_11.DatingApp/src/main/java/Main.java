
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(10, 6, 1999);
//        for (int i = 0; i < 365; i++) {
//            date.advance();
//            System.out.println(date);
//        }

        System.out.println(date.afterNumberOfDays(765));
        System.out.println(date.advance(7));


    }
}
