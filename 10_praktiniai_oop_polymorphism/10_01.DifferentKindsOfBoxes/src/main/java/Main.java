

public class Main {

    public static void main(String[] args) {
        // You can test your program here
        System.out.println("Implemented BoxWithMaxWeight");
        System.out.println("----------------------------");
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(50);
        coffeeBox.add(new Item("asasd1", 5));
        coffeeBox.add(new Item("asasd2", 10));
        coffeeBox.add(new Item("asasd3", 15));
        coffeeBox.add(new Item("asasd4", 20));
        coffeeBox.add(new Item("asasd5", 25));

        System.out.println(coffeeBox.isInBox(new Item("asasd1")));
        System.out.println(coffeeBox.isInBox(new Item("asasd2")));
        System.out.println(coffeeBox.isInBox(new Item("asasd3")));
        System.out.println(coffeeBox.isInBox(new Item("asasd4")));
        System.out.println(coffeeBox.isInBox(new Item("asasd5")));

        System.out.println();
        System.out.println("Implemented OneItemBox");
        System.out.println("----------------------------");

        OneItemBox box = new OneItemBox();
        box.add(new Item("A, 5"));
        box.add(new Item("B", 0));

        System.out.println(box.isInBox(new Item("A, 5")));
        System.out.println(box.isInBox(new Item("B",0)));


        System.out.println();
        System.out.println("Implemented MisplacingBox");
        System.out.println("----------------------------");

        box.add(new Item("Box1, 5"));
        box.add(new Item("Box2", 0));

        System.out.println(box.isInBox(new Item("Box1, 5")));
        System.out.println(box.isInBox(new Item("Box2",0)));

    }
}
