public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle(5.0);
        System.out.printf("The circle has radius %5.2f of and area of %5.2f \n", c1.getRadius(), c1.getArea());

        Circle c2 = new Circle(1.2, "yellow");
        System.out.printf("The circle has radius %5.2f of and area of %5.2f \n", c2.getRadius(), c2.getArea());

        Circle c4 = new Circle();
        c4.setRadius(5.0);
        System.out.println("The radius is: " + c4.getRadius());
        c4.setColor("White");
        System.out.println("The color is: " + c4.getColor());

        System.out.println(c1);
        System.out.println("Operator '+' invokes toString too: " + c2);

        SimplifiedCircle sc1 = new SimplifiedCircle();
        System.out.println(sc1);
        sc1.setRadius(5.0);
        System.out.println("Simplified circle area:" + sc1.getArea());
        System.out.println("Simplified circle circumference: " + sc1.getCircumference());

        Rectangle r1 = new Rectangle();
        System.out.println(r1);

        r1.setLength(3.3f);
        r1.setWidth(5.336f);
        System.out.println(r1.toString());
        System.out.println("Rectangle area is:" + r1.getArea());
        System.out.println("Rectangle perimeter is " + r1.getPerimeter());

        Employee e1 = new Employee(1, "John", "Malcovits", 1200);
        System.out.println(e1);
        e1.raiseSalary(15);
        System.out.println();
        System.out.println("After salary raise.");
        System.out.println("---------------------");
        System.out.println(e1);

        InvoiceItem invoice1 = new InvoiceItem("0001", "Bandele", 2, 0.99);
        System.out.println();
        System.out.println(invoice1);
        System.out.println("Total to pay: " + invoice1.getTotal());

        System.out.println();
        Account acc1 = new Account("0001", "Tomas");
        Account acc2 = new Account("0002", "Jonas", 1200);
        System.out.println(acc1);
        System.out.println(acc2);
        acc2.transferTo(acc1, 200);
        System.out.println(acc1);
        System.out.println(acc2);

        System.out.println();


    }
}
