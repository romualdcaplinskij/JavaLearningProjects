import java.lang.reflect.Member;

public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money a = new Money(10, 0);
        Money b = new Money(5,0);
        Money c = a.plus(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Money a1 = new Money(10,0);
        Money b1 = new Money(3, 0);
        Money c1 = new Money(5,0);

        System.out.println(a1.lessThan(b1));
        System.out.println(b1.lessThan(c1));

        System.out.println(a1.minus(c1));
        System.out.println(b1.minus(c1));
    }
}
