

public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000);
        juice.addToWarehouse(1000);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());
        System.out.println(juice);
        juice.addToWarehouse(1);
        System.out.println(juice);
        System.out.println(juice);
    }

}
